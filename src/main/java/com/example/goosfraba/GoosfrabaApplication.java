package com.example.goosfraba;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@SpringBootApplication
public class GoosfrabaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoosfrabaApplication.class, args);
	}

}

