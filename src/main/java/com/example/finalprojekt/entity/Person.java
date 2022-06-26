package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;

//KLASA ABSTAKCYJNA
public abstract class Person {


    private String name;
    private String secondName;
    private String surname;
    private Contact contact;
    private PersonType personType;


    /**
     * constructor with all parameters
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param personType
     */
    public Person(String name, String secondName, String surname, Contact contact, PersonType personType) {
        setName(name);
        setSecondName(secondName);
        setSurname(surname);
        setContact(contact);
        setPersonType(personType);
    }


    //ATRYBUT OPCJONALNY
    /**
     * constructor skip attribute second name which is optional
     * @param name
     * @param surname
     * @param contact
     * @param personType
     */
    public Person(String name, String surname, Contact contact, PersonType personType) {
        setName(name);
        setSurname(surname);
        setContact(contact);
        setPersonType(personType);
    }


    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
        throw new NullPointerException("Name is required!");
    }

    /**
     * @return secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname which is required
     */
    public void setSurname(String surname) {
        if(surname != null) {
            this.surname = surname;
        }
        throw new NullPointerException("Surname is required!");
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return personType
     */
    public PersonType getPersonType() {
        return personType;
    }

    /**
     * @param personType
     */
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }


}

