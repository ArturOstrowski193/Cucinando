package pl.ostrowskiartur.cucinando.dagger.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;
import pl.ostrowskiartur.cucinando.base.BaseApplication;
import pl.ostrowskiartur.cucinando.dagger.module.ActivityBindingModule;
import pl.ostrowskiartur.cucinando.dagger.module.ContextModule;
import pl.ostrowskiartur.cucinando.dagger.module.FragmentBindingModule;
import pl.ostrowskiartur.cucinando.dagger.module.NetworkModule;
import pl.ostrowskiartur.cucinando.dagger.module.ViewModelModule;

@Singleton
@Component(modules = {
        ContextModule.class,
        NetworkModule.class,
        AndroidSupportInjectionModule.class,
        FragmentBindingModule.class,
        ActivityBindingModule.class,
        ViewModelModule.class})

public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

    void inject(BaseApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }

}