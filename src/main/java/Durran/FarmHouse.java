package Durran;

import Saad.Person;

public class FarmHouse extends Farm {

    private Person [] people;

    public FarmHouse(Person[] people) {
        super(people);
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}

