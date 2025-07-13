#include <stdio.h>

void insertionSort(int arr[], int n) {
    int i, key, j;
    int comparisons = 0, shifts = 0;

    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;

        // Compare and shift elements
        while (j >= 0 && arr[j] > key) {
            comparisons++;
            arr[j + 1] = arr[j];
            j--;
            shifts++;
        }

        if (j >= 0)
            comparisons++;  // for the failed comparison

        arr[j + 1] = key;
    }

    printf("Total Comparisons: %d\n", comparisons);
    printf("Total Shifts: %d\n", shifts);
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array:\n");
    printArray(arr, n);

    insertionSort(arr, n);

    printf("Sorted array:\n");
    printArray(arr, n);

    return 0;
}
