package com.example.practice37_dagger2.fragments

import androidx.lifecycle.ViewModelProvider
import com.example.practice37_dagger2.classes.MyViewModel
import dagger.Module
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MyFragment:DaggerFragment() {

//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//    val viewmodel by lazy{
//        ViewModelProvider(this,  viewModelFactory)
//                .get(MyViewModel::class.java)
//    }

}