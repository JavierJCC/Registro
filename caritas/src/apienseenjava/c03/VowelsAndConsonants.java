package apienseenjava.c03;

//: c03:VowelsAndConsonants.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Demonstrates the switch statement.
public class VowelsAndConsonants {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println(
                            "Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
} ///:~