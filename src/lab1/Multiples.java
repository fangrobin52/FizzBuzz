package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
        }
    public static int multiples(int i, int k, int l) {
        int count = 0;
        for (int j = 1; j < i; j++) {
            boolean divisibleBy3 = j % k == 0;
            boolean divisibleBy5 = j % l == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
        }
        return count;
    }



    }



