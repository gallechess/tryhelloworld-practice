import java.util.Arrays;

public class ReverseStr {

    public String reverseStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(String.valueOf(chars)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }

}
