package com.example.practice37_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.practice37_dagger2.classes.MyViewModel
import com.example.practice37_dagger2.classes.ViewModelFactory
import com.example.practice37_dagger2.fragments.MyFragment
import com.example.practice37_dagger2.model.data.GetCoursesResponce
import com.example.practice37_dagger2.model.remote.ApiService
import com.example.practice37_dagger2.repository.MainRepository
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class MyActivity : DaggerAppCompatActivity() {


    @Inject
    lateinit var test: String

//
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//    val viewmodel by lazy{
//        ViewModelProvider(this,  viewModelFactory)
//                .get(MyViewModel::class.java)
//    }


    @Inject
    lateinit var myApiService: ApiService



 //   @Inject
 //   lateinit var myMVVM: MyViewModel

  //  @Inject
  //  lateinit var m: MyFragment

//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//    val viewmodel by lazy{
//        ViewModelProvider(this,  viewModelFactory)
//                .get(MyViewModel::class.java)
//    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)



        Log.i("test_string", test)
    //    Log.i("test_string 2 ", viewmodel.viewModelFunHello())
        myApiService.getCourseList().apply {
            var crs:GetCoursesResponce = this.blockingFirst()
        }



        myApiService.getCourseList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
                Log.i("doOnSubscribe 3 ", it.toString())
            }
            .doAfterTerminate {
                Log.d("doAfterTerminate", "Terminate")

            }
            .subscribe(
                {
                    result ->
                    result.courses?.let {
                        Log.d("courses", it.toString())

                    }
                },
                {
                    Log.d("throwable", it.message.toString())

                }
            )

    }


    fun setupView(){
        val mainRepository = MainRepository(myApiService)
    }

}