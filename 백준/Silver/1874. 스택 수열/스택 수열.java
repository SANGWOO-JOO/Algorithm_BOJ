import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();    //문자열을 만들어 준다.

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        // N 번 반복
        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }   start = value;
        }else if(stack.peek() != value){
                System.out.println("NO");
                return;

            }
            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}