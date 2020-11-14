/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static tuanlm.util.MathUtility.*;
//cau lenh moi tu jdk 8
//o duoi goi ham static khong can cham, y chang c , chi ao dung static
/**
 *
 * @author MINH TUAN
 */
public class Test {
    public static void main(String[] args) {
        //ta test thu ham cua ta
        //dung mat de so sanh ket qua thuc te khi chay va key qua ta mong doi
        long expected = 120; //ta mong nhan 120 neu goi ham 5!
        long actual = getFactorial(5);
        System.out.println("5!: Expected: " + expected + ";Actual: " + actual);
        
        //expected: 710 if tinh 6!
        System.out.println("6!: " + getFactorial(6));
        
        //expected: 1 if tinh 0!
        System.out.println("0!: " + getFactorial(0));
        
        //expected: IllegalArgumentException if tinh -5
        System.out.println("-5!: " + getFactorial(-5));
        
        //in thu PI coi co giong MATH.PI
        System.out.println("PI: " + PI);
    }
}
