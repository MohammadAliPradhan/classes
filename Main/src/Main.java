

import java.util.*; // contains Collections framework


public class Main {


        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                int t = scanner.nextInt();
                while (t-- > 0) {
                    int n = scanner.nextInt();
                    long max = findMaxCyclicShift(n);
                    System.out.println(max);
                }
            }
        }

        private static long findMaxCyclicShift(int n) {
            String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
            long max = n;
            for (int i = 0; i < 31; i++) {
                binaryString = binaryString.substring(1) + binaryString.charAt(0);
                long shiftedNumber = Long.parseLong(binaryString, 2);
                if (shiftedNumber > max && shiftedNumber <= 4294967295L) {
                    max = shiftedNumber;
                }
            }
            return max;
        }

}