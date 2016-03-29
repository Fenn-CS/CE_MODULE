/*
 ** Licence**
 * Licensed to be compatible with the Scilab CeCILL license.
 */
package ce_module;

import number.Number;
import number.TestCase;

/**
 *
 * @author Fon E. Noel Nfebe
 */
public class CE_MODULE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simple Test Cases
        //Pass a String of base two numbers or base n numbers where n>10
        //Or simply pass an interger in base is less than 10 and !=2
        TestCase test = new TestCase();
        try {
            test.Base2Conversion();
            test.Base8Conversion();
            test.Base10Conversion();
            test.Base16Conversion();
            test.Base32Conversion();
            test.Sort();
            System.out.println("Everything worked as expected! :)");
        } catch (Exception te) {
            te.printStackTrace();
        }

    }

}
