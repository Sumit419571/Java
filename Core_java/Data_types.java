import java.util.*;

public class Data_types {
    public static void main(String[] args) {
        // primitive data types
        byte a=10; // 10 is the literal value of byte type the range is -128 to 127
        short b=20; // 20 is the literal value of short type the range is -32768 to 32767
        int c=30; // 30 is the literal value of int type the range is -2147483648 to 2147483647
        long d=40; // 40 is the literal value of long type the range is -9223372036854775808 to 9223372036854775807
        float e=50.5f; // 50.5 is the literal value of float type the range is -3.40282347E+38 to 3.40282347E+38
        double f=60.5; // 60.5 is the literal value of double type the range is -1.7976931348623157E+308 to 1.7976931348623157E+308
        char g='A'; // 'A' is the literal value of char type the range is 0 to 65535
        boolean h=true; // true is the literal value of boolean type the range is true or false


        // Declare scanner class object
        Scanner sc = new Scanner(System.in);

        // non-primitive data types
        String i;

        // Taking input by scanner class object

        System.out.println("Enter the string ");
        i=sc.nextLine();

        //String is immutable in java and it is a non-primitive data type.
        System.out.println(i);

        int [] j = new int[5];

        System.out.println("Enter 5 number in array");
        for (int k=0; k<5; k++)
        {
            j[k] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int k=0;k<5;k++)
        {
            System.out.println(j[k]);
        }

        // Array is mutable in java and it is a non-primitive data type

    }
}
