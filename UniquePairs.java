import java.util.*;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la longitud del array y el valor objetivo
        int length = scanner.nextInt();
        int targetSum = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        List<Pair> pairs = findUniquePairs(array, targetSum);
        for (Pair pair : pairs) {
            System.out.println(pair);
        }
    }

    public static List<Pair> findUniquePairs(int[] array, int targetSum) {
        //-------------------
        //funcion a completar
        //-------------------
    }

    // Clase para representar un par de numeros
    static class Pair {
        int num1;
        int num2;

        Pair(int num1, int num2) {
            this.num1 = Math.min(num1, num2);
            this.num2 = Math.max(num1, num2);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair pair = (Pair) obj;
            return num1 == pair.num1 && num2 == pair.num2;
        }

        @Override
        public int hashCode() {
            return 31 * num1 + num2;
        }

        @Override
        public String toString() {
            return "(" + num1 + ", " + num2 + ")";
        }
    }
}
