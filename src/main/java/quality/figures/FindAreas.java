package com.softserve.code.quality.figures;

public class FindAreas {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(20, 10);
        figures[1] = new Circle(10);
        figures[2] = new Triangle(10, 10);
        for (Figure figure : figures) {
            System.out.println(figure.calculateArea());
        }
    }
}
