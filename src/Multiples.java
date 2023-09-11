public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        int currNum = 1;
        while (currNum < 1000){
            boolean multipleOf3 = currNum % 3 == 0;
            boolean multipleOf5 = currNum % 5 == 0;
            if (multipleOf5 || multipleOf3){
                total++;
            }
            currNum++;
        }
        System.out.println(total);
    }
}
