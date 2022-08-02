package com.podlasenko.example.model;

public interface ResourceFactory {

    Instance createInstance(InstanceType instanceType);

    Storage createStorage(int capacityInMib);
}
