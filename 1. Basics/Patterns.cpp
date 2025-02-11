#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
// Patterns Link    
// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/    

    int n = 5;
    cout << "\n\nOutput:" << endl;

    
/*    
    // Pattern 17
    char cnt = 'A';
    for (int i=0; i<n; i++) {
        for (int j=0; j<n-i-1; j++) {
            cout<< " ";
        }
        cnt = 'A';
        int mid = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            cout << cnt;
            if (j<=mid) cnt++;
            else cnt--;
        }
        cout << endl;
    }
*/

/*    
    // Pattern 16
    char cnt = 'A';
    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            cout<<cnt << " ";
        }
        cnt++;
        cout << endl;
    }            
*/
/*
    // Pattern 15
    char cnt = 'A';
    for (int i=0; i<n; i++) {
        cnt = 'A';
        for (int j=0; j<(n-i); j++) {
            cout<<cnt << " ";
            cnt++;
        }
        cout << endl;
    }        
*/
/*
    // Pattern 14
    char cnt = 'A';
    for (int i=0; i<n; i++) {
        cnt = 'A';
        for (int j=0; j<=i; j++) {
            cout<<cnt << " ";
            cnt++;
        }
        cout << endl;
    }    
/*    
    
/*    
    // Pattern 13
    int cnt = 1;
    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            cout<<cnt << " ";
            cnt++;
        }
        cout << endl;
    }
*/    
/*    
    // Pattern 12
    for(int i=1; i<=n; i++) {
        for (int j=1; j<=i; j++)
            cout << j;
        for (int j=1; j<=(n-i)*2; j++)
            cout << " ";
        for (int j=i; j>=1; j--) 
            cout << j;
        cout << endl;
    }
*/

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