
package com.fravel.govinizacao.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

public class MongoDBUtil {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static final String CONNECTION = "mongodb+srv://viniciuscraveiro:7NMW4qKfxJPJ5OlJ@cluster0.4fzguzx.mongodb.net/?retryWrites=true&w=majority";
    
   
    
    public static void connect(){
        mongoClient = MongoClients.create(CONNECTION);
        database = mongoClient.getDatabase("govinizacao");
        System.out.println("Conectado ao banco GOVINIZACAO");
    }
    
    public static void close(){
        if (mongoClient != null){
            mongoClient.close();
            System.out.println("Conexao fechada");
        }
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
    
    public static String queryVeiculo(String campo, String valor, String retorno) {
        MongoCollection<Document> collection = database.getCollection("veiculo");
        Document query = new Document(campo, valor);
        Document resultado = collection.find(query).first();
        
        if(resultado != null){
            ObjectId getId = resultado.getObjectId("_id");
            String id = getId.toString();
            String marca = resultado.getString("marca");
            String placa = resultado.getString("placa");
            String tipoVeiculo = resultado.getString("tipoVeiculo");
            String categoriaCNH = resultado.getString("categoriaCNH");
            String anoModelo = resultado.getString("anoModelo");
            String quilometragem = resultado.getString("quilometragem");
            String chassi = resultado.getString("chassi");
            String renavam = resultado.getString("renavam");

            switch(retorno){
                case "id":
                    if(id.isEmpty()){
                        break;
                    }else{
                        return id;
                    }
                case "marca":
                    if(marca.isEmpty()){
                        break;
                    }else{
                        return marca;
                    }
                case "placa":
                    if(placa.isEmpty()){
                        break;
                    }else{
                        return placa;
                    }
                case "tipoVeiculo":
                    if(tipoVeiculo.isEmpty()){
                        break;
                    }else{
                        return tipoVeiculo;
                    }
                case "categoriaCNH":
                    if(categoriaCNH.isEmpty()){
                        break;
                    }else{
                        return categoriaCNH;
                    }
                case "anoModelo":
                    if(anoModelo.isEmpty()){
                        break;
                    }else{
                        return anoModelo;
                    }
                case "quilometragem":
                    if(quilometragem.isEmpty()){
                        break;
                    }else{
                        return quilometragem;
                    }
                case "chassi":
                    if(chassi.isEmpty()){
                        break;
                    }else{
                        return chassi;
                    }
                case "renavam":
                    if(renavam.isEmpty()){
                        break;
                    }else{
                        return renavam;
                    }
            }
        }
        return "";
    }
    
    public static String queryUsuario(String campo, String valor, String retorno) {
        MongoCollection<Document> collection = database.getCollection("usuario");
        Document query = new Document(campo, valor);
        Document resultado = collection.find(query).first();
        
        if (resultado != null) {
            ObjectId getId = resultado.getObjectId("_id");
            String id = getId.toString();
            String nome = resultado.getString("nome");
            String CPF = resultado.getString("cpf");
            String classificacao = resultado.getString("classificacao");
            String status = resultado.getString("status");
            String CNH = resultado.getString("CNH");

            switch(retorno){
                case "id":
                    if(id.isEmpty()){
                        break;
                    }else{
                        return id;
                    }
                case "nome":
                    if(nome.isEmpty()){
                        break;
                    }else{
                        return nome;
                    }
                case "cpf":
                    if(CPF.isEmpty()){
                        break;
                    }else{
                        return CPF;
                    }
                case "classificacao":
                    if(classificacao.isEmpty()){
                        break;
                    }else{
                        return classificacao;
                    }
                case "status":
                    if(status.isEmpty()){
                        break;
                    }else{
                        return status;
                    }
                case "CNH":
                    if(CNH.isEmpty()){
                        break;
                    }else{
                        return CNH;
                    }
            }
        }
    
    return "";
    }
    
    public static void insert(String tabela, Document document){
        MongoCollection<Document> collection = database.getCollection(tabela);

        collection.insertOne(document);
    }
    
    public static MongoDatabase getDatabase(){
        return database;
    }
    
    
    
}
