package com.example.practice37_dagger2.interfaces

import android.app.Application
import com.example.practice37_dagger2.classes.ActivityBuilderModule
import com.example.practice37_dagger2.classes.MyApplication
import com.example.practice37_dagger2.classes.ViewModelFactoryModule
import com.example.practice37_dagger2.model.remote.ApiClient
import com.example.practice37_dagger2.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class
    ,ActivityBuilderModule::class
    , AppModule::class
    ,ViewModelFactoryModule::class
    , ApiClient::class]
)

interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

}





