package com.epam.by;

import com.amazon.dax.client.dynamodbv2.AmazonDaxClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;

public class App
{
    public static void main( String[] args )
    {
        AmazonDaxClientBuilder daxClientBuilder = AmazonDaxClientBuilder.standard();
        daxClientBuilder.withRegion("us-east-1").withEndpointConfiguration("mydaxcluster.ndtn7s.clustercfg.dax.use1.cache.amazonaws.com:8111");
        AmazonDynamoDB client = daxClientBuilder.build();
    }
}
