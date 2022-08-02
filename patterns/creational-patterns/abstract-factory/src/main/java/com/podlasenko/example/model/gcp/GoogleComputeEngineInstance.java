package com.podlasenko.example.model.gcp;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(InstanceType instanceType) {
        System.out.println("Created " + instanceType + " Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}
