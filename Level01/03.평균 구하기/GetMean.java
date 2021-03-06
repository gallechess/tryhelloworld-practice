public class GetMean {

    public int getMean(int[] array) {
        long sum = 0L;
        for (int value : array) {
            sum += value;          
        }
        return (int) (sum / array.length);
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
