public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
        }
        public static int multiples(int i, int a, int b) {
        int count = 0;
        for (int j = 1; j < i; j++) {
            boolean divisibleBya = j % a == 0;
            boolean divisibleByb = j % b == 0;

            if (divisibleBya || divisibleByb) {
                count++;
            }
        }
        return count;
    }



    }



