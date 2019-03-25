/**
 *
 * @author Rahul Thakur
 */
public class MergeSort {

    public static void merge(int[] left, int[] right, int[] a) {
        int sizeLeft = left.length;
        int sizeRight = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sizeLeft && j < sizeRight) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                k++;
                i++;
            } else {
                a[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < sizeLeft) {
            a[k] = left[i];
            k++;
            i++;
        }

        while (j < sizeRight) {
            a[k] = right[j];
            k++;
            j++;
        }

    }

    public static void sort(int[] a) {
        int size = a.length;
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i <= (mid - 1); i++) {
            left[i] = a[i];
        }

        for (int i = mid; i < size; i++) {
            right[i - mid] = a[i];
        }

        sort(left);
        sort(right);
        merge(left, right, a);

    }

    public static void main(String[] args) {
        int[] myArr = new int[]{100, 20, 50, 21, 68, 45, 32, 66, 234, 156, 11};

        System.out.println("Unsorted Array");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + "  ");
        }

        MergeSort ms = new MergeSort();
        ms.sort(myArr);
        System.out.println();
        
        System.out.println("Sorted Array");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + "  ");
        }

    }

}

























/**public class MergeSort {
    public static void merge(int[] left, int[] right, int a[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                a[k] = left[i]; 
                k++;
                i++;
            } else {
                a[k] = right[j];
                k++;
                j++;
            }
        }
        //to fill up the remaining elements
        while (i < nL) {
            a[k] = left[i];
            k++;
            i++;
        }
        while (j < nR) {
            a[k] = right[j];
            k++;
            j++;
        }
    }
    public static void sort(int a[]) {
        int n = a.length;                   // 8
        if (n < 2) {
            return;
        }
        int mid = n / 2;                    //4
        int[] left = new int[mid];          //left[4]
        int[] right = new int[n - mid];     //right[4]
        for (int i = 0; i <= (mid - 1); i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = a[i];
        }
        sort(left);
        sort(right);
        merge(left, right, a);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 6, 8, 5, 3, 7};
        System.out.println("Unsorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}**/