package io.github.jeyhung.mathematics;

import java.awt.*;
import java.util.Objects;

public final class Mathematics {
    private Mathematics() {
    }

    static class Triangle {
        public static boolean isTriangle(double side1, double side2, double side3) {
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new RuntimeException("Triangle side must be positive!");
            }

            if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
                return true;
            }

            return false;
        }

        public static boolean isTriangle(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return isTriangle(side1, side2, side3);
        }

        public static boolean isEquilateralTriangle(double side1, double side2, double side3) {
            isTriangle(side1, side2, side3);

            if (side1 == side2 && side2 == side3) {
                return true;
            }
            return false;
        }

        public static boolean isEquilateralTriangle(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return isEquilateralTriangle(side1, side2, side3);
        }

        public static boolean isIsoscelesTriangle(double side1, double side2, double side3) {
            isTriangle(side1, side2, side3);

            if (side1 == side2 || side2 == side3 || side1 == side3) {
                return true;
            }
            return false;
        }

        public static boolean isIsoscelesTriangle(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return isIsoscelesTriangle(side1, side2, side3);
        }

        public static boolean isScaleneTriangle(double side1, double side2, double side3) {
            isTriangle(side1, side2, side3);

            if (side1 != side2 && side2 != side3 && side1 != side3) {
                return true;
            }
            return false;
        }

        public static boolean isScaleneTriangle(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return isScaleneTriangle(side1, side2, side3);
        }

        public static double perimeter(double side1, double side2, double side3) {
            isTriangle(side1, side2, side3);
            return side1 + side2 + side3;
        }

        public static double perimeter(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return perimeter(side1, side2, side3);
        }

        public static double area(double side1, double side2, double side3) {
            isTriangle(side1, side2, side3);
            double perimeter = perimeter(side1, side2, side3) / 2;
            return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        }

        public static double area(Point point1, Point point2, Point point3) {
            requirePoints(point1, point2, point3);

            double side1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
            double side2 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));
            double side3 = Math.sqrt(Math.pow(point3.x - point1.x, 2) + Math.pow(point3.y - point1.y, 2));

            return area(side1, side2, side3);
        }

        public static double area(double base, double height) {
            if (base <= 0) {
                throw new RuntimeException("Triangle base must be positive!");
            }

            if (height <= 0) {
                throw new RuntimeException("Triangle height must be positive!");
            }

            return (base * height) / 2;
        }

        private static void requirePoints(Point point1, Point point2, Point point3) {
            Objects.requireNonNull(point1);
            Objects.requireNonNull(point2);
            Objects.requireNonNull(point3);
        }
    }
}


