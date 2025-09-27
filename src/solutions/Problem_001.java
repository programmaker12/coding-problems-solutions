package solutions;

import java.util.List;

public class Problem_001 {
    String input;
    List<String> operations;
    public Problem_001(String input, List<String> operations ) {
        this.input = input;
        this.operations = operations;
    }
    public Problem_001() {

    }
    public String shiftAlphabet(String input, List<String> operations) { 

        char [] array1 = input.toCharArray();
        for(String a1 : operations) {
            int start = a1.charAt(0) - '0';
            int end = a1.charAt(2) - '0';
            if(a1.charAt(4) == 'L') {

                for(int i = start; i < end; i++) {
                    if(array1[i] == 'z') {
                        array1[i] = 'a';
                    } else {
                        array1[i] = (char) (array1[i]+1);
                    }
                }
            } else {
                for(int i = start; i < end; i++) {
                    if(array1[i] == 'a') {
                        array1[i] = 'z';
                    } else {
                        array1[i] = (char)(array1[i]-1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : array1) {
            sb.append(ch);
        }

        return "The result is "+sb.toString();
    }
}
