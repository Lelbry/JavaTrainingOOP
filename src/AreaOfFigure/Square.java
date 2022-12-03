package AreaOfFigure;

public class Square implements Area {
    public double SideA;

    public Square() {
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    @Override
    public double resultAreaNumberOnly() {
        Area.super.resultAreaNumberOnly();
        double result = SideA*SideA;
        return (result);
    }

    @Override
    public void calculateArea() {
        Area.super.calculateArea();
        double result = SideA*SideA;
        System.out.println("Площадь квадрата равна: " + result);
    }

}
