package Function;

public class Function02 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int num = self_num(i);

            if (num < 10001) {
                check[num] = true;
            }
        }
        for(int i = 1; i < 10001; i++) {
            if(!check[i]) {
                System.out.println(i);;
            }
        }
    }
    public static int self_num(int num) {
        int sum = num;

        while(num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
