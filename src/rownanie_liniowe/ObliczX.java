package rownanie_liniowe;

import java.io.*;
import java.nio.Buffer;

public class ObliczX {

    public static void main(String [] args)
        throws IOException
    {
        double a, b, c, x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {

            System.out.println("podaj a ");
            a = Double.parseDouble(br.readLine());

            if (a == 0) {
                System.out.println("Nie ma rozwiazan");
            } else {
                System.out.println("podaj b ");
                b = Double.parseDouble(br.readLine());
                System.out.println("podaj c ");
                c = Double.parseDouble(br.readLine());

                x = (c - b) / a;

                System.out.printf("dla a = %2.2f ", a);
                System.out.printf("dla b = %2.2f ", b);
                System.out.printf("dla c = %2.2f ", c);
                System.out.printf("x = %2.2f ", x);
            }

        }
        catch (NumberFormatException exception)
        {
            System.out.println("wprowadzono nie poprawne dane, podaj liczby");
        }
    }
}
