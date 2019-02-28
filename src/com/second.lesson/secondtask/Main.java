package com.second.lesson.secondtask;

public class Main {
    private String str1 = "MateAcademy(Str1)";

    public static void main(String [] args){

        //Anonymous class
        Anonymous method = new Anonymous(){
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
        InnerStatic.Factorial factorial = InnerStatic.getFactorial(8);
        System.out.println("Факториал числа: " + factorial.getValue() + " = " + factorial.getResult());

        //Local class
        Local local = new Local();
        local.intOut();
    }

    class InnerClass {
        private String str2 = "MateAcademy(str2)";
        public void strOut(){
            System.out.println(str1 + " " + str2);
        }
    }
}
