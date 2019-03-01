package com.third.lesson.Car;

public class CarWheel {
    private float healthWheel;

    public CarWheel(){
        healthWheel = 1.0f;
    }

    public CarWheel(float healthWheel){
        this.healthWheel = healthWheel / 100;
        if (this.healthWheel <= 0){
            this.healthWheel = 0;
        }

    }

    public float getHealthWheel() {
        return healthWheel;
    }

    public void newWheel(){
        healthWheel = 1.0f;
    }

    public float wheelDamage(float damageWheel) {
        this.healthWheel = this.healthWheel - damageWheel / 100;
        if (healthWheel <= 0) {
            this.healthWheel = 0;
        }
        return this.healthWheel;
    }

    public void dataOut(){
        System.out.println("State of car Wheel: " + (healthWheel * 100) + "%");
    }
}
