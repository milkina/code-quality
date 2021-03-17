package com.softserve.training.code.quality.figures;

import lombok.Data;

@Data
public class Rectangle implements Figure {
    private double dimension1;
    private double dimension2;

    public Rectangle(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    @Override
    public double calculateArea() {
        System.out.println("B области четырехугольника.");
        return dimension1 * dimension2;
    }
}