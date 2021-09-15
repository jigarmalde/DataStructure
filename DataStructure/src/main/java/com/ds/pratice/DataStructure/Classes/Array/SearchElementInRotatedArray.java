package com.ds.pratice.DataStructure.Classes.Array;

public class SearchElementInRotatedArray {

    public static void main(String[] args) {
        SearchElementInRotatedArray m = new SearchElementInRotatedArray();
        int[] arr = new int[]{5, 6, 7, 8, 1, 2, 3, 4};
        int n = arr.length;

        int index = searchElementInRotatedArray(arr, 3);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }

    }

    private static int searchElementInRotatedArray(int[] arr, int x) {
        // search space is `A[left…right]`
        int left = 0;
        int right = arr.length - 1;

        // loop till the search space is exhausted
        while (left <= right)
        {
            // find the mid-value in the search space and
            // compares it with the target
            int mid = (left + right) / 2;

            // if the key is found, return its index
            if (x == arr[mid]) {
                return mid;
            }

            // if right half `A[mid…right]` is sorted and `mid` is not
            // the key element
            if (arr[mid] <= arr[right])
            {
                // compare key with `A[mid]` and `A[right]` to know
                // if it lies in `A[mid…right]` or not
                if (x > arr[mid] && x <= arr[right])
                {
                    // go searching in the right sorted half
                    left = mid + 1;
                }
                else {
                    right = mid - 1;        // go searching left
                }
            }

            // if left half `A[left…mid]` is sorted, and `mid` is not
            // the key element
            else {
                // compare key with `A[left]` and `A[mid]` to know
                // if it lies in `A[left…mid]` or not
                if (x >= arr[left] && x < arr[mid])
                {
                    // go searching in the left sorted half
                    right = mid - 1;
                }
                else {
                    left = mid + 1;         // go searching right
                }
            }
        }

        // key not found or invalid input
        return -1;

    }

}
