import java.nio.charset.Charset;
import java.util.Locale;

public class StringMethodsDemo {

    public static void main(String[] args) throws Exception {

        String str = "Hello World";
        String str2 = "hello world";
        char[] charArray = {'J','A','V','A'};

        // 1. charAt()
        System.out.println("1: " + str.charAt(1)); // e

        // 2. codePointAt()
        System.out.println("2: " + str.codePointAt(1));

        // 3. codePointBefore()
        System.out.println("3: " + str.codePointBefore(1));

        // 4. codePointCount()
        System.out.println("4: " + str.codePointCount(0, str.length()));

        // 5. compareTo()
        System.out.println("5: " + str.compareTo(str2));

        // 6. compareToIgnoreCase()
        System.out.println("6: " + str.compareToIgnoreCase(str2));

        // 7. concat()
        System.out.println("7: " + str.concat(" Java"));

        // 8. contains()
        System.out.println("8: " + str.contains("World"));

        // 9. contentEquals(CharSequence)
        System.out.println("9: " + str.contentEquals("Hello World"));

        // 10. contentEquals(StringBuffer)
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("10: " + str.contentEquals(sb));

        // 11. copyValueOf(char[])
        System.out.println("11: " + String.copyValueOf(charArray));

        // 12. copyValueOf(char[], offset, count)
        System.out.println("12: " + String.copyValueOf(charArray,1,2));

        // 13. endsWith()
        System.out.println("13: " + str.endsWith("World"));

        // 14. equals()
        System.out.println("14: " + str.equals(str2));

        // 15. equalsIgnoreCase()
        System.out.println("15: " + str.equalsIgnoreCase(str2));

        // 16. format(Locale,...)
        System.out.println("16: " + String.format(Locale.US,"%.2f",12.3456));

        // 17. format()
        System.out.println("17: " + String.format("Name: %s Age: %d","John",25));

        // 18. getBytes()
        byte[] bytes1 = str.getBytes();
        System.out.println("18: " + bytes1.length);

        // 19. getBytes(Charset)
        byte[] bytes2 = str.getBytes(Charset.forName("UTF-8"));
        System.out.println("19: " + bytes2.length);

        // 20. getBytes(String)
        byte[] bytes3 = str.getBytes("UTF-8");
        System.out.println("20: " + bytes3.length);

        // 21. getChars()
        char[] dest = new char[5];
        str.getChars(0,5,dest,0);
        System.out.println("21: " + new String(dest));

        // 22. hashCode()
        System.out.println("22: " + str.hashCode());

        // 23. indexOf(char)
        System.out.println("23: " + str.indexOf('o'));

        // 24. indexOf(char, fromIndex)
        System.out.println("24: " + str.indexOf('o',5));

        // 25. indexOf(String)
        System.out.println("25: " + str.indexOf("World"));

        // 26. indexOf(String, fromIndex)
        System.out.println("26: " + str.indexOf("o",5));

        // 27. intern()
        String s3 = new String("Hello").intern();
        System.out.println("27: " + (s3 == "Hello"));

        // 28. isEmpty()
        System.out.println("28: " + "".isEmpty());

        // 29. lastIndexOf(char)
        System.out.println("29: " + str.lastIndexOf('o'));

        // 30. lastIndexOf(char, fromIndex)
        System.out.println("30: " + str.lastIndexOf('o',5));

        // 31. lastIndexOf(String)
        System.out.println("31: " + str.lastIndexOf("o"));

        // 32. lastIndexOf(String, fromIndex)
        System.out.println("32: " + str.lastIndexOf("o",5));

        // 33. length()
        System.out.println("33: " + str.length());

        // 34. matches()
        System.out.println("34: " + str.matches("Hello.*"));

        // 35. offsetByCodePoints()
        System.out.println("35: " + str.offsetByCodePoints(0,2));

        // 36. regionMatches(ignoreCase,...)
        System.out.println("36: " + str.regionMatches(true,0,str2,0,5));

        // 37. regionMatches()
        System.out.println("37: " + str.regionMatches(0,"Hello",0,5));

        // 38. replace(char,char)
        System.out.println("38: " + str.replace('o','X'));

        // 39. replace(CharSequence,CharSequence)
        System.out.println("39: " + str.replace("World","Java"));

        // 40. replaceAll(regex,replacement)
        System.out.println("40: " + str.replaceAll("o","@"));

        // 41. replaceFirst()
        System.out.println("41: " + str.replaceFirst("o","@"));

        // 42. split(regex)
        String[] arr1 = str.split(" ");
        System.out.println("42: " + arr1[0]);

        // 43. split(regex,limit)
        String[] arr2 = str.split(" ",2);
        System.out.println("43: " + arr2[1]);

        // 44. startsWith(prefix)
        System.out.println("44: " + str.startsWith("Hello"));

        // 45. startsWith(prefix,toffset)
        System.out.println("45: " + str.startsWith("World",6));

        // 46. subSequence()
        System.out.println("46: " + str.subSequence(0,5));

        // 47. substring(beginIndex)
        System.out.println("47: " + str.substring(6));

        // 48. substring(beginIndex,endIndex)
        System.out.println("48: " + str.substring(0,5));

        // 49. toCharArray()
        char[] arr = str.toCharArray();
        System.out.println("49: " + arr[0]);

        // 50. toLowerCase()
        System.out.println("50: " + str.toLowerCase());

        // 51. toLowerCase(Locale)
        System.out.println("51: " + str.toLowerCase(Locale.US));

        // 52. toString()
        System.out.println("52: " + str.toString());

        // 53. toUpperCase()
        System.out.println("53: " + str.toUpperCase());

        // 54. toUpperCase(Locale)
        System.out.println("54: " + str.toUpperCase(Locale.US));

        // 55. trim()
        System.out.println("55: " + "  Java  ".trim());

        // 56. valueOf(boolean)
        System.out.println("56: " + String.valueOf(true));

        // 57. valueOf(char)
        System.out.println("57: " + String.valueOf('A'));

        // 58. valueOf(char[])
        System.out.println("58: " + String.valueOf(charArray));

        // 59. valueOf(char[],offset,count)
        System.out.println("59: " + String.valueOf(charArray,1,2));

        // 60. valueOf(double)
        System.out.println("60: " + String.valueOf(10.5));

        // 61. valueOf(float)
        System.out.println("61: " + String.valueOf(5.5f));

        // 62. valueOf(int)
        System.out.println("62: " + String.valueOf(100));

        // 63. valueOf(long)
        System.out.println("63: " + String.valueOf(100000L));

        // 64. valueOf(Object)
        Object obj = 123;
        System.out.println("64: " + String.valueOf(obj));
    }
}
