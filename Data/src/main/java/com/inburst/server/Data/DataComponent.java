package com.inburst.server.Data;

import com.inburst.server.Data.internal.DataBindingRepoModule;
import com.inburst.server.Data.internal.NetworkModule;
import com.inburst.server.DataAccess.DataAccessComponent;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        NetworkModule.class,
        DataBindingRepoModule.class
})
public interface DataComponent extends DataAccessComponent {
    static ComponentProvider getProvider() {
        return ComponentProvider.COMPONENT_PROVIDER;
    }

    @SuppressWarnings("unused")
    class ComponentProvider {

        private static final ComponentProvider COMPONENT_PROVIDER = new ComponentProvider();

        private volatile DataComponent dataComponent;

        public void setComponent(DataComponent component) {
            dataComponent = component;
        }

        public DataComponent getComponent() {
            if (dataComponent == null) {
                dataComponent = DaggerDataComponent.create();
                throw new IllegalStateException("SampleDataComponent not initialized");
            }
            return dataComponent;
        }
    }

}
