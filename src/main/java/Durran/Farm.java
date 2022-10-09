package Durran;

import Saad.Person;
import Saad.Pilot;
import Vehicles.AirCraft;
import Vehicles.CropDuster;
import Vehicles.FarmingVehicles;
import emily.Crop;
import emily.Field;

public abstract class Farm {

    private FarmHouse farmHouse;

    private Stable[] stables;

    private ChickenCoop[] chickenCoops;

    private Person[] people;

    private Field fields;

    private Crop[][] crops;

    private FarmingVehicles[] farmingVehicles;

    private AirCraft airCraft;

    private Pilot pilot;

    private CropDuster cropDuster;

    public Farm(FarmHouse farmHouse, Stable[] stables, ChickenCoop[] chickenCoops, Person[] people, Field fields, Crop[][] crops, FarmingVehicles[] farmingVehicles, AirCraft airCraft, Pilot pilot, CropDuster cropDuster) {
        this.farmHouse = farmHouse;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.people = people;
        this.fields = fields;
        this.crops = crops;
        this.farmingVehicles = farmingVehicles;
        this.airCraft = airCraft;
        this.pilot = pilot;
        this.cropDuster = cropDuster;
    }

    public Farm(Stable[] stables) {
        this.stables = stables;
    }

    public Farm(Person[] people) {
        this.people = people;
    }

    public Farm(Stable[] stables, ChickenCoop[] chickenCoops) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Stable[] getStables() {
        return stables;
    }

    public void setStables(Stable[] stables) {
        this.stables = stables;
    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoop[] chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }

    public Crop[][] getCrops() {
        return crops;
    }

    public void setCrops(Crop[][] crops) {
        this.crops = crops;
    }

    public FarmingVehicles[] getFarmingVehicles() {
        return farmingVehicles;
    }

    public void setFarmingVehicles(FarmingVehicles[] farmingVehicles) {
        this.farmingVehicles = farmingVehicles;
    }

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }
}


