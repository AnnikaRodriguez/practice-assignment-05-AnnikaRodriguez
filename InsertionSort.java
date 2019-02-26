public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int position = i;

            while (position > 0 && current < a[position-1]){
                a[position] = a[position - 1];
                position --;

            }

            a[position] = current;

        }

    }





}
