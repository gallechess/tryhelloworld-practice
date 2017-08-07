public class PrintTriangle {

    public String printTriangle(int num) {
        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= num; idx++) {
            for (int jdx = 1; jdx <= idx; jdx++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(3) );
    }

}
