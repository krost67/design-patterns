package com.podlasenko.example;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.ResourceFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientExample {

    private final ResourceFactory resourceFactory;

    public Instance createServer(InstanceType instanceType,
                                 int storageCapacityInMib) {
        Instance instance = resourceFactory.createInstance(instanceType);
        instance.attachStorage(resourceFactory.createStorage(storageCapacityInMib));

        return instance;
    }
}
