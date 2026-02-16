// Important String Methods for Interviews
// Java String class by Oracle Corporation
// Focused only on frequently asked methods

public class ImportantStringInterviewMethods {

    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "hello world";
        String sample = "banana";

        // ======================================================
        // 1. equals()  (Value comparison - Case Sensitive)
        // ======================================================
        System.out.println("1. equals(): " + str.equals(str2)); // false

        // ======================================================
        // 2. equalsIgnoreCase()
        // ======================================================
        System.out.println("2. equalsIgnoreCase(): " + str.equalsIgnoreCase(str2)); // true

        // ======================================================
        // 3. compareTo()  (Lexicographical comparison)
        // ======================================================
        System.out.println("3. compareTo(): " + "Apple".compareTo("Banana"));
        // Negative value because Apple < Banana

        // ======================================================
        // 4. length()
        // ======================================================
        System.out.println("4. length(): " + str.length()); // 11

        // ======================================================
        // 5. charAt()
        // ======================================================
        System.out.println("5. charAt(): " + str.charAt(1)); // e

        // ======================================================
        // 6. indexOf()
        // ======================================================
        System.out.println("6. indexOf(): " + str.indexOf("World")); // 6

        // ======================================================
        // 7. lastIndexOf()
        // ======================================================
        System.out.println("7. lastIndexOf(): " + sample.lastIndexOf("a")); // 5

        // ======================================================
        // 8. contains()
        // ======================================================
        System.out.println("8. contains(): " + str.contains("Hello")); // true

        // ======================================================
        // 9. substring(beginIndex)
        // ======================================================
        System.out.println("9. substring(begin): " + str.substring(6)); // World

        // ======================================================
        // 10. substring(beginIndex, endIndex)
        // End index is excluded
        // ======================================================
        System.out.println("10. substring(begin,end): " + str.substring(0,5)); // Hello

        // ======================================================
        // 11. toUpperCase()
        // ======================================================
        System.out.println("11. toUpperCase(): " + str.toUpperCase());

        // ======================================================
        // 12. toLowerCase()
        // ======================================================
        System.out.println("12. toLowerCase(): " + str.toLowerCase());

        // ======================================================
        // 13. trim()
        // Removes leading and trailing spaces
        // ======================================================
        System.out.println("13. trim(): " + "   Java   ".trim());

        // ======================================================
        // 14. isEmpty()
        // ======================================================
        System.out.println("14. isEmpty(): " + "".isEmpty()); // true

        // ======================================================
        // 15. replace(char, char)
        // ======================================================
        System.out.println("15. replace(): " + str.replace('o','X'));

        // ======================================================
        // 16. replaceAll(regex, replacement)
        // Uses Regular Expression
        // ======================================================
        System.out.println("16. replaceAll(): " + "abc123".replaceAll("[0-9]",""));

        // ======================================================
        // 17. split()
        // ======================================================
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("17. split(): " + fruits[1]); // banana

        // ======================================================
        // 18. startsWith()
        // ======================================================
        System.out.println("18. startsWith(): " + str.startsWith("Hello"));

        // ======================================================
        // 19. endsWith()
        // ======================================================
        System.out.println("19. endsWith(): " + str.endsWith("World"));

        // ======================================================
        // 20. matches()  (Regex validation)
        // ======================================================
        System.out.println("20. matches(): " + "abc123".matches("[a-z0-9]+"));

        // ======================================================
        // 21. valueOf()  (Primitive to String)
        // ======================================================
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("21. valueOf(): " + numStr);

        // ======================================================
        // 22. getBytes()
        // Used in file handling / networking
        // ======================================================
        byte[] bytes = str.getBytes();
        System.out.println("22. getBytes(): Length = " + bytes.length);
    }
}
