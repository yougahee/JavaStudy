package chapter14;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력");

        try {

            int i;
            //보조스트림 (byte-> 문자)로 변경
            InputStreamReader isr = new InputStreamReader(System.in);
            //inputstream은 1byte씩만 읽는다.
            while ((i = isr.read()) !='끝'){
                System.out.println((char)i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
