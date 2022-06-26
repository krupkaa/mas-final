package com.example.finalprojekt.entity;

//KLASA ABSTAKCYJNA
public abstract class Person {


    private String name;
    private String secondName;
    private String surname;
    private Contact contact;


    /**
     * constructor with all parameters
     *
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     */
    public Person(String name, String secondName, String surname, Contact contact) {
        setName(name);
        setSecondName(secondName);
        setSurname(surname);
        setContact(contact);
    }


    //ATRYBUT OPCJONALNY

    /**
     * constructor skip attribute second name which is optional
     *
     * @param name
     * @param surname
     * @param contact
     */
    public Person(String name, String surname, Contact contact) {
        setName(name);
        setSurname(surname);
        setContact(contact);
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
        if (name != null) {
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
        if (surname != null) {
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


}

