public class Quick_sort1 {

    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        do {
            do { i++; } while (arr[i] <= pivot);
            do { j--; } while (arr[j] > pivot);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        } while (i < j);

        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            quicksort(arr, l, j);
            quicksort(arr, j + 1, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 8, 9, 3, 10, 15, 12, 16, Integer.MAX_VALUE};

        int n = arr.length;

        quicksort(arr, 0, n - 1);

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}