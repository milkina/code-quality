package com.softserve.code.quality.figures;

public class FigureWrong {
    public static void main(String[] args) {
        int dimension1 = 8;
        int dimension2 = 9;
        String figureName = "Rectangle";
        double area = calculateArea(dimension1, dimension2, figureName);
        System.out.println(area);
    }

    private static double calculateArea(double dimension1, double dimension2, String figureName) {
        double area = 0;
        if ("Rectangle".equals(figureName)) {
            area = dimension1 * dimension2;
        } else if ("Triangle".equals(figureName)) {
            area = dimension1 * dimension1 / 2;
        } else if ("Circle".equals(figureName)) {
            area = Math.PI * Math.pow(dimension1, 2);
        }
        return area;
    }
}
