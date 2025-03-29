public class Wrapper_class {
    public static void main(String [] args)
    {
        //Wrapper classes are used to convert primitive data types into objects and vise versa.
        int a = 10;
        Integer b = Integer.valueOf(a); // converting int into Integer this is autoboxing

        System.out.println("The value of a is: " + a + " b is "+ b);
        
        // converting Integer to int this is unboxing

        Integer c = 20;
        int d = c.intValue();
        System.out.println("The value of c is: " + c + " d is "+ d);

        // Autoboxing and unboxing are the process of converting primitive data types into objects and vise versa.
        // Autoboxing is the process of converting primitive data types into objects.
        // Unboxing is the process of converting objects into primitive data types.
    }
}
