package com.inburst.server.Buisness;

import com.inburst.server.Buisness.injection.exported.BusinessComponent;
import com.inburst.server.Data.DaggerDataComponent;
import com.inburst.server.Data.DataComponent;

public abstract class BusinessApplication {

    DataComponent dataComponent;

    public void onCreate() {

        // the order of these calls is fundamental for a correct initialization, do NOT modify!
        initializeErrorManagement();
        initializeGlobalDependencyManagement();
        initializeComponents();
    }

    protected void initializeErrorManagement() {
    }

    //region initialize global dependency injection

    protected final void initializeGlobalDependencyManagement() {
        initializeAppComponent();
        initializeDataComponent();
        initializeBusinessComponent();

        onDependencyManagementInitialized();
    }

    protected void initializeComponents() {
        initializeNetworkLayer();
        initializeCacheLayer();
        initializeBusinessLayer();
    }

    /**
     * Initialize any network-related component, such as network API containers, OkHttp and any web sockets.
     */
    protected void initializeNetworkLayer() {
    }

    /**
     * Initialize global caching components.
     */
    protected void initializeCacheLayer() {
    }

    protected final void initializeBusinessLayer() {
    }

    protected abstract void initializeAppComponent();

    private void initializeDataComponent() {
        dataComponent = DaggerDataComponent.create();
    }

    private void initializeBusinessComponent() {
    }

    protected abstract void onDependencyManagementInitialized();

    //endregion

    protected BusinessComponent getBusinessComponent() {
        return BusinessComponent.getProvider().getComponent();
    }

}

