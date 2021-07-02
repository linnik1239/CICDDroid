package com.example.practice37_dagger2.module

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.practice37_dagger2.classes.MyViewModel
import com.example.practice37_dagger2.model.data.GetCoursesResponce
import com.example.practice37_dagger2.model.remote.ApiClient
import com.example.practice37_dagger2.model.remote.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton


@Module
class AppModule {





    companion object{

        @Singleton
        @Provides
        fun someTestString():String{
            return "Hello World"
        }

//        @Singleton
//        @Provides
//        fun provideService(): ApiService {
//
//            return ApiClient.getApiService()
//
//
//
//        }




    }

}