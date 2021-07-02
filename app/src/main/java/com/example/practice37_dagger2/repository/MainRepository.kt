package com.example.practice37_dagger2.repository

import android.util.Log
import com.example.practice37_dagger2.model.data.GetCoursesResponce
import com.example.practice37_dagger2.model.remote.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainRepository(apiService: ApiService) {


    var apServ = apiService

    fun getCoursesList():GetCoursesResponce?{

        var crs :GetCoursesResponce?=null

        apServ.getCourseList().subscribeOn(Schedulers.io())
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
                        crs = result

                    }
                },
                {
                    Log.d("throwable", it.message.toString())

                }
            )



        return crs

    }


}