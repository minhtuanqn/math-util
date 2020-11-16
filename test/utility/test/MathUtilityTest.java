/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static tuanlm.main.Main.*;

/**
 *
 * @author MINH TUAN
 */
public class MathUtilityTest {
    
    @Test //@bien ham nay thanh public static void main()
    //cach dat ten ham noi len mua tieu test ham. Co nhieu quy tac dat ten ham test
    public void getFactorial_Runswell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(1, getFactorial(0));
    }
    
    //can test xen ci bem ve ngoai le hay khong
    //neu dung la nem ve ngoai le IllegelArgumentException trong tinh hiong giai thua -5 thi ta co mau xanh
    @Test(expected = IllegalAccessException.class)
    public void getFactorial_ThrowException_IfInvalidArgument() {
        getFactorial(-5);
    }
    //ngoai le khong phai la 1 vale de dem ra so sanh. Chi co the kiem tra
    //coi no co xuat hien hay khong
    
}
