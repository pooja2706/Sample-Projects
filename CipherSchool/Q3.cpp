#include <iostream>
#include <stdlib.h>

using namespace std;

class robberQue{
    public:
    int *arr,*nums, n;

    
    void input(){
        cout<<"Enter the number of elements in the array: ";
        cin>>n;
        nums=(int *)malloc(n*sizeof(int));
        arr=(int *)malloc(n*sizeof(int));
        cout<<"Enter the elements\n";
        for(int i=0; i<n; i++){
            cin >>*(nums+i);
        }  
    }

    void alternatePositions(){
        
        int j=0;
        for(int i=0; i<n; i++){
            if(i%4==0){             //taking sum of all alternate positions
                *(arr+j++)=*(nums+i)+*(nums+i+2);
                *(arr+j++)=*(nums+i+1)+*(nums+i+3);
            }
        }

        //display(arr);
    }

    int findLargest(){          //finding the largest number from the new array from sum of alternate positions
        int largest=*(arr);
        for(int i=0; i<n/2; i++){
            largest=largest>*(arr+i)?largest:*(arr+i);
        }

        return largest;

    }

    void display(int *a){
        for(int i=0; i<n/2; i++){
            cout<<*(a+i)<<"\t";
        }
        cout<<endl;
    }

};

int main(){
    robberQue r1;
    r1.input();
    r1.alternatePositions();
    cout<<"The maximum amount of money is "<<r1.findLargest();
    return 0;
}