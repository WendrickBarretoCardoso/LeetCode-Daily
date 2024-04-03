package ano2024.mesApril;

// Easy

public class day02 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] indexS = new int[s.length() * 100];
        int[] indexT = new int[t.length() * 100];
        for (int i = 0; i < s.length(); i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
