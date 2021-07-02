package com.example.practice37_dagger2.classes

import com.example.practice37_dagger2.MyActivity
import com.example.practice37_dagger2.fragments.FragmentBuildersModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = [FragmentBuildersModule::class ,ViewModelModule::class]
    )
    abstract fun contributeMyActivity(): MyActivity

//    companion object {
//        @Provides
//        fun someString5(): String {
//            return "Hello World2"
//        }
//    }
}