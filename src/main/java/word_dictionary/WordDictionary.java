package word_dictionary;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class WordDictionary {
    private Set<String> dictionary;

    public WordDictionary() {
        this.dictionary = new HashSet<>();
    }

    public void addWord(String word) {
        if (word != null) {
            dictionary.add(word);
        }
    }

    public boolean search(String word) {
        boolean isWord = false;
        if (!word.contains(".")) {
            return dictionary.contains(word);
        }
        Pattern pattern = Pattern.compile(word);
        for (String el : dictionary) {
            if (pattern.matcher(el).find()) {
                isWord = true;
                break;
            }
        }
        return isWord;
    }
}
