package com.example.app;

import com.example.logic.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        boolean result = triangle.isRightTriangle(5,7,3);
        System.out.println(result);
    }
}
