#include <stdio.h>
#include<stdlib.h>

void input();
void display(int *arr, int n);
void reverseArray(int *arr, int n);
void swap(int *a, int *b);

void input(){
    int arr[10], n;
    while(1){
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    if(n<=0){
        printf("Please enter a valid number!!\n");
    }
    else{
        break;
    }
    }
    printf("Enter the elements: \n");

    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    display(arr, n);
    printf("AFTER REVERSING THE ARRAY: \n");
    reverseArray(arr, n);

}

void display(int *arr, int n){
    for(int i=0; i<n; i++){
        printf("%d\t", *(arr+i));
    }
    printf("\n");
}

void reverseArray(int *arr, int n){
    int m;
    for(int i=0, m=n-1; i<=(n/2)-1; i++, m--){
        swap(&arr[i], &arr[m]);
    }
    display(arr, n);
}

void swap(int *a, int *b){
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
}

int main(){
    int option=1;

    while(option==1){
        input();
        printf("1. Enter 1 to continue reversing\n2. Press any other number to exit\n");
        scanf("%d", &option);
    }
    return 0;
}