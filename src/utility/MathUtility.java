/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import static tuanlm.main.Main.*;
//cau lenh moi tu jdk 8
//o duoi goi ham static khong can cham, y chang c , chi ao dung static
/**
 *
 * @author MINH TUAN
 */
public class MathUtility {
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
//muon ket luan ham minh ngon, thi phai nhin bang mat ket qua chay cua ham
//va so sanh voi ki vong
//lam tung truong hop chay ham - test case
//cach nay on nhung mat suc

//NANG CAO: DUNG MAU SAC, XANH, DO DE KET LUAN
//TA THAY XANH, HAM Y MOI CASE ON
//TA THAY DO, CHI 1 THANG DO, COI NHU HOANG TOANG
//TA XAI THEM 1 FRAMEWORK, UNIT TEST TEN CHUNG
//JUNIT, TESTIG, NUNIT,... LA NHUNG FRAMEWORJ CU THE DEGIUP TEST CAC HAM 1 CACH HIEU QUA
//DUNG NO TA TICH HOP VAO 1 QUY TRINH LAM PHAN MEM LON HON - CI/CT/CD/DEV   OPS
