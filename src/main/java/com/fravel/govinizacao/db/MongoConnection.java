package com.fravel.govinizacao.src.db;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnection {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://viniciuscraveiro:7NMW4qKfxJPJ5OlJ@cluster0.4fzguzx.mongodb.net/?retryWrites=true&w=majority";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("govinizacao");
                database.runCommand(new Document("ping", 1));
                System.out.println("Conectando ao banco de dados.\n\nVoce esta conectado ao MongoDB! DB (govinizacao)");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}

