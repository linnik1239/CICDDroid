package com.example.practice37_dagger2.model.remote

import android.provider.SyncStateContract
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object ApiClient {

//    @Provides
//    @Reusable
//    @JvmStatic
//    fun getRetrofit(): Retrofit {
//       val okHttpClient = OkHttpClient.Builder()
//               .addInterceptor(HttpLoggingInterceptor().apply {
//                   level = HttpLoggingInterceptor.Level.BODY
//               }).build()
//
//
//        val retrofit = Retrofit.Builder()
//                .baseUrl("https://psmobitech.com/fcmdemo/api/index.php/")
//                .client(okHttpClient)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//
//        return retrofit
//    }
//
//    @Provides
//    @Reusable
//    @JvmStatic
//    fun getApiService() = getRetrofit().create(ApiService::class.java)




    /**
     * Provides the Post service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the Post service implementation.
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun providePostApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://psmobitech.com/fcmdemo/api/index.php/")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
    }


}

