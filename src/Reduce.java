public class Reduce {
    public static void main(String[] args) {
        int startNum = 100;
        int endNum = 0;
        int total = 0;
        while (startNum != endNum){
            if (startNum % 2 == 0){
                startNum /= 2;
            }else {
                startNum -= 1;
            }
            total++;
        }
        System.out.println(total);
    }
}
