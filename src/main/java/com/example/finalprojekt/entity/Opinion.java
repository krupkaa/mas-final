package com.example.finalprojekt.entity;

import java.util.ArrayList;
import java.util.List;

public class Opinion {


    private String content;
    private Client client;
    private List<Client> clientList = new ArrayList<>();

    //ASOCJACJA ZWYKŁA
    public void addClient(Client client) {
        if(!this.clientList.contains(client)) {
            this.clientList.add(client);
            client.setOpinion(this);
        }
    }




    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return  content + ";" +
                client;
    }
}
