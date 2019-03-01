package com.third.lesson.Car;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor(){
    }

    public CarDoor(boolean doorState, boolean windowState){
        this.isDoorOpen = doorState;
        this.isWindowOpen = windowState;
    }

    public boolean isDoorState() {
        return isDoorOpen;
    }

    public boolean isWindowState() {
        return isWindowOpen;
    }

    public void openDoor(){
        isDoorOpen = true;
    }

    public void closeDoor(){
        isDoorOpen = false;
    }

    public void openWindow(){
        isWindowOpen = true;
    }

    public void closeWindow(){
        isWindowOpen = false;
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
        if (isDoorOpen){
            System.out.println("Door open");
        }
        if (isDoorOpen == false){
            System.out.println("Door close");
        }
        if (isWindowOpen){
            System.out.println("Window open");
        }
        if (isWindowOpen == false){
            System.out.println("Window close");
        }
    }
}
