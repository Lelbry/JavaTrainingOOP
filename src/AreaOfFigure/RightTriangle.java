package AreaOfFigure;

public class RightTriangle implements Area {
    public double SideA;
    public double SideB;

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    @Override
    public double resultAreaNumberOnly() {
        Area.super.resultAreaNumberOnly();
        double result = 0.5*SideA*SideB;
        return (result);
    }

    @Override
    public void calculateArea() {
        Area.super.calculateArea();
        double S = 0.5*SideA*SideB;
        System.out.println("Площадь прямоугольного треугольника равна: " + S);
    }
}
