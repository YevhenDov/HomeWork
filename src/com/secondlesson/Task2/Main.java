package com.secondlesson.Task2;

public class Main {
    private String str1 = "MateAcademy(Str1)";

    public static void main(String [] args){

        //Anonymous class
        AnonymousClass method = new AnonymousClass(){
            @Override
            public void printAcademy() {
                System.out.println("MateAcademy");
            }
        };
        method.printAcademy();

        //Inner class
        Main.InnerClass innerClass = new Main().new InnerClass();
        innerClass.strOut();

        //Inner static class
        InnerStaticClass.Factorial factorial = InnerStaticClass.getFactorial(8);
        System.out.println("Факториал числа: " + factorial.getValue() + " = " + factorial.getResult());

        //Local class
        LocalClass localClass = new LocalClass();
        localClass.intOut();
    }

    class InnerClass {
        private String str2 = "MateAcademy(str2)";
        public void strOut(){
            System.out.println(str1 + " " + str2);
        }
    }
}
