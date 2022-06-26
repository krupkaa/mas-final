package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;

import java.util.*;

public class Client extends Person {


    private int clientId;
    private double currentDeposit;
    //ATRYBUT POWTARZALNY
    private List<String> drivingLicenseCategoryList = new ArrayList<>();

    private List<Reservation> reservationList = new ArrayList<>();
    private List<Opinion> issuedOpinionsList = new ArrayList<>();
    private Opinion opinion;
    private static Map<Integer, Client> CLIENTSMAP = new HashMap<>();


    /**
     * constructor which is used when client have a second name
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param personType
     * @param clientId
     * @param currentDeposit
     * @param drivingLicenseCategory
     * @throws Exception
     */
    public Client(String name, String secondName, String surname, Contact contact,
                  PersonType personType, int clientId, double currentDeposit, String... drivingLicenseCategory) throws Exception {
        super(name, secondName, surname, contact, personType);
        setClientId(clientId);
        setCurrentDeposit(currentDeposit);
        drivingLicenseCategoryList.addAll(Arrays.asList(drivingLicenseCategory));
    }

    /**
     * constructor which is use when client doesn't have a second name
     * @param name
     * @param surname
     * @param contact
     * @param personType
     * @param clientId
     * @param currentDeposit
     * @param drivingLicenseCategory
     * @throws Exception
     */
    public Client(String name, String surname, Contact contact,
                  PersonType personType, int clientId, double currentDeposit, String... drivingLicenseCategory) throws Exception {
        super(name, surname, contact, personType);
        setClientId(clientId);
        setCurrentDeposit(currentDeposit);
        drivingLicenseCategoryList.addAll(Arrays.asList(drivingLicenseCategory));
    }


    /**
     * method which add opinion to the Client
     * @param opinion
     */
        //ASOCJACJA ZWYKŁA
    public void addOpinion(Opinion opinion) {
        if(!this.issuedOpinionsList.contains(opinion)) {
            this.issuedOpinionsList.add(opinion);
            opinion.setClient(this);
        }
    }

    /**
     * method which add client to the map of all Clients
     * @param client
     */
    //UNIQUE
    public static void addClient(Client client) {
        CLIENTSMAP.put(client.clientId,client);
    }

    /**
     * a method to check if there is a client with this id in the Map
     * @param id
     * @return true or false
     */
    public static boolean findClient(int id) {
        return CLIENTSMAP.containsKey(id);
    }


    /**
     * @return clientId
     */
    //GETTERY I SETTERY
    public int getClientId() {
        return clientId;
    }

    /**
     * @param clientId
     * @throws Exception
     */
    public void setClientId(int clientId) throws Exception{
        if (findClient(clientId)) {
            throw new Exception("Client ID must be unique");
        }
        this.clientId = clientId;
    }

    /**
     * @return issuedOpinionsList
     */
    public List<Opinion> getIssuedOpinionsList() {
        return issuedOpinionsList;
    }

    /**
     * @param issuedOpinionsList
     */
    public void setIssuedOpinionsList(List<Opinion> issuedOpinionsList) {
        this.issuedOpinionsList = issuedOpinionsList;
    }

    /**
     * @return opinion
     */
    public Opinion getOpinion() {
        return opinion;
    }

    /**
     * @param opinion
     */
    public void setOpinion(Opinion opinion) {
        this.opinion = opinion;
    }

    /**
     * @return issuedOpinionsList
     */
    public List<Opinion> getIssuedOpinionList() {
        return issuedOpinionsList;
    }

    /**
     * @param issuedOpinionList
     */
    public void setIssuedOpinionList(List<Opinion> issuedOpinionList) {
        this.issuedOpinionsList = issuedOpinionList;
    }

    /**
     * @return drivingLicenseCategoryList
     */
    public List<String> getDrivingLicenseCategoryList() {
        return drivingLicenseCategoryList;
    }

    /**
     * @param drivingLicenseCategoryList
     */
    public void setDrivingLicenseCategoryList(List<String> drivingLicenseCategoryList) {
        this.drivingLicenseCategoryList = drivingLicenseCategoryList;
    }

    /**
     * @return currentDeposit
     */
    public double getCurrentDeposit() {
        return currentDeposit;
    }

    /**
     * @param currentDeposit
     */
    public void setCurrentDeposit(double currentDeposit) {
        this.currentDeposit = currentDeposit;
    }

    /**
     * @return reservationList
     */
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    /**
     * @param reservationList
     */
    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }


}
