package ano2024.mesApril;

// Easy

// Return the length of the lart word

// Ex: "The last moon"  Moon = 4 of length

public class day01 {
    public int lengthOfLastWord(String s) {
        String[] splS = s.split(" ");
        return splS[splS.length - 1].length();
    }
}
