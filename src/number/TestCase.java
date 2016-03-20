/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;
import  static org.junit.Assert.*;
import  org.junit.Test;

/**
 *
 * @author fenn
 */
public class TestCase{
   @Test
   public void Base2Conversion() throws Exception{
       Number number = new Number(22777,8);
       String expected ="101100011111001";
       assertEquals(expected, number.ConvertToBase(2));
   }
   @Test
   public void Base8Conversion() throws Exception{
     Number  number = new Number("25FF",16);
     String expected ="22777";
     assertEquals(expected,number.ConvertToBase(8));
       
   } 
   @Test
   public void Base10Conversion() throws Exception {
    Number  number = new Number("F",16); 
    String expected ="15";
    assertEquals(expected,number.ConvertToBase(10));
      
   }
   @Test
   public void Base16Conversion() throws Exception{
     Number number = new Number(10, 10);
     String expected ="A";
     assertEquals(expected, number.ConvertToBase(16));
   }
   @Test
   public void Base32Conversion() throws Exception{
     Number number = new Number(45,10);
     String expected ="1D";
     assertEquals(expected,number.ConvertToBase(32));
       
   }
       
    
}
