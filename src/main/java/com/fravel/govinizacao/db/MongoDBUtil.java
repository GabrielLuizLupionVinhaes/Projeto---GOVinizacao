
package com.fravel.govinizacao.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBUtil {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static final String CONNECTION = "mongodb+srv://viniciuscraveiro:7NMW4qKfxJPJ5OlJ@cluster0.4fzguzx.mongodb.net/?retryWrites=true&w=majority";

    
    public static void connect(){
        mongoClient = MongoClients.create(CONNECTION);
        database = mongoClient.getDatabase("govinizacao");
        System.out.println("Conectado ao banco GOVINIZACAO");
    }
    
    public static int query(String campo, String text, String tabela){
        MongoCollection<Document> collection = database.getCollection(tabela);
        Document query = new Document(campo, text);
        long count = collection.countDocuments(query);
        
        if(count > 0){
            return 1;
        }else{
            return 0;
        }
        
    }
    
    public static void insert(String tabela, Document document){
        MongoCollection<Document> collection = database.getCollection(tabela);

        collection.insertOne(document);
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
