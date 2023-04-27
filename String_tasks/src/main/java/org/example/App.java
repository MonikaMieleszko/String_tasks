package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


//        String userOperation = getUserOperation();
//        Integer number = getVariables(userOperation);
        messageWithoutSpaceAtTheEnd();
        messageWithReplacedSpaces();


    }

//        public static String getUserOperation() {
//        System.out.println("Please enter mathematical operation number1 symbol (+, -, *, /) number2:");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//
//    public static String getVariables(String userOperation) {
//        String[] variables = userOperation.trim().split(" ");
//        Integer[] numbersSplit = new Integer[variables.length];
//        Integer number = 0;
//        for (Integer i=0; i< variables.length; i++) {
//
//            String s = variables[i];
//            number = Integer.parseInt(s);
//            numbersSplit[i] = number;
//        }
//        System.out.println(number);
//        return number;
//        }
//    }


//Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania,
// mnożenia i dzielenia. Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.
// 1. Pobranie danych od użytkownika (string)
// 2. Dzielimy działanie na poszczególne znaki
// 3. Sprawdzamy czy operator jest obsługiwany
// 4. W zależności od rodzaju operatora wykonujemy działanie
// 5. Tworzymy metodę do wyśietlania wyniku

//================================ zadanie 2=========================================

    // 1. Usuniecie spacji z konca zdania
    // 2. Zastapienie nadmiarowych spacji na pojedyncza

    public static String messageWithoutSpaceAtTheEnd() {

        String toClear = "Ala      ma              kota            ";
        String withoutSpacesAtEnd = toClear.trim();
        System.out.println(withoutSpacesAtEnd);
        return withoutSpacesAtEnd;
    }

    public static String messageWithReplacedSpaces(String withoutSpacesAtEnd, String withoutSpaces) {


        for(Integer i=0; i< )
            withoutSpaces = withoutSpacesAtEnd.replace(" ", " ");

        }
        System.out.println(withoutSpaces);
        return withoutSpaces;
    }

}