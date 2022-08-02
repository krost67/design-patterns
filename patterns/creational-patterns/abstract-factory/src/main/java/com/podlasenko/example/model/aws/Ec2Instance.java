package com.podlasenko.example.model.aws;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.Storage;

public class Ec2Instance implements Instance {

    public Ec2Instance(InstanceType instanceType) {
        System.out.println("Created " + instanceType + " Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
