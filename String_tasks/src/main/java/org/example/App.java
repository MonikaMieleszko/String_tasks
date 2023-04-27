package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String userOperation = getUserOperation();
        Integer number = getVariables(userOperation);
    }
        public static String getUserOperation() {
        System.out.println("Please enter mathematical operation number1 symbol (+, -, *, /) number2:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer getVariables(String userOperation) {
        String[] variables = userOperation.trim().split(" ");
        Integer[] numbersSplit = new Integer[variables.length];
        Integer number = 0;
        for (Integer i=0; i< variables.length; i++) {
            String s = variables.length[i];
            Integer number = Integer.parseInt(s);
            numbersSplit[i] = number;
        }
        System.out.println(number);
        return number;
        }
    }


//Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania,
// mnożenia i dzielenia. Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.
// 1. Pobranie danych od użytkownika (string)
// 2. Dzielimy działanie na poszczególne znaki
// 3. Sprawdzamy czy operator jest obsługiwany
// 4. W zależności od rodzaju operatora wykonujemy działanie
// 5. Tworzymy metodę do wyśietlania wyniku

