package com.example.finalprojekt.entity;

import java.util.ArrayList;
import java.util.List;

public class Opinion {


    private String content;
    private Client client;
    private List<Client> clientList = new ArrayList<>();

    /**
     * method to add Client who issued an opinion
     * @param client
     */
    //ASOCJACJA ZWYKŁA
    public void addClient(Client client) {
        if(!this.clientList.contains(client)) {
            this.clientList.add(client);
            client.setOpinion(this);
        }
    }


    /**
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Ovverride toString method
     * @return String
     */
    @Override
    public String toString() {
        return  content + ";" +
                client;
    }
}
