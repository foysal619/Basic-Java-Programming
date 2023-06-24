// 16. Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY

public class EncryptWord {
        public static void main(String[] args) {
            String word = "ROADTOSDET";
            String encryptedWord = encrypt(word, 'A', 'F');
            System.out.println("Encrypted word: " + encryptedWord);
        }

        public static String encrypt(String word, char originalChar, char replacementChar) {
            StringBuilder encryptedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);

                if (Character.isLetter(currentChar)) {
                    char encryptedChar = (char) (currentChar + (replacementChar - originalChar));

                    if (encryptedChar > 'Z') {
                        encryptedChar = (char) ('A' + (encryptedChar - 'Z' - 1));
                    }

                    encryptedWord.append(encryptedChar);
                } else {
                    encryptedWord.append(currentChar);
                }
            }

            return encryptedWord.toString();
        }
    }



