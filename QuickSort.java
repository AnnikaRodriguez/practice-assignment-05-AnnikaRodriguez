public class QuickSort implements SortingAlgorithm {

        public void sort(int[] a) {


            quickSort(a, 0, a.length -1 );



        }

        void quickSort(int[] arr, int left, int right) {

            if (left < right) {

                int p = partition(arr, left, right);
                quickSort(arr, left, p-1);
                quickSort(arr, p + 1, right);

            }

        }


        int partition(int[] arr, int left, int right) {

            if (left < right) {

                int pivot = left;
                int i = left + 1;
                int j = right;

                while (i < j) {

                    while (i <= right && arr[i] <= arr[pivot]) {
                        ++i;

                    }

                    while (j >= i && arr[j] > arr[pivot]) {

                        --j;
                    }

                    if (i <= right && i < j) {

                            swap(arr, i, j);

                    }


                } // end of outer while loop

                    swap(arr, pivot, j); //sets pivot to the middle

                    return j;

            }

            return left;

        }


        public void swap(int[] arr, int a, int b){

                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }






        }






