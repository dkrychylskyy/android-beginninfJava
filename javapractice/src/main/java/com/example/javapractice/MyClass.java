package com.example.javapractice;

public class MyClass {

    public static void main(String[] args) {
        int change = getMilk(5, 40 );
        System.out.println("Hello Master, your change is " + change + " pounds");
    }

    /*public static void getMilk(int nrOfCartonsToBuy) {

        int priceToPay = nrOfCartonsToBuy*2;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("By "+ nrOfCartonsToBuy + " milk on the ground floor");
        System.out.println("Pay " + priceToPay + " pounds, but no more");
        System.out.println("Return home with milk galore");
    }
    */
    public static int getMilk(int nrOfCartonsToBuy, int startingAmount) {

        int priceToPay = nrOfCartonsToBuy*2;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("By "+ nrOfCartonsToBuy + " milk on the ground floor");
        System.out.println("Pay " + priceToPay + " pounds, but no more");
        System.out.println("Return home with milk galore");

        return startingAmount - priceToPay;
    }
}
