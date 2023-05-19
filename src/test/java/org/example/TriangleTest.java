package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

  @Test
  void shouldGetRectangularTriangle() {

    //given
    int sideA = 3;
    int sideB = 4;
    int longSideC = 5;

    //when
    boolean isRightTriangle = Triangle.isRightTriangle(sideA, sideB, longSideC);

    //then
    Assertions.assertTrue(isRightTriangle);
  }

  @Test
  void shouldNotGetRectangularTriangle() {

    //given
    int sideA = 1;
    int sideB = 2;
    int longSideC = 3;

    //when
    boolean isRightTriangle = Triangle.isRightTriangle(sideA, sideB, longSideC);

    //then
    Assertions.assertFalse(isRightTriangle);
  }
}
