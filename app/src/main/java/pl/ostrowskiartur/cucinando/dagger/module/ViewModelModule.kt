package pl.ostrowskiartur.cucinando.dagger.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pl.ostrowskiartur.cucinando.base.ViewModelFactory
import pl.ostrowskiartur.cucinando.dagger.util.ViewModelKey

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory?): ViewModelProvider.Factory?

}