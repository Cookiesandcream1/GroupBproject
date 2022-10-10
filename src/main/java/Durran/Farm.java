package Durran;

import Saad.Person;
import Saad.Pilot;
import Vehicles.AirCraft;
import Vehicles.CropDuster;
import Vehicles.FarmingVehicles;

import isaiahandjoe.Crop;
import isaiahandjoe.Field;

public abstract class Farm {
    private FarmHouse farmHouse;
    private Stable[] stables;
    private ChickenCoop[] chickenCoops;

    //private Person[] people;

    private Field fields;


    private FarmingVehicles[] farmVehicles;

    private AirCraft airCraft;

    private Pilot pilot;

    private CropDuster cropDuster;

    public Farm(FarmHouse farmHouse, Stable[] stables, ChickenCoop[] chickenCoops, Field fields, FarmingVehicles[] farmVehicles, AirCraft airCraft, Pilot pilot, CropDuster cropDuster) {
        this.farmHouse = farmHouse;
        this.stables = stables;
        this.chickenCoops = chickenCoops;

        this.fields = fields;

        this.farmVehicles = farmVehicles;
        this.airCraft = airCraft;
        this.pilot = pilot;
        this.cropDuster = cropDuster;
    }

    public Farm(Stable[] stables) {
        this.stables = stables;
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





    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }





    public FarmingVehicles[] getFarmingVehicles() {
        return farmVehicles;
    }

    public void setFarmingVehicles(FarmingVehicles[] farmVehicles) {
        this.farmVehicles = farmVehicles;
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


