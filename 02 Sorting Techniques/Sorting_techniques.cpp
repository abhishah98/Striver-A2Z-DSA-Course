#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void printarr(vector<int> arr) {
    for (auto i: arr) {
        cout << i << " ";
    }
    cout << endl;
}

void selectionSort(vector<int> &arr) {
    // code here
    // select the minimum value and put it into the right bucket
    int mn = INT_MAX, min_idx, n=arr.size();
    for (int i=0; i<n; i++) {
        mn = arr[i];
        min_idx = i;
        for (int j=i; j<n; j++) {
            if (arr[j]<mn){
                mn = arr[j];
                min_idx = j;
            }
        }
        swap(arr[i], arr[min_idx]);
    }
    
    // if (arr[n-1] < mn) 
    //     swap(arr[n-1], arr[min_idx-1]);

}

void bubbleSort(vector<int>& arr) {
    // Your code here
    int n=arr.size();
    for (int i=n-1; i>=0; i--) {
        for (int j=0; j<=i-1; j++) {
            if (arr[j] > arr[j+1]) swap (arr[j], arr[j+1]);
        }
    }
}

void insertionSort(vector<int>& arr) {
    // code here
    // pick one element and compare with all previous elements
    // if previous element are smaller, keep swaping. so it reach to the correct position
    // at any given i_th iteration till (0 to i) is sorted
    int n=arr.size();
    for (int i =0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            if (arr[j]>arr[i]) swap(arr[i], arr[j]);
        }
    }
}

void merge(vector<int> &arr, int left, int mid, int right) {
    // Size of left half
    int n_left = mid - left + 1;

    // Size of Right half
    int n_right = right - mid;

    // Copy data to temporary arrays
    vector<int> leftarr(n_left), rightarr(n_right);
    for (int i=0; i<n_left; i++) {
        leftarr[i] = arr[left + i];
    }
    for (int i=0; i<n_right; i++) {
        rightarr[i] = arr[mid + 1 + i];
    }

    // Merge the two halves
    int i=0, j=0, k=left;
    while (i<n_left && j<n_right) {
        if (leftarr[i] <= rightarr[j]) {
            arr[k] = leftarr[i];
            i++;
        }
        else {
            arr[k] = rightarr[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements of leftArr[], if any
    while (i < n_left) {
        arr[k] = leftarr[i];
        i++;
        k++;
    }

    // Copy remaining elements of rightArr[], if any
    while (j < n_right) {
        arr[k] = rightarr[j];
        j++;
        k++;
    }
}

void mergeSort(vector<int> &arr, int left, int right) {
    // Base case: if the array has one or no elements, it is already sorted
    if (left >= right) return;
    int mid = left + (right - left)/2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid+1, right);
    merge(arr, left, mid, right);
}

int main() {
    cout << "\n\nOutput:" << endl;

    vector<int> arr = {64, 25, 12, 22, 11};
    vector<int> arr1 = {64, 25, 12, 22, 11};
    vector<int> arr2 = {5, 4, 3, 2, 1};
    vector<int> arr3 = {1, 2, 3, 4, 5};
    vector<int> arr4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    vector<int> arr5 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

    cout << "Original array: ";
    printarr(arr1);
    mergeSort(arr1, 0, arr1.size()-1);
    cout << "Sorted array (Merge Sort): ";
    printarr(arr1);


    return 0;
}