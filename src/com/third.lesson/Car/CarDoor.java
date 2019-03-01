package com.third.lesson.Car;

public class CarDoor {
    private boolean doorState;
    private boolean windowState;

    public CarDoor(){
        doorState = false;
        windowState = true;
    }

    public CarDoor(boolean doorState, boolean windowState){
        this.doorState = doorState;
        this.windowState = windowState;
    }

    public boolean isDoorState() {
        return doorState;
    }

    public boolean isWindowState() {
        return windowState;
    }

    public void openDoor(){
        doorState = true;
    }

    public void closeDoor(){
        doorState = false;
    }

    public void openWindow(){
        windowState = true;
    }

    public void closeWindow(){
        windowState = false;
    }

    public void changeDoorState(boolean doorState){
        if (doorState){
            closeDoor();
        }

        if (doorState == false){
            openDoor();
        }
    }

    public void changeWindowState(boolean windowState) {
        if (windowState) {
            closeWindow();
        }

        if (windowState == false) {
            openWindow();
        }
    }

    public void outData(){
        if (doorState){
            System.out.println("Door open");
        }
        if (doorState == false){
            System.out.println("Door close");
        }
        if (windowState){
            System.out.println("Window open");
        }
        if (windowState == false){
            System.out.println("Window close");
        }
    }
}
