package AreaOfFigure;

public class Circle implements Area {
    private double Radius = 0;

    public Circle() {
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double resultAreaNumberOnly() {
        Area.super.resultAreaNumberOnly();
        double result = Math.PI*Radius*Radius;
        return (result);
    }

    @Override
    public void calculateArea() {
        Area.super.calculateArea();
        double result = Math.PI*Radius*Radius;
        System.out.println("Площадь круга равна: " + result);
    }
}
