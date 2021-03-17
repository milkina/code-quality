package com.softserve.training.code.quality;

public class TrafficLight {
    public static void main(String[] args) {
        int color = 3;
        int direction = 1;
        switch (color) {
            case 1:
                System.out.println("Green");
                switch (direction) {
                    case 1:
                        System.out.println("Turn right");
                        break;
                    case 2:
                        System.out.println("Turn left");
                        break;
                    case 3:
                        System.out.println("Go direct");
                        break;
                }
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
