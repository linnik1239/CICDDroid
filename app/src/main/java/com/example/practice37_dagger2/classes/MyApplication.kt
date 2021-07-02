package com.example.practice37_dagger2.classes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practice37_dagger2.interfaces.DaggerAppComponent
import dagger.MapKey
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject
import kotlin.reflect.KClass

class MyApplication:DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }


    // Instead of fragment





//    companion object{
//        @Provides
//        fun someString():String{
//            return "Hello World"
//        }
//    }
}