
/**
 * 1.1 Concatenates two strings.
 *
 * @param a first string
 * @param b second string
 * @return concatenated string
 */
public static String concat(String a, String b) {
    return a + b;
}

/**
 * 1.2 Concatenates two integers and a string.
 *
 * @param a first number
 * @param b second number
 * @param c string
 * @return concatenated string
 */
public static String concat(int a, int b, String c) {
    return a + "" + b + c;
}

/**
 * 1.3 Concatenates a string, integer and another string.
 *
 * @param a first string
 * @param b number
 * @param c second string
 * @return concatenated string
 */
public static String concat(String a, int b, String c) {
    return a + b + c;
}

/**
 * 1.4 Concatenates two strings and two integers.
 *
 * @param a first string
 * @param b first number
 * @param c second number
 * @param d second string
 * @return concatenated string
 */
public static String concat(String a, int b, int c, String d) {
    return a + b + c + d;
}

/**
 * 2. Prints every word on a new line.
 *
 * @param line input string
 */
public static void printWords(String line) {
    System.out.println(line.replace(" ", "\n"));
}

/**
 * 3. Reverses a string.
 *
 * @param text input string
 * @return reversed string
 */
public static String reverse(String text) {
    String result = "";

    for (int i = text.length() - 1; i >= 0; i--) {
        result += text.charAt(i);
    }

    return result;
}

/**
 * 4. Counts occurrences of a substring.
 *
 * @param line input text
 * @param token substring to find
 * @return number of occurrences
 */
public static int countSubString(String line, String token) {
    int count = 0;
    int index = 0;

    while ((index = line.indexOf(token, index)) != -1) {
        count++;
        index += token.length();
    }

    return count;
}

/**
 * 5. Converts a string to uppercase using String.
 *
 * @param text input string
 * @return uppercase string
 */
public static String toUpper(String text) {
    return text.toUpperCase();
}

/**
 * 5. Converts a string to uppercase using StringBuilder.
 *
 * @param text input string
 * @return uppercase string
 */
public static String toUpperBuilder(String text) {
    StringBuilder sb = new StringBuilder(text);

    for (int i = 0; i < sb.length(); i++) {
        sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
    }

    return sb.toString();
}

/**
 * 6. Fills a string with '*' up to 20 characters.
 *
 * @param text input string
 * @return string with length 20
 */
public static String fillString(String text) {
    if (text.length() >= 20) {
        return text.substring(0, 20);
    }

    return text + "*".repeat(20 - text.length());
}

/**
 * 7. Removes all 'a' characters using String.
 *
 * @param text input string
 * @return string without 'a'
 */
public static String removeA(String text) {
    return text.replace("a", "");
}

/**
 * 7. Removes all 'a' characters using StringBuilder.
 *
 * @param text input string
 * @return string without 'a'
 */
public static String removeABuilder(String text) {
    StringBuilder sb = new StringBuilder(text);

    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) == 'a') {
            sb.deleteCharAt(i);
            i--;
        }
    }

    return sb.toString();
}

/**
 * 8. Replaces all 'a' characters with '*'.
 *
 * @param text input string
 * @return modified string
 */
public static String replaceA(String text) {
    return text.replace("a", "*");
}

/**
 * 9. Finds the longest word in a sentence.
 *
 * @param text input sentence
 * @return longest word
 */
public static String longestWord(String text) {
    String[] words = text.split(" ");
    String longest = "";

    for (String word : words) {
        if (word.length() > longest.length()) {
            longest = word;
        }
    }

    return longest;
}

/**
 * 10. Finds the index of the first occurrence of a string.
 *
 * @param text input string
 * @param c string to find
 * @return index of first occurrence, or -1
 */
public static int findIndex(String text, String c) {
    return text.indexOf(c);
}

/**
 * 11. Prints substring from index 0 to n using String.
 *
 * @param line input string
 * @param n ending index (exclusive)
 */
public static void printSubLine(String line, int n) {
    System.out.println(line.substring(0, n));
}

/**
 * 11. Prints substring from index 0 to n using StringBuilder.
 *
 * @param line input StringBuilder
 * @param n ending index (exclusive)
 */
public static void printSubLine(StringBuilder line, int n) {
    System.out.println(line.substring(0, n));
}

/**
 * 12. Checks whether a string is not null and not empty.
 *
 * @param text input string
 * @return true if string is not null and not empty
 */
public static boolean isNotEmpty(String text) {
    return text != null && !text.isEmpty();
}

/**
 * 13. Splits a sentence by commas and finds the longest part.
 *
 * @param text input sentence
 * @return longest part
 */
public static String longestPart(String text) {
    String[] parts = text.split(",");
    String longest = "";

    for (String part : parts) {
        part = part.trim();

        if (part.length() > longest.length()) {
            longest = part;
        }
    }

    return longest;
}
