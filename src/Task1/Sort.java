package Task1;

public class Sort {
    public static int sort(int[] arr) {
        int countIteration = 0;
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            countIteration++;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return countIteration;
    }
}
