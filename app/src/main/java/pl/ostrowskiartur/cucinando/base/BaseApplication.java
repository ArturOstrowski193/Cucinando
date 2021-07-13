package pl.ostrowskiartur.cucinando.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import pl.ostrowskiartur.cucinando.dagger.component.ApplicationComponent;
import pl.ostrowskiartur.cucinando.dagger.component.DaggerApplicationComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);

        return component;
    }
}