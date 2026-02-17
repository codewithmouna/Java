public class OperatorsCompleteDemo {

    public static void main(String[] args) {

        // ===============================
        // 1. PRIMITIVE DATA TYPES
        // ===============================

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;

        float f = 10.5f;
        double d = 20.5;

        char c1 = 'A';
        char c2 = 'B';

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("===== ARITHMETIC OPERATORS =====");

        // + - * / %
        System.out.println("Addition: " + (i + s));
        System.out.println("Subtraction: " + (l - i));
        System.out.println("Multiplication: " + (b * s));
        System.out.println("Division: " + (d / f));
        System.out.println("Modulus: " + (i % 7));

        System.out.println("\n===== UNARY OPERATORS =====");

        // ++ -- + -
        int x = 5;
        System.out.println("Post Increment: " + (x++));
        System.out.println("After Post Increment: " + x);
        System.out.println("Pre Increment: " + (++x));
        System.out.println("Pre Decrement: " + (--x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Logical NOT: " + (!bool1));

        System.out.println("\n===== ASSIGNMENT OPERATORS =====");

        int assign = 10;
        assign += 5;
        System.out.println("+= : " + assign);
        assign -= 3;
        System.out.println("-= : " + assign);
        assign *= 2;
        System.out.println("*= : " + assign);
        assign /= 4;
        System.out.println("/= : " + assign);
        assign %= 3;
        System.out.println("%= : " + assign);

        System.out.println("\n===== RELATIONAL OPERATORS =====");

        System.out.println("== : " + (i == s));
        System.out.println("!= : " + (i != s));
        System.out.println(">  : " + (l > i));
        System.out.println("<  : " + (b < s));
        System.out.println(">= : " + (i >= 30));
        System.out.println("<= : " + (s <= 25));

        System.out.println("\n===== LOGICAL OPERATORS =====");

        System.out.println("&& : " + (bool1 && bool2));
        System.out.println("|| : " + (bool1 || bool2));
        System.out.println("!  : " + (!bool2));

        System.out.println("\n===== BITWISE OPERATORS =====");

        int bit1 = 5;   // 0101
        int bit2 = 3;   // 0011

        System.out.println("&  : " + (bit1 & bit2));
        System.out.println("|  : " + (bit1 | bit2));
        System.out.println("^  : " + (bit1 ^ bit2));
        System.out.println("~  : " + (~bit1));

        System.out.println("\n===== SHIFT OPERATORS =====");

        System.out.println("<<  : " + (bit1 << 1));
        System.out.println(">>  : " + (bit1 >> 1));
        System.out.println(">>> : " + (bit1 >>> 1));

        System.out.println("\n===== TERNARY OPERATOR =====");

        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Result: " + result);

        System.out.println("\n===== CHAR OPERATIONS =====");

        System.out.println("Char Addition (ASCII): " + (c1 + c2));
        System.out.println("Char Comparison: " + (c1 < c2));

        System.out.println("\n===== TYPE CASTING =====");

        // Implicit Casting
        int num = 100;
        double doubleNum = num;
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        // Explicit Casting
        double decimal = 99.99;
        int intNum = (int) decimal;
        System.out.println("Explicit Casting (double to int): " + intNum);

        System.out.println("\n===== INSTANCEOF OPERATOR =====");

        OperatorsCompleteDemo obj = new OperatorsCompleteDemo();
        System.out.println("obj instanceof OperatorsCompleteDemo: "
                + (obj instanceof OperatorsCompleteDemo));

    }
}
