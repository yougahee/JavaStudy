import java.util.Arrays;
import java.util.Scanner;

//백준 10809_알파벳찾기
public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[26];
        Arrays.fill(arr, -1);

        Scanner sc =new Scanner(System.in);

        String word = sc.next();
        char[] wordChar = word.toCharArray();

        for(int i=0; i<word.length(); i++) {
            int index = wordChar[i] - 'a';

            if(arr[index] == -1)
            {
                arr[index] = i;
            }

        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
