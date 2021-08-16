package by.minsk.itakademy.arturzimin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static String[] arrayString = {"for", "Hi", "an", "a", "do", "it", "empty"};

    abstract class Type {

    }

    public static void main(String s[]) {


        System.out.println(sortedArrayString(arrayString));


        exc();
        System.out.println(palindromeString("123"));

        System.out.println(fibonacciQuick(100));

        String args = "";
        System.out.println(args + s);

        int number = 123456789;
        System.out.println(reversNumber(number));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(

                sumFromArrayInt(arr));

        System.out.println(

                sortedString("aaammmkkkfffuuutttcccxxxzzz"));

        System.out.println(

                arbitrarySortString("Hello How are you Artur"));


        try {
            int one = 34;
            int zero = 0;
            int two = one / zero;
            System.out.println(two);

            System.out.println("1");
            throw new RuntimeException();
        } catch (ArithmeticException a) {
            System.out.println("2");
            return;
        } catch (Exception e) {
            System.out.println("3");
            return;
        } finally {
            System.out.println("4");
        }


    }

    public static void exc() {
        try {

            throw new NullPointerException("Hi , replace method exc()! ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    public static List sortedArrayString(String [] str) {
        List<StringBuilder> sortedArrayString = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = i + 1; j < arrayString.length; j++) {
                if (arrayString[j].compareToIgnoreCase(arrayString[i]) < 0) {
                    String temp = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = temp;
                }
            }
            stringBuilder.append(arrayString[i] + " ");
        }
        sortedArrayString.add(stringBuilder);

        return sortedArrayString;
    }


    public static boolean palindromeString(String str) {

        int number = str.length() - 1;

        int j = 0;
        while (number > j) {
            if (str.charAt(number) != str.charAt(j)) {
                return false;
            }
            number--;
            j++;
        }
        return true;
    }

    public static long fibonacciQuick(int number) {
        long[] array = new long[number + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= number; i++) {
            array[i] = array[i - 1] + array[i - 2];

        }
        return array[number];
    }


    public static int reversNumber(int number) {
        int reversNum = 0;
        while (number > 0) {
            int remainderOfTheDivision = number % 10;
            number = number / 10;
            reversNum = reversNum * 10 + remainderOfTheDivision;
        }
        return reversNum;
    }

    public static int sumFromArrayInt(int[] arrayInt) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            int element = arrayInt[i];
            sum += element;
        }
        return sum;
    }

    public static String sortedString(String str) {
        char[] stringNoSorted = str.toCharArray();
        Arrays.sort(stringNoSorted);

        return new String(stringNoSorted);

    }

    public static StringBuilder arbitrarySortString(String str) {
        Character[] symbolArray = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            symbolArray[i] = str.charAt(i);
        }
        Arrays.sort(symbolArray, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
            }
        });
        StringBuilder sortedArbitrary = new StringBuilder(symbolArray.length);
        for (Character c : symbolArray) {
            sortedArbitrary.append(c.charValue());
        }
        return sortedArbitrary;
    }

}
