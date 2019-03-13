package com.company.Task3;

import java.util.Arrays;

public class Figure {
    private Point points[];
    private String title;

    public String getTitle() {
        return title;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Figure(String title, Point point1, Point point2, Point point3) {
        this.title = title;
        points = new Point[4];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;

    }

    public Figure(String title, Point point1, Point point2, Point point3, Point point4, Point point5) {
        this.title = title;
        points = new Point[5];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        points[4] = point5;

    }

    double LenghSide(Point point1, Point point2) {
        return Math.sqrt((point1.getX() - point2.getX())*(point1.getX() - point2.getX()) -
                (point1.getY() - point2.getY())*(point1.getY() - point2.getY()));
    }

    double PerimeterCalculator() {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            perimeter += LenghSide(this.points[i], this.points[i + 1 % points.length]);
        }
        return perimeter;
    }

    @Override
    public String toString() {
        String result = this.title + "\n";
        for (Point point : points) {
            result += point + "\n";

        }
        /*result+="Perimeter: " + String.format("%5.2f" , this.PerimeterCalculator()); Выдает ошибку */
        return result;
    }
}
