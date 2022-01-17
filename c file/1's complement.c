#include <stdio.h>
int main() {
int num,num2,i=1,k,sum=0;
printf("Enter a binary number:");
scanf("%d",&num);
num2=num;
while(num>0){
    i=i*10;
    num=num/10;
}i=i/10;
while(num2>0){
    k=num2%10;
    sum=sum+k*i;
    i=i/10;
    num2=num2/10;
}while(sum>0){
    if(sum%10==1)
    printf("0");
    else if(sum%10==0) printf("1");
    else printf("Please enter a binary number");
    sum=sum/10;
}
    return 0;
}
