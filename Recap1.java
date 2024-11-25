public class Recap1 {
    public static void main(String[] args) {
        /*
        EVERYTHING FROM STRINGS
        The first we will meet is length(), which returns the length of the string

        It's possible to combine strings using the + operator,

String str1 = "Hello";
String str2 = "World";
System.out.println(str1 + " " + str2);
The string "Hello World" will be printed in the above example.

Note the space (" ") added in between str1 and str2

Or, use the concat() method,

String str1 = "Hello ";
String str2 = "World";
System.out.println(str1.concat(str2));


To access separate characters in a string, we can use index.

The index of the first character is 0, the second character is 1, and so on.

To access it, use the charAt() method,

String myStr = "Hello";
char result = myStr.charAt(0);
In the above example, result will hold the character H.



                Let's learn some more string methods related to substrings!

To get a substring (portion of a string) of some string in Java use the method substring() with the start and end index(s),

String word = "howareyou";
String sub = word.substring(3, 6);
In the above example, sub will hold the string "are" because the 3rd index is the character 'a' and the 6th index is the character 'y' but the end index is excluded.

Remember! indexes are starting from 0 (like in charAt() method)

Another important method is indexOf() which returns the position of the first found occurrence of a specified character(s) in a string,

String sentence = "how$are$you";
int i = word.indexOf("$"); // Returns 3
String sub = sentence.substring(0, i);
In the above example, we find the position of the first occurrence of "$" in sentence, in the end sub will hold "how".

Note! If you use substring() with just one argument, for example s.substring(2), it will return the substring from the 2nd index to the end!

The last method we will learn here is contains() which checks whether a string contains a sequence of characters,

String sentence = "how$are$you";
boolean res1 = sentence.contains("$$"); // Returns false
boolean res2 = sentence.contains('$'); // Returns true
boolean res2 = sentence.contains("are"); // Returns


String example = "Hello World";
String upper = example.toUpperCase();
output: "HELLO WORLD"

String example = "HelLO WOrld";
String lower = example.toLowerCase();
output: "hello world"


         */
        class IsNumber {
            public static boolean isNumber(String s) {
                if (s == null || s.isEmpty()) {
                    return false;
                }
                return true;
            }
            public static void main(String[] args) {
                System.out.println(isNumber("123456"));  // Output: true
                System.out.println(isNumber("12a456"));  // Output: false
                System.out.println(isNumber("123 456")); // Output: false
                System.out.println(isNumber(""));        // Output: false
            }
        }
    }
}
