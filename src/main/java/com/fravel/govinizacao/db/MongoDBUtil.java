/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fravel.govinizacao.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoDBUtil {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static final String CONNECTION = "mongodb+srv://viniciuscraveiro:7NMW4qKfxJPJ5OlJ@cluster0.4fzguzx.mongodb.net/?retryWrites=true&w=majority";

    
    public static void connect(){
        mongoClient = MongoClients.create(CONNECTION);
        database = mongoClient.getDatabase("govinizacao");
        System.out.println("Conectado ao banco GOVINIZACAO");
    }
    
    public static MongoDatabase getDatabase(){
        return database;
    }
    
    public static void close(){
        if (mongoClient != null){
            mongoClient.close();
            System.out.println("Conexao fechada");
        }
    }
    
}
