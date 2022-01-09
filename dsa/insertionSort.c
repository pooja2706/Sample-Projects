#include<stdio.h>
#include<stdlib.h>
int n;
int* input();
void insertionSort(int *arr);
void display(int *arr);
void swap(int *a, int *b){
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
}

int* input(){
    int *arr;
    printf("Enter the number of elements to insert: ");
    scanf("%d", &n);
    arr=malloc(n*sizeof(int));
    printf("Enter the elements: \n");
    for(int i=0; i<n; i++){
        scanf("%d", arr+i);
    }
    return arr;
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

    display(arr);
}

void display(int *arr){
    printf("AFTER SORTING:\t");
    for(int i=0; i<n; i++){
        printf("%d\t", *(arr+i));
    }
    printf("\n");
}
int main(){
    int option=1;

    while(option==1){
    insertionSort(input());

    printf("\n------------------------------------\n");
    printf("1. Perform Insertion Sort\n2. Exit\n");
    scanf("%d", &option);
    }
    printf("PROGRAM EXITED!!\n");
    return 0;
}