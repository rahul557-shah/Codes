/*Q1.Find and Replace Pattern
You have a list of words and a pattern, and you want to know which words in words matches the pattern.
A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
Return a list of the words in words that match the given pattern. 
You may return the answer in any order.
Example 1:
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.
Note:
1 <= words.length <= 50
1 <= pattern.length = words[i].length <= 20*/

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Question1 obj = new Question1();
        System.out.println(obj.findAndReplace(new String[] {"abc","dwq","mee","aqq","dkd","ccc"},"abb"));
    }

    public List<String> findAndReplace(String[] word, String pattern) {
        char[] patternArray = pattern.toCharArray();
        List<String> matchedWordList = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        StringBuffer permutation = new StringBuffer();
        int index = 0;
        for (int i = 0; i < patternArray.length; i++) {
            if (map.get(patternArray[i]) == null) {
                index++;
                map.put(patternArray[i], index);
                permutation.append(index);
            } else {
                permutation.append(map.get(patternArray[i]));
            }
        }
        System.out.println(permutation);
        for (String words : word) {
            map.clear();
            if (words.length() != pattern.length()) {
                continue;
            }
            char[] wordArray = words.toCharArray();
            boolean isMatched = true;
            StringBuffer wordPermutation = new StringBuffer();
            index = 0;
            for (int i = 0; i < wordArray.length; i++) {
                if (map.get(wordArray[i]) == null) {
                    index++;
                    map.put(wordArray[i], index);
                    wordPermutation.append(map.get(wordArray[i]));
                }
                else{
                    wordPermutation.append(map.get(wordArray[i]));
                }
                if(permutation.charAt(i)!=wordPermutation.charAt(i)){
                    isMatched=false;
                    break;
                }
            }
            if(isMatched==true){
                matchedWordList.add(words);
            }
        }
        return matchedWordList;
    }
}