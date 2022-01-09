#include <stdio.h>
#include <stdlib.h>
void input();
void displayArray(int *arr, int n);
void findMax(int *arr, int n);
void findMin(int *arr, int n);

void input(){
    int n, *arr;
    printf("Enter the number of elements to enter: ");
    scanf("%d", &n);

    arr=malloc(n*sizeof(int));
    printf("Enter the elements: \n");

    for(int i=0; i<n; i++){
        scanf("%d", arr+i);
    }

    printf("ARRAY IS:\t");
    displayArray(arr, n);
    findMax(arr, n);
    findMin(arr, n);
}

void findMax(int *arr, int n){
    int maximum=*arr;
    for(int i=0; i<n-1; i++){
        maximum=maximum> *(arr+i+1)? maximum: *(arr+i+1);
    }
    printf("Maximum element is %d\n", maximum);
}

void findMin(int *arr, int n){
    int minimum=*arr;
    for(int i=0; i<n-1; i++){
        minimum=minimum< *(arr+i+1)? minimum: *(arr+i+1);
    }
    printf("Minimum element is %d\n", minimum);
}

void displayArray(int *arr, int n){
    for(int i=0; i<n; i++){
        printf("%d\t", *(arr+i));
    }
    printf("\n");
}

int main(){
    int option=1;
    while(option==1){
        input();
        printf("1. Enter 1 to continue\n2.Enter 2 to exit\n");
        scanf("%d", &option);
    }

}