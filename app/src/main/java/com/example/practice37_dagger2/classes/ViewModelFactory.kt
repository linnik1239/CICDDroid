package com.example.practice37_dagger2.classes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practice37_dagger2.repository.MainRepository
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
                                           var  mainRepository: MainRepository  ,private val viewModels: MutableMap<Class<out ViewModel>
                ,Provider<ViewModel>>
): ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T
    =viewModels[modelClass]?.get() as T



}