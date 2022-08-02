package com.podlasenko.example.model.aws;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.ResourceFactory;
import com.podlasenko.example.model.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(InstanceType instanceType) {
        return new Ec2Instance(instanceType);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
