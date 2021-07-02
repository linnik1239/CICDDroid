package com.example.practice37_dagger2.classes

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.practice37_dagger2.repository.MainRepository
import javax.inject.Inject

class MyViewModel @Inject constructor( private val application:Application):ViewModel() {



    fun viewModelFunHello():String{
        return "Hello from MVVM"
    }

}