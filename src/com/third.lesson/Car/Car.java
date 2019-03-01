package com.third.lesson.Car;

public class Car {
    private final int yearOfManufacture;
    private String engine = new String();
    private int maxSpeed;
    private int accelSpeed;
    private int numbOfPass = 0;
    private int maxPassValue;
    private int speed;
    private int numbOfWheels = 4;
    private int numbOfDoors = 4;
    private float maxPossibleSpeed;

    private CarWheel[] carWheelsArr;
    private CarDoor[] carDoorsArr;


    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAccelSpeed() {
        return accelSpeed;
    }

    public int getNumbOfPass() {
        return numbOfPass;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumbOfWheels() {
        return numbOfWheels;
    }

    public int getNumbOfDoors() {
        return numbOfDoors;
    }

    public int getMaxPassValue() {
        return maxPassValue;
    }

    public Car(){
        yearOfManufacture = 2019;
    }

    public Car(int yearOfManufacture,
               String engine,
               int maxSpeed,
               int accelSpeed,
               int maxPassValue,
               int speed)
    {
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.accelSpeed = accelSpeed;
        this.maxPassValue = maxPassValue;
        this.speed = speed;
        this.carWheelsArr = new CarWheel[numbOfWheels];
        this.carDoorsArr = new CarDoor[numbOfDoors];

        for (int i = 0; i < numbOfWheels; i++){
            this.carWheelsArr[i] = new CarWheel(74);
        }

        for (int i = 0; i < numbOfDoors; i++){
            this.carDoorsArr[i] = new CarDoor();
        }
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void addPassenger(){
        if (numbOfPass <= maxPassValue) {
            numbOfPass++;
        }
    }

    public void rmPassenger(){
        numbOfPass--;
    }

    public void rmAllPassaangers(){
        numbOfPass = 0;
    }

    public CarDoor getDoor(int index){
        if (index < 0 || index > numbOfDoors){
            return null;
        }
        return carDoorsArr[index];
    }

    public CarWheel getWheel(int index){
        if (index < 0 || index > numbOfWheels){
            return null;
        }
        return carWheelsArr[index];
    }

    public void rmAllWhheels(){
        numbOfWheels = 0;
    }

    public void addWheels(int wheels){
        CarWheel[] temp = new CarWheel[this.carWheelsArr.length + wheels];
        for (int i = 0; i < temp.length; i++){
            if (i < this.carWheelsArr.length){
                temp[i] = this.carWheelsArr[i];
            }
            else {
                temp[i] = new CarWheel(100);
            }
        }
        this.carWheelsArr = temp;
    }

    public float getMaxPossibleSpeed(){
        float maxDmgWheel = 0f;

        if (numbOfPass <= 0){
            return maxPossibleSpeed = 0;
        }

        for (int i = 0; i < carWheelsArr.length; i++){
            if (maxDmgWheel < carWheelsArr[i].getHealthWheel()){
                maxDmgWheel = carWheelsArr[i].getHealthWheel();
            }
        }
        maxPossibleSpeed = maxSpeed * maxDmgWheel;
        return maxPossibleSpeed;
    }

    public void outData(){
        System.out.println("Year of manufacture: " + getYearOfManufacture());
        System.out.println("Type of engine: " + getEngine());
        System.out.println("Max speed: " + getMaxSpeed());
        System.out.println("Accelerate speed: " + getAccelSpeed());
        System.out.println("Number of passenger in the car: " + getNumbOfPass());
        System.out.println("Max passenger value: " + getMaxPassValue());
        System.out.println("Speed now: " + getSpeed());
        System.out.println("Max Possible speed: " + getMaxPossibleSpeed());
    }
}
