#include <bits/stdc++.h>
using namespace std;
// User function template for C++
class Solution {
    public:
      // Function returns the second
      // largest elements
      int getSecondLargest(vector<int> &arr) {
          // Code Here
          int mx= INT_MIN;
          for (int i=0; i<arr.size(); i++) {
              if (arr[i] > mx) mx = arr[i];
          }
          int second_max = INT_MIN;
          for (int i=0; i<arr.size(); i++) {
              if (arr[i] < mx && arr[i]>second_max) {
                  second_max = arr[i];
              }
          }        
          return (second_max==INT_MIN)?-1:second_max;
      }
      
  };