package com.podlasenko.example.model.gcp;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.ResourceFactory;
import com.podlasenko.example.model.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(InstanceType instanceType) {
        return new GoogleComputeEngineInstance(instanceType);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
