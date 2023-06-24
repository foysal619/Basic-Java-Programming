// 15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10

public class CountTheNumberOfWords {
        public static void main(String[] args) {
            String input = "I live in Bangladesh";

            String[] words = input.split("\\s+");
            int wordCount = words.length;
            int charCountWithoutSpaces = input.replace(" ", "").length();
            int vowelCount = 0;
            int consonantCount = 0;
            String lowercaseInput = input.toLowerCase();
            for (int i = 0; i < lowercaseInput.length(); i++) {
                char ch = lowercaseInput.charAt(i);
                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters without spaces: " + charCountWithoutSpaces);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }
    }

