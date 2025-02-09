#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
// Patterns Link    
// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/    

    int n = 5;
    cout << "\n\nOutput:" << endl;

/*
    // Pattern 11
    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            if (i%2==0){
                if (j%2==0) cout << "1";
                else cout << "0"; 
            }
            else {
                if (j%2==0) cout << "0";
                else cout << "1"; 
            }
        }
        cout << endl;
    }
*/

/*    
    // Pattern 10
    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) 
            cout <<"*";
        cout <<endl;
    }
    for (int i=n-1; i>=0; i--) {
        for (int j=0; j<=i; j++) 
            cout <<"*";
        cout <<endl;
    }
*/

/*
    // Pattern 9
    for (int i=0; i<n; i++) {
        for (int j=0; j<(n-i -1); j++) 
            cout << " ";
        for (int k=0; k<2*i +1; k++)
            cout << "*";
        cout << endl;
            
    }
    
    for (int i =n; i>0; i--) {
        for (int k=0; k<(n-i); k++)
            cout << " ";
        for (int j =0; j<(i+i-1); j++) 
            cout << "*";
        cout << endl;
    }
*/
    return 0;
}