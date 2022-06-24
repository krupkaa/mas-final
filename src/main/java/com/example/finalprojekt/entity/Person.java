package com.example.finalprojekt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Person {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String secondName; //TODO: opcjonalny
    private String surname;
    private Contact contact; //TODO: złożony
    private PersonType personType;


    /**
     * konstruktor na wszystkie parametry
     * @param id
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param personType
     */
    public Person(Long id, String name, String secondName, String surname, Contact contact, PersonType personType) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.contact = contact;
        this.personType = personType;
    }


    /**
     * konstruktor pomijajacy atrybut opcjonalny - drugie imie
     * @param id
     * @param name
     * @param surname
     * @param personType
     */
    public Person(Long id, String name, String surname, Contact contact, PersonType personType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contact = contact;
        this.personType = personType;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
        throw new NullPointerException("Name is required!");
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname != null) {
            this.surname = surname;
        }
        throw new NullPointerException("Surname is required!");
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", contact=" + contact +
                ", personType=" + personType +
                '}';
    }
}

