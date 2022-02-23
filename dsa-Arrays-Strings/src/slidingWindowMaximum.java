public class slidingWindowMaximum {
    static void printKMax(int arr[], int n, int k)
    {
        int j, max;

        for (int i = 0; i <= n - k; i++) {

            max = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
    public static void main(String[] args) {
int []a={44,77,33,44,88,11};
printKMax(a, a.length, 3);
    }
}
