package ControlFlow;

public class LoopTagsSearch {
    public static void main(String[] args) {
        // Search for a word in a phrase or sentence. See how many times it appears on the phrase
        String phrase = "Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter Piper picked. If Peter Piper picked a peck of pickled peppers, where’s the peck of pickled peppers Peter Piper picked?";

        String word = "peck";

        int maxWord = word.length();
        int maxChar = phrase.length() - maxWord;
        int count = 0;
        phrase = phrase.toLowerCase();

        search:
        for (int i = 0; i <= maxChar;) {
            int k = i;
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue search;
                }
            }
            count++;
            i = i + maxWord;
        }
        System.out.println("Found the word '" + word + "' " + count + " times in the phrase");
    }
}
