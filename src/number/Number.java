/*
 ** Licence**
 * Licensed to be compatible with the Scilab CeCILL license.
 */
/* *****Specifictions
 **Algorithm used for convertion from base n>10 and n!=2 to base 10**
 *Series Substitution Algorithm
 **Constraint
 *Can only convert from base between 2 and 32
 */
package number;

/**
 *
 * @author FENN
 */
public class Number {

    protected String Snumber;
    protected int number;
    protected int base;

    //Constructor for numbers with bases less than 10;
    public Number() {
    }

    public Number(int number, int base) {
        this.number = number;
        this.base = base;
    }

    //Constructor for numbers with base greater than 10, they are considered as strings
    public Number(String Snumber, int base) {
        this.Snumber = Snumber;
        this.base = base;
    }

    public String ConvertToBase(int base) {

        int num = this.number;
        String Conversion = "";
        if (this.base < 11 && this.base != 2) {
            while (num > 0) {
                Conversion += Rep(num % base);
                num /= base;
            }
            return Reverse(Conversion);

        } //If the base is greater than 10 theres a probability that the number contains 
        //So use the chars by thier defination(weight) convert to base 10
        //Then convert to the requested base
        //1's and 0's also considered as chars
        else if (this.base > 10 || this.base == 2) {
            int TempNum = 0; //Temporal variable to hold converted number
            char[] arr = this.Snumber.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = 0; j < 32; ++j) {
                    if (arr[i] == Rep(j)) { //If character in position i of string equals char in postion j of char_arr, 
                        TempNum += j * pow(this.base, arr.length - i - 1); //use j as the base 10 value for char i
                    }
                }

            }
            // System.out.println("TempNum :"+TempNum);
            return StringifyToBase(TempNum, base);
        }
        return null;
    }

    //Function to hold base numbers and characters and return them WRT postion
    private char Rep(int position) {
        char[] char_arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W'};
        return char_arr[position];
    }

    //Function for reversing converted strings
    private String Reverse(String str) {
        char arr[] = str.toCharArray();
        String strg = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            strg += arr[i];
        }
        return strg;
    }

    //Function to compute base to the power index
    private int pow(int base, int index) {
        if (index == 0) {
            return 1;
        } else {
            return base * pow(base, index - 1);
        }
    }
    //Functions

    public String StringifyToBase(int num, int base) {
        String Conversion = "";
        while (num > 0) {
            Conversion += Rep(num % base);
            num /= base;
        }
        return Reverse(Conversion);
    }

    public Number[] Sort(Number[] arr) {
        //Method sorts only base 10 numbers, 
        //A conversion of bases orther than 10 has to be done to use the function
        for (int i = 1; i < arr.length; i++) {
            int index = arr[i].number;
            int j = i;
            while (j > 0 && arr[j - 1].number > index) {
                arr[j].number = arr[j - 1].number;
                j--;
            }
            arr[j].number = index;
        }
        return arr;
    }

    public String ToWords(Number number) {
       String dummy;
        
        return null;
    }

    public String[] ToWords(Number[] number) {
       

        return null;
    }
}
