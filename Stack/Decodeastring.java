// Java program to decode a string recursively
// encoded as count followed by a substring
import java.util.Stack;

class GfG {
  
    // Function to decode the pattern string 's'
    static String decodedString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        String temp = "";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;

            // If Digit, convert it into a number and
            // push it into the integer stack.
            if (Character.isDigit(s.charAt(i))) {
                while (Character.isDigit(s.charAt(i))) {
                    cnt = cnt * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numStack.push(cnt);
            }
          
            // If closing bracket ']' is encountered
            else if (s.charAt(i) == ']') {
                temp = "";

                cnt = numStack.pop();

                // Pop elements till the opening bracket '[' is found
                // in the character stack.
                while (charStack.peek() != '[') {
                    temp = charStack.pop() + temp;
                }
                charStack.pop(); // Remove '['

                // Repeating the popped string 'temp' count number of times.
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < cnt; j++) {
                    repeated.append(temp);
                }

                // Push it into the character stack.
                for (int j = 0; j < repeated.length(); j++) {
                    charStack.push(repeated.charAt(j));
                }
            } else {
                charStack.push(s.charAt(i));
            }
        }

        // Pop all the elements, make a string, and return.
        while (!charStack.isEmpty()) {
            res.insert(0, charStack.pop());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        System.out.println(decodedString(s));
    }
}
