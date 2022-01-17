#include <iostream>
#include <stdlib.h>

using namespace std;
int *arr;

class findClosest{
    public:
    int *nums, n, target;

    int absoluteDifference(int a, int b){
        int c=(a-b)>0?(a-b):(b-a);      //finding absolute difference, value will be postive always
        return c;
    }

    void input(){           //taking input from the user
        cout<<"Enter the number of elements in the array: ";
        cin>>n;
        nums=(int *)malloc(n*sizeof(int));
        arr=(int *)malloc(n*sizeof(int));
        cout<<"Enter the elements\n";
        for(int i=0; i<n; i++){
            cin >>*(nums+i);
        }

        cout<<"Enter the target: ";
        cin>>target;
    }

    int closestNumbers(){       //finding the closest number
        int sum=0;
        for(int i=0; i<n; i++){
            *(arr+i)= absoluteDifference(target, *(nums+i));
        }
        insertionSort(arr);
        for(int i=0; i<3; i++){
            sum+=*(arr+i);
        }

        return sum;
    }

    void swap(int *a, int *b){      //used in swapping while sorting
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
    }


    void insertionSort(int *arr){
    int curr=1;
    while(curr<n){
        int prev=curr-1;                                //previous element of current element

        if(*(arr+curr)< *(arr+prev)){                   //swapping current value with previous
            swap(arr+curr, arr+prev);                   //element if it previous element is greater
        }
        while(*(arr+prev)< *(arr+prev-1) && prev>0){    //checking if previous element of current
            swap(arr+prev, arr+prev-1);                 //element is sorted
            prev--;
        }
        curr++;
    }

    }

    void display(int *arr){
        for(int i=0; i<n; i++){
            cout<<*(arr+i)<<"\t";
        }
        cout<<endl;
    }


};

int main(){
    findClosest f1;
    f1.input();
    cout<<"The sum is: "<<f1.closestNumbers();
}