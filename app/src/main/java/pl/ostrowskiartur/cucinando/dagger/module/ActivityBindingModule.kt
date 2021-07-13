package pl.ostrowskiartur.cucinando.dagger.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.ostrowskiartur.cucinando.MainActivity

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity?

}