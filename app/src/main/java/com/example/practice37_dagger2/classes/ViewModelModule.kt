package com.example.practice37_dagger2.classes

import androidx.lifecycle.ViewModel
import com.example.practice37_dagger2.repository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    internal abstract fun bindMyViewModel(viewModel: MyViewModel):ViewModel



}