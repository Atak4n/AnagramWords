import java.util.Arrays;

public class Main {
    static boolean AnagramCheck(String word, String secondWord) {

        //checking the length of words
        if (word.length() != secondWord.length()) {
            System.out.println("The words entered are not anagrams.");
            return false;
        }
        else {
            //separating the entered words letter by letter and putting them in the charArray
            char[] charWord = word.toCharArray();
            char[] charSecondWord = secondWord.toCharArray();

            //Sorting the letters we assign to the array
            Arrays.sort(charWord);
            Arrays.sort(charSecondWord);

            //Comparing the sorted letters, if they are equal, the console indicates that
            if (Arrays.equals(charWord, charSecondWord)) {
                System.out.println("The words entered are anagrams.");
            }
            return Arrays.equals(charWord, charSecondWord);
        }
    }
    public static void main(String[] args){
        String str = "Fired";
        String str1 = "Fried";
        System.out.println(AnagramCheck(str,str1));

    }
}
