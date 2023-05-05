package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // =======================zadanie 1=======================================

        String errorMessage = "Something went wrong, probably you gave not enough or wrong data";
        String userMessage = getMessage(errorMessage);
        Character sign = getSign(userMessage);
        Integer firstNumber = firstNumber(userMessage,sign);
        Integer secondNumber = secondNumber(userMessage,sign);
        Integer result = calculator(firstNumber, secondNumber, sign);
        String resultMessage = getResult(firstNumber, secondNumber, sign,result);
        displayResult(resultMessage);


        //=====================zadanie 2=========================================

//        String sentence = getSentence();
//        String cleaningSentence = cleaningSentence(sentence);
//        String result = displayResult(cleaningSentence);

        //===================zadanie 3==========================================

//        String word = getWord();
//        Boolean palindromeTest = palindromeTest(word);
//        if (palindromeTest(word)) System.out.println("Your word is a palindrome");
//        else System.out.println("Your word is not a palindrome");
//
//        Boolean heterogramTest = heterogramTest(word);
//        if (heterogramTest) System.out.println("Your word is a heterogram. ");
//        else System.out.println("Your word is not a heterogram");
//
//        Boolean pangramTest = pangramTest(word);
//        if (pangramTest(word)) System.out.println("Your sentence is pangram.");
//        else System.out.println("Your sentence is not a pangram.");
//
//        String firstSentence = getFirstSentence();
//        String secondSentence = getSecondSentence();
//
//        Boolean anagramTest = anagramTest(firstSentence, secondSentence);
//        if (anagramTest) System.out.println("Your sentences are anagrams.");
//        else System.out.println("Your sentences are not anagrams.");

    }
//======================================= Zadanie 1 =========================================================
/*Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia.
Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.*/



    public static String getMessage(String errorMessage){

        Scanner input = new Scanner(System.in);
        System.out.println("This is a simple calculator, it provides addition, subtraction, multiplication and division of tho numbers");
        String dataMessage = "Please enter mathematical operation: for example: 4 + 5 : ";
        System.out.println(dataMessage);
        String userMessage = input.nextLine().replace("  ",""); // i supposed to get two numbers divided by math sign


        while(userMessage.length()==0){
            System.out.println(errorMessage);
            userMessage = input.nextLine().replace("  ","");
        }

        return userMessage;
    }

    public static Character getSign(String userMessage) {


        Set<Character> mathSign = new HashSet<>(); // mathematical operational sign

        mathSign.add('+');
        mathSign.add('-');
        mathSign.add('/');
        mathSign.add('*');

        // we want to check if user message contains one of the math signs from mathSign Set
        // after if it's possible we would like to split message by this sign, to divide our message.

        Set<Character> userSign = new HashSet<>(); // ??????????????????

        char[] charArray = userMessage.toCharArray();
        Character sign =null;
        for (int i = 0; i < charArray.length; i++) {
            Character s = charArray[i];
            if (mathSign.contains(s)){
                boolean add = userSign.add(s);
                sign=s;
            }
        }

        return sign;
    }

//    --------------------------------------------------------------------------
//     method which i've found on internet

    String[] operators = new String[] {"-","\\+","/","\\*"};

    public static Integer firstNumber (String userMessage, Character sign) {

        // i've also tried to get a value of and after index to know how many characters are before symbol.
        String value = userMessage.valueOf(sign);
        Integer index = userMessage.indexOf(sign);
        String substringBefore = userMessage.substring(0, index);
        String substringAfter = userMessage.substring(index + 1, userMessage.length());
        Integer firstNumber = Integer.parseInt(substringBefore);


        return firstNumber;
    }

    public static Integer secondNumber (String userMessage, Character sign) {


        String value = userMessage.valueOf(sign);
        Integer index = userMessage.indexOf(sign);
        String substringAfter = userMessage.substring(index + 1, userMessage.length());
        Integer secondNumber = Integer.parseInt(substringAfter);

        return secondNumber;
    }

    public static Integer addition(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    public static Integer subtraction(Integer firstNumber, Integer secondNumber) {return firstNumber - secondNumber;
    }

    public static Integer multiplication(Integer firstNumber, Integer secondNumber) {
        return firstNumber * secondNumber;
    }

    public static Integer division(Integer firstNumber, Integer secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        }
        else {
            System.out.println("You can't divide by 0!, start again");
        }
        return null;
    }

    public static Integer calculator(Integer firstNumber, Integer secondNumber, Character sign) {

        switch (sign) {
            case ('+'):
                return addition(firstNumber, secondNumber);
            case ('-'):
                return subtraction(firstNumber, secondNumber);
            case ('*'):
                return multiplication(firstNumber, secondNumber);
            case ('/'):
                return division(firstNumber, secondNumber);
            default:
                return null;
        }
    }

    public static String getResult(Integer firstNumber, Integer secondNumber, Character sign, Integer result) {

        String resultMessage = String.format("%d %s %d = %d", firstNumber, sign, secondNumber, result);

        return resultMessage;
    }

    public static void displayResult(String resultMessage) {
        System.out.println(resultMessage);
    }


//===================================== ZADANIE 2===============================================================

/*Odkurzacz do spacji: napisz program, który oczyszcza dany tekst ze wszystkich nadmiarowych spacji,
pozostawiając tylko pojedyncze między słowami. Np Ala   ma           kota                 -> Ala ma kota */

    //Dekompozycja zadania:.
    //1. Uzytkownik wprowadza dane zdanie- sprawdzic czy jego dlugosc jest wieksza od 0.
    //2. najpierw zdanie oczywszczamy z nadmiarowych spacji z przodu i na koncu zdania.
    //3. Nastepnie zdanie oczyszczamy z nadmiarowych spacji pomiedzy poszczegolnymi wyrazami/znakami.
    //4. Wyswietlamy wynik.


//    public static String getSentence() {
//
//        Scanner input = new Scanner(System.in);
//        String request = "I will remove unnecessary spaces form Your sentence. Enter the sentence: ";
//        String error = "Something went wrong. Please try again.";
//        System.out.println(request);
//        String sentenceToClean = input.nextLine();
//
//        while (sentenceToClean.length() == 0) {
//            System.out.println(error);
//            System.out.println(request);
//            sentenceToClean = input.nextLine();
//        }
//
//        return sentenceToClean;
//    }
//
//    public static String cleaningSentence(String sentenceToClean) {
//
//        //  1 method
//        String trimmedSentence = sentenceToClean.trim(); // removing spaces form the beginning and ent of the sentence
//        String[] splitMessage = trimmedSentence.split(" ");


    //======================================================================= // wyszukane w necie- dziala.
//        String cleanedSentence = trimmedSentence.replaceAll("\\s+", " ");


    //=========================================================================   // tutaj ucina mi wszystkie spacje :/
//        boolean space = true;
//        String cleanedSentence = null;
//        while (space) {
//            cleanedSentence = trimmedSentence.replace(" ", "");
//            if (!cleanedSentence.contains(" ")){
//                space = false;
//            }
//        }
//        //===========================================================================

//
//        return cleanedSentence;
//    }
//
//    public static String displayResult(String cleanedSentence){
//
//        String message= "How your sentence looks like without excessive whitespaces: ";
//        String result = (message.concat(cleanedSentence));
//        System.out.println(result);
//
//        return result;
//    }


// =================================== ZADANIE 3==================================================================

/*Analiza stringów: napisz program, który sprawdza, czy dany string jest palindromem (odczytuje się go tak samo od przodu, jak i od tyłu, np Anna),
 heterogramem (żadna litera się nie powtarza, np Mateusz), pangramem (zawiera wszystkie litery alfabetu łacińskiego,
 np The quick brown fox jumps over a lazy dog), oraz, czy dane dwa stringi są
 anagramami (składają się z tych samych liter, np Tom Marvolo Riddle - I am Lord Voldemort)*/

    // Dekompozycja
    //1. Przyjecie słowa od uzytkownika- sprawdzenie czy wiadomosc jest dluzsza od 0, jezeli uzytkownik uzyje spacji lub innych znakow liczbowych blad.
    // * sprobowac ustawic na sztywno format.
    //2. Kontrola czy slowo jest palindromem-
    // * rozbicie wprowadzonego slowa na pojedyncze charaktery i porownywanie pierwszego z ostatnim, przedostatniego z drugim itp.
    //3. Kontrola czy slowo jest heterogramem- zadna litera sie nie powtarza
    //- slowo nie musi miec parzysta liczbe liter
    //- kazdy charakter wystepujacy w slowie jest inny.
    //4. Czy slowo jest panagramem- zawiera wszystkie litery alfabetu lacisnkiego
    // *stworzyc set/liste liter i sprawdzic czy wszystkie wystepuja.
    //5. przyjecie dwoch zdan od uzytkownika do sprawdzenia czy sa anagramami

//    public static String getWord() {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("I will check if an entered word/sentence is palindrome, heterogram, pangram. Enter Your word/sentence: ");
//        String errorMessage = "Sorry, something went wrong. Please make sure that You entered enough data and try again.";
//        String wordToTest = input.nextLine().toLowerCase();
//
//        while (wordToTest.length() == 0) {
//            System.out.println(errorMessage);
//            wordToTest = input.nextLine().toLowerCase();
//        }
//
//        return wordToTest;
//    }
//
//    public static boolean palindromeTest(String wordToTest) {
//
//        Integer i = 0; // beggining of the word - we will in loop make +1
//        Integer j = wordToTest.length() - 1; // the end of the word, we will check in loop -1
//
//        while (i < j) {
//
//            if (wordToTest.charAt(i) != wordToTest.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//
//        return true;
//    }
//
//    public static boolean heterogramTest(String wordToTest) {
//
//        Set<Character> storageForLetters = new HashSet<>();
//
//        char[] wordToArray = wordToTest.toCharArray();
//
//        for (int i = 0; i < wordToArray.length; i++) {
//            char aChar = wordToArray[i];  // aChar is a character of word to test to Array //
//            boolean addTest = storageForLetters.add(aChar);
//            if (!addTest) {
//                return false;   // true if set doesn't contain the element
//            }
//        }
//        return true;
//    }
//
//    public static boolean pangramTest(String wordToTest) {
//
//        Set<Character> latinAlphabet = new HashSet<>();// latin alphabet counts 26 signs i want to put characters from users sentence besides ,:,.,
//
//        for (int i = 97; i <= 122; i++) { //a way to add letters to array ascii from 97 to 122- small letters
//            char a = (char) i;
//            latinAlphabet.add(a);
//        }
//
//
//        Set<Character> wordToArray = new HashSet<>();
//
//        char[] chars = wordToTest.toCharArray();
//        for (char aChar : chars) {
//            wordToArray.add(aChar);
//        }
//
//        boolean b = wordToArray.containsAll(latinAlphabet);
//        if (b) {
//            return b;
//        }
//
//        return false;
//    }
//
//    public static String getFirstSentence() {
//
//        Scanner input = new Scanner(System.in);
//        String request = "Enter the first sentence";
//        System.out.println(request);
//        String firstSentence = input.nextLine().toLowerCase();
//
//        return firstSentence;
//    }
//
//    public static String getSecondSentence() {
//
//        //anagram- two sentences or words have only the same letters/characters
//
//        Scanner input = new Scanner(System.in);
//        String request = "Enter the second sentence";
//        System.out.println(request);
//        String secondSentence = input.nextLine().toLowerCase();
//
//        return secondSentence;
//    }
//
//    public static boolean anagramTest(String firstSentence, String secondSentence) {
//
//        //anagram- two sentences or words have only the same letters/characters
//        // f.e. Tom Marvolo Riddle - I am Lord Voldemort
//
//        char[] firstArray = firstSentence.toCharArray();
//        Set<Character> firstSet = new HashSet<>();
//
//        for (int i = 0; i < firstArray.length; i++) { // i'm adding the characters from 1st sentence into the 1st set
//            char c = firstArray[i];
//            firstSet.add(c);
//        }
//
//        char[] secondArray = secondSentence.toCharArray();
//        Set<Character> secondSet = new HashSet<>();
//
//        for (int i = 0; i < secondArray.length; i++) {  //i/m addint characters from the 2nd sentence to the 2nd set
//            char c = secondArray[i];
//            secondSet.add(c);
//
//            boolean test = secondSet.containsAll(firstSet);
//            if (test == true) {
//                return true;
//            }
//        }
//        return false;
//    }

}