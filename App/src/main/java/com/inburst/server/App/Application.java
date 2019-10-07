package com.inburst.server.App;

import com.inburst.server.Buisness.BusinessApplication;

public class Application extends BusinessApplication {

    private static Application instance;

    public static Application getInstance() { return instance; }

    private volatile ApplicationComponent appComponent;

    public static ApplicationComponent getAppComponent() {
        return getInstance().appComponent;
    }

    public void onCreate() {
        instance = this;
        initializeAppComponent();
        super.onCreate();
    }

    @Override
    protected void initializeAppComponent() {
        appComponent = buildAppComponent();
    }

    @Override
    protected void onDependencyManagementInitialized() {
    }


    private ApplicationComponent buildAppComponent() {
        return DaggerApplicationComponent.create();
    }
}
