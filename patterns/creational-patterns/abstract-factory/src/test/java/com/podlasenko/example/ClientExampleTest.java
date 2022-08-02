package com.podlasenko.example;

import com.podlasenko.example.model.Instance;
import com.podlasenko.example.model.InstanceType;
import com.podlasenko.example.model.aws.AwsResourceFactory;
import com.podlasenko.example.model.aws.Ec2Instance;
import com.podlasenko.example.model.gcp.GoogleComputeEngineInstance;
import com.podlasenko.example.model.gcp.GoogleResourceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClientExampleTest {

    private ClientExample aws;
    private ClientExample gcp;

    @Before
    public void setup() {
        aws = new ClientExample(new AwsResourceFactory());
        gcp = new ClientExample(new GoogleResourceFactory());
    }

    @Test
    public void createServer_ShouldReturnAWSInstance() {
        Instance serverInstance = aws.createServer(InstanceType.micro, 1024);

        assertThat(serverInstance, instanceOf(Ec2Instance.class));
    }

    @Test
    public void createServer_ShouldReturnGCPInstance() {
        Instance serverInstance = gcp.createServer(InstanceType.large, 1024);

        assertThat(serverInstance, instanceOf(GoogleComputeEngineInstance.class));
    }
}
