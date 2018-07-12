package apienseenjava.c02;

//: c02:HelloDate.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.util.*;

/**
 * The first Thinking in Java example program. Displays a string and today's
 * date.
 *
 * @author Bruce Eckel
 * @author www.BruceEckel.com
 * @version 2.0
 */
public class HelloDate {
    /**
     * Sole entry point to class & application
     *
     * @param args array of string arguments
     * @return No return value
     * @exception exceptions No exceptions thrown
     */
    public static void main( String [] args ) {
//        System.out.println( "Hello, it's: " );
//        System.out.println( new Date() );
        FechaDelSistema fecha = new FechaDelSistema();
        fecha.imprimirFecha("Hello, it's: ");
    }
} ///:~