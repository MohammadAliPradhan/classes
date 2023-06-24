import java.util.Scanner;

public class divideand {

        public static void dosomething(int arr[], int n) {
            int count = mergeSort(arr, 0, n-1);
            System.out.print(count);
        }

        public static int mergeSort(int arr[], int l, int r) {
            int count = 0;
            if (l < r) {
                int m = (l + r) / 2;
                count += mergeSort(arr, l, m);
                count += mergeSort(arr, m+1, r);
                count += merge(arr, l, m, r);
            }
            return count;
        }

        public static int merge(int arr[], int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[m + 1 + j];
            }

            int i = 0, j = 0, k = l;
            int count = 0;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                    count += (n1 - i);
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            dosomething(arr, n);
        }
    }


