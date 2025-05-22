import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ordenamientos {

    public Ordenamientos(){
    }

    public <T extends Comparable<T>> void insercion(T[] a, int n){
        T aux;
        int k;
        for(int i=1; i<n; i++){
            aux = a[i];
            k = i-1;
            while(k >= 0 && aux.compareTo(a[k]) < 0){
                a[k+1] = a[k];
                k = k - 1;
            }
            a[k+1] = aux;
        }
    }

    public <T extends Comparable<T>> void seleccion(T[] a, int n){
        T menor;
        int k;
        for(int i=0; i<n-1; i++){
            menor = a[i];
            k = i;
            for(int j=i+1; j<n; j++){
                if(a[j].compareTo(menor) < 0){
                    menor = a[j];
                    k = j;
                }
            }
            a[k] = a[i];
            a[i] = menor;
        }
    }

    public <T extends Comparable<T>> void shell(T[] a, int n){
        int inter = n+1;
        boolean band;
        int i;
        T aux;
        while(inter > 0){
            inter = inter/2;
            band = true;
            while(band){
                band = false;
                i = 0;
                while((i + inter) < n){
                    if(a[i].compareTo(a[i + inter]) > 0){
                        aux = a[i];
                        a[i] = a[i + inter];
                        a[i + inter] = aux;
                        band = true;
                    }
                    i++;
                }
            }
        }
    }

    public <T extends Comparable<T>> void recursivo(T[] array, int ini, int fin) {
    if (ini < fin) {
        int pivotIndex = partition(array, ini, fin);
        recursivo(array, ini, pivotIndex);
        recursivo(array, pivotIndex + 1, fin);
    }
}

private <T extends Comparable<T>> int partition(T[] array, int ini, int fin) {
    T pivot = array[ini];
    int i = ini - 1;
    int j = fin;

    while (true) {
        do {
            i++;
        } while (i < fin && array[i].compareTo(pivot) < 0);

        do {
            j--;
        } while (j > ini && array[j].compareTo(pivot) > 0);

        if (i >= j) {
            break;
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    array[ini] = array[j];
    array[j] = pivot;

    return j;
}

    public void radixSortDoublesWithNegatives(double[] arr, int n) {
        if(n==0) return;
        long[] scaled = new long[n];
        int scaleFactor = 10000;

        for (int i = 0; i < n; i++) {
            scaled[i] = (long) (arr[i] * scaleFactor);
        }

        List<Long> negatives = new ArrayList<>();
        List<Long> positives = new ArrayList<>();

        for (long val : scaled) {
            if (val < 0) {
                negatives.add(-val);
            } else {
                positives.add(val);
            }
        }

        long[] negArray = listToArray(negatives);
        long[] posArray = listToArray(positives);

        radixSortLong(negArray, negArray.length);
        radixSortLong(posArray, posArray.length);

        int index = 0;

        for (int i = negArray.length - 1; i >= 0; i--) {
            arr[index++] = -negArray[i] / (double) scaleFactor;
        }

        for (long val : posArray) {
            arr[index++] = val / (double) scaleFactor;
        }
    }

    private long[] listToArray(List<Long> list) {
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void radixSortLong(long[] arr, int n) {
        if(n==0) return;
        long max = getMaxLong(arr, n);
        for (long exp = 1; max / exp > 0; exp *= 10) {
            countSortLong(arr, n, exp);
        }
    }

    private long getMaxLong(long[] arr, int n) {
        if(n==0) return 0;
        long mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    private void countSortLong(long[] arr, int n, long exp) {
        long[] output = new long[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            int index = (int) ((arr[i] / exp) % 10);
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (int) ((arr[i] / exp) % 10);
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public void radixSortStrings(String[] arr, int n) {
        int maxLen = 0;
        for (String s : arr) {
            maxLen = Math.max(maxLen, s.length());
        }

        for (int i = 0; i < n; i++) {
            while (arr[i].length() < maxLen) {
                arr[i] = arr[i] + '\0';
            }
        }

        for (int pos = maxLen - 1; pos >= 0; pos--) {
            countSortStrings(arr, n, pos);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i].replaceAll("\0", "");
        }
    }

    public void countSortStrings(String[] arr, int n, int pos) {
        String[] output = new String[n];
        int[] count = new int[256];

        for (int i = 0; i < n; i++) {
            count[arr[i].charAt(pos)]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i].charAt(pos)] - 1] = arr[i];
            count[arr[i].charAt(pos)]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public <T extends Comparable<T>> void mergeSort(T[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
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
    }

    public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }
}