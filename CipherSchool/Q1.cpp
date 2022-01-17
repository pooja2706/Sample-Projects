#include <iostream>
#include <stdlib.h>

using namespace std;

class findMissing{
    public:
    int *nums, n, smallest;
    
    void input(){       //taking input from the user
        cout<<"Enter the number of elements in the array: ";
        cin>>n;
        nums=(int *)malloc(n*sizeof(int));
        cout<<"Enter the elements\n";
        for(int i=0; i<n; i++){
            cin >>*(nums+i);
        }  
    }

    void findSmallest(){        //finding the smallest number from the given array
        smallest=*(nums);
        for(int i=0; i<n-1; i++){
            smallest= smallest< *(nums+i+1)?smallest:*(nums+i+1);
        }
    }

    int missingInRange(){           //finding the missing number from the array
        for(int i=smallest; ; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(i==*(nums+j)){
                    count++;
                }
            }
            if(count==0){
                return i;
            }
        }
    }
    void display(){
        for(int i=0; i<n; i++){
            cout<<*(nums+i)<<"\t";
        }
        cout<<endl;
    }

};

int main(){
    findMissing arr1;
    arr1.input();
    arr1.findSmallest();
    int a=arr1.missingInRange();
    cout<<a<<" is not present in the array"<<endl;
    return 0;
}