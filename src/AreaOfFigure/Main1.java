package AreaOfFigure;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println("Рассчитать площадь какой фигуры?");
        System.out.println("1 - Квадрата");
        System.out.println("2 - Круга");
        System.out.println("3 - Прямоугольный треугольник");
        System.out.println("4 - Расчёт множества фигур");
        System.out.println("*************");
        System.out.println("Выберите один из пунктов меню: ");
        Scanner console = new Scanner(System.in);
        int selection = console.nextInt();

        switch(selection){
            case 1:
                System.out.println("Значение стороны: ");
                Square sq = new Square();
                sq.setSideA(console.nextDouble());
                sq.calculateArea();
                break;
            case 2:
                System.out.println("Значение радиуса: ");
                Circle ci = new Circle();
                ci.setRadius(console.nextDouble());
                ci.calculateArea();
                break;
            case 3:
                RightTriangle rt = new RightTriangle();
                System.out.println("Значение стороны А: ");
                rt.setSideA(console.nextDouble());
                System.out.println("Значение стороны B: ");
                rt.setSideB(console.nextDouble());
                rt.calculateArea();
                break;
            case 4:
                System.out.println("Сколько фигур вы хотите расмотреть? (Введите число): ");
                int KolFigure = console.nextInt();
                int[] masChisel = new int[KolFigure];
                System.out.println("Введите номера желаемых фигур через Enter, где 11-Квадрат 22-Круг 33-Прямоугольный треугольник");
                double[] AreaFigure = new double[KolFigure];
                for (int i = 0; i < masChisel.length; i++) {
                    masChisel[i] = console.nextInt();
                    if(masChisel[i] == 11){
                        System.out.println("Значение стороны: ");
                        Square sq1 = new Square();
                        sq1.setSideA(console.nextDouble());
                        AreaFigure[i] = sq1.resultAreaNumberOnly();
                    }
                    if(masChisel[i] == 22){
                        System.out.println("Значение радиуса: ");
                        Circle ci1 = new Circle();
                        ci1.setRadius(console.nextDouble());
                        AreaFigure[i] = ci1.resultAreaNumberOnly();
                    }
                    if(masChisel[i] == 33){
                        RightTriangle rt1 = new RightTriangle();
                        System.out.println("Значение стороны А: ");
                        rt1.setSideA(console.nextDouble());
                        System.out.println("Значение стороны B: ");
                        rt1.setSideB(console.nextDouble());
                        AreaFigure[i] = rt1.resultAreaNumberOnly();
                    }
                    if(i != KolFigure-1){
                    System.out.println("Продолжите Ввод номеров желаемых фигур, если необходимо");
                    }  else {
                        System.out.println("");
                    }
                }
                System.out.print("Массив чисел состоит из: ");
                for (int i = 0; i < masChisel.length; i++) {
                    System.out.print(masChisel[i] + " ");
                }
                System.out.println("");
                System.out.print("Проверка расчёта площадей квадратов: ");
                for (int i = 0; i < AreaFigure.length; i++) {
                    System.out.print(AreaFigure[i] + " ");
                }
                break;
            default:
                System.out.println("Не корректный ввод!");
                break;
        }

    }
}
