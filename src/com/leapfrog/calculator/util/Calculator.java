/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator.util;

/**
 *
 * @author apple
 */
public class Calculator {

    private int x, y;

    public Calculator() {

    }

    public Calculator(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;

    }

    public int mul() {
        return x * y;
    }

    public int div() {
        return x / y;
    }

    public int power() {
        int total = 1;
        for (int i = 0; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

    public int max() {
        int max = Math.max(x, y);
        return max;
    }

    public int min() {
        int min = Math.min(x, y);
        return min;
    }

    public void multificationTable() {
        System.out.println("Multiplication table of " + x + " is :");
        for (int i = 1; i <= y; i++) {

            System.out.println(x + "*" + i + "=" + (x * i));
        }
    }

   public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}


