public class Ordenamiento {
    public static void main(String[] args) {
        int[] arr = {43, 34, 25, 12, 22, 11, 50};
        int[] arrBubble = arr;
        int[] arrInsertion = arr;
        int[] arrSelection = arr;

        System.out.println("Arreglo original:");
        printArray(arr);

        System.out.println("Bubble Sort:");
        bubbleSort(arrBubble);
        printArray(arrBubble);

        System.out.println("Selection Sort:");
        printArray(arrSelection);

        System.out.println("Insertion Sort:");
        insertionSort(arrInsertion);
        printArray(arrInsertion);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

        public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
