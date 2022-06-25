package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;

import javax.persistence.Column;
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
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param personType
     */
    public Person( String name, String secondName, String surname, Contact contact, PersonType personType) {
        setName(name);
        setSecondName(secondName);
        setSurname(surname);
        setContact(contact);
        setPersonType(personType);
    }


    /**
     * konstruktor pomijajacy atrybut opcjonalny - drugie imie
     * @param id
     * @param s
     * @param name
     * @param surname
     * @param personType
     */
    public Person(Long id, String s, String name, String surname, Contact contact, PersonType personType) {
        setName(name);
        setSurname(surname);
        setContact(contact);
        setPersonType(personType);
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

