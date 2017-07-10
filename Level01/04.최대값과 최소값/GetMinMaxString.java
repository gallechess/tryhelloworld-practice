public class GetMinMaxString {

    public String getMinMaxString(String str) {
        String[] strValues = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String value : strValues) {
            int intValue = Integer.parseInt(value);
            if (intValue < min) {
                min = intValue;
            }
            if (intValue > max) {
                max = intValue;
            }
        }
        return String.valueOf(min) + " " + String.valueOf(max);
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
