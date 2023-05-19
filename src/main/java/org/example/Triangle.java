package org.example;

public class Triangle {
  public static boolean isRightTriangle(double sideA, double sideB, double longSideC){
    return sideA * sideA + sideB * sideB == longSideC * longSideC;
  }
}
