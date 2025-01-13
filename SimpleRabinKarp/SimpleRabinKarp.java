package SimpleRabinKarp;

class SimpleRabinKarp {
        public static void main(String text, String pattern) {
            int textLength = text.length();
            int patternLength = pattern.length();
            int base = 256;  
            int prime = 101;
            int patternHash = 0; 
            int textHash = 0;    
            int h = 1;
            for (int i = 0; i < patternLength - 1; i++) {
                h = (h * base) % prime;
            }
            for (int i = 0; i < patternLength; i++) {
                patternHash = (base * patternHash + pattern.charAt(i)) % prime;
                textHash = (base * textHash + text.charAt(i)) % prime;
            }
            for (int i = 0; i <= textLength - patternLength; i++) {
                if (patternHash == textHash) {
                    boolean match = true;
                    for (int j = 0; j < patternLength; j++) {
                        if (text.charAt(i + j) != pattern.charAt(j)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        System.out.println("Pattern found at index " + i);
                    }
                }
                if (i < textLength - patternLength) {
                    textHash = (base * (textHash - text.charAt(i) * h) + text.charAt(i + patternLength)) % prime;
                    if (textHash < 0) {
                        textHash += prime;
                    }
                }
            }
        }
        public static void main(String[] args) {
            String text = "abc abc abc";
            String pattern = "abc";
            main(text, pattern);
        }
    }