// Searching Challenge
// Have the function SearchingChallenge(str) take the str parameter being passed and return the first word with the greatest number of repeated letters.
// For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's.
// If there are no words with repeating letters return -1. Words will be separated by spaces.
// Once your function is working, take the final output string and combine it with your ChallengeToken, both in reverse order and separated by a colon.

// Your ChallengeToken: 19a4k7ogl65c
// Examples
// Input: "Hello apple pie"
// Output: Hello
// Final Output: olleH:c56lgo7k4a91
// Input: "No words"
// Output: -1
// Final Output: 1-:c56lgo7k4a91


package coderbyte.medium;

class SearchingChallenge {

    public static String SearchingChallenge(String str) {
        // code goes here
        String[] words;
        words = str.split(" ");
        int maxWordNr = 0;
        int maxLettersInWord = 0;
        for (int j = 0; j < words.length; j++){
            int maxCounted = 0;
            char[] word = words[j].toCharArray();
            for (char c : word) {
                int count = 1;
                for (int k = 1; k < word.length; k++) {
                    if (c == word[k]) {
                        count++;
                    }
                    if (maxCounted < count) maxCounted = count;
                }
            }
            if (maxCounted > maxLettersInWord)
            {
                maxWordNr = j;
                maxLettersInWord = maxCounted;
            }
        }
        char ch;
        String stringToReverse = words[maxWordNr] + ":c56lgo7k4a91";
        String tempString = "";
        for (int k = 0; k < stringToReverse.length(); k++)
        {
            ch = stringToReverse.charAt(k);
            tempString = ch + tempString;
        }
        return tempString;
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        //System.out.print(SearchingChallenge(s.nextLine()));
        System.out.print(SearchingChallenge("Mysz na kajaku"));
    }
}