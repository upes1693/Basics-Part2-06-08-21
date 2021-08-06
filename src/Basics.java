import java.text.MessageFormat;

public class Basics {
    public static void main(String[] args) {
        System.out.println();

        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt + 2);//Overflow
        System.out.println(Integer.MIN_VALUE - 2);//Underflow

        // 10 and 15 are operands
        int sum = 10 + 15;

        int x = 1;
        int y = 2;
        // x and y are the operands
        int sum2 = x + y;

        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        //Implicit casting
        byte myByte = 5;
        int myInt = myByte;

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte
        //Explicit casting
        int anotherInt = 128;
        myByte = (byte) anotherInt;
        System.out.println(myByte);

        double myDouble = 50.88888;
        int doubleInInt = (int) myDouble;
        System.out.println(doubleInInt);

        int charInInt = (int) 'd';
        System.out.println(charInInt);
        String myStr = "Hello world";

        String name = "Mark";
        int age = 25;
        String phoneNumber = "050505050";
//        System.out.printf("Hello everyone my name is: %s and my age is %d.\nPhone number: %s",name,age, phoneNumber);
        String formattedStr = String.format("Hello everyone my name is: %s and my age is %d.\nPhone number: %s", name, age, phoneNumber);
        //  System.out.println(formattedStr);

        String msg = MessageFormat.format
                ("Hello everyone my name is: {0} and my age is {1}.\nPhone number: {2}",
                        name, age, phoneNumber);
        System.out.println(msg);

        String color = "red";

        //If statement can contain 3 parts: if , else if , else

        if (color == "red") {
            System.out.println("The color is red");
        } else if (color == "blue") {
            System.out.println("The color is blue");
        } else {
            System.out.println("Unknown color");
        }

        //Conditional operators: == != > >= < <= && ||
        int myInt2 = 11;

        if (myInt2 == 10) {
            System.out.println("equal");
        }

        if (myInt2 != 10) {
            System.out.println("not equal");
        }

        if (myInt2 > 11) {
            System.out.println("larger than 5");
        }

        int grade = 90;
//        if (grade > 80 && grade < 90) {
//            System.out.println("Almost good");
//        }

        if(grade>100||grade<=90){
            System.out.println("almost good");
        }

        String color2 ="red";
        if (color=="red"||color=="green"){
            System.out.println("red or green");
        }
    }
}
