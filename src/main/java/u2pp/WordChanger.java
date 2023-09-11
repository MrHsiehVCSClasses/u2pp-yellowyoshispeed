package u2pp;

public class WordChanger {
    public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
        // Set names
        String idk1 = word1.substring(start1,end1 + 1);
        String idk2 = word2.substring(start2,end2 + 1);
        
        String combString = idk1 + idk2;
    
        return combString;
      }
}
