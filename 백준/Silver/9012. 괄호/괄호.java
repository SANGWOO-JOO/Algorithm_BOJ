import java.util.*;
public class Main {
    public static String isValid(String s) {
        int n = s.length();
        int cnt = 0; // 스택의 크기

        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '(') { // 여는 괄호
                cnt += 1; // Push == 1
            } else {
                cnt -= 1; // pop == - 1
            }
            if (cnt < 0) { // 여는 괄호가 없는데 닫아버릴때
                return "NO"; // 여는 괄호가 부족한 경우
            }
        } // 모든 과정 끝
        if (cnt == 0) {
            return "YES"; // 스택이 비어 있다
        } else {
            return "NO"; //닫는 괄호가 부족
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println(isValid(sc.next()));
        }
    }
}