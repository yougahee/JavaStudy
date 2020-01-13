package array;

public class ArrayTest {

    public static void main(String[] args) {

        char[] arr  = new char[26];

        //대문자 A~Z까지 저장, 출력

        for(int i=0; i<arr.length; i++){
            arr[i] = (char)('A'+i);
            System.out.println(arr[i]);
        }

    }
}
