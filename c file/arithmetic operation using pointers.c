#include <stdio.h>
int main(){
    int*a,*b;
    int p,q;
    a=&p;
    b=&q;
    while(1){
    printf("Enter the 1st number:");
    scanf("%d",&p);
    printf("Enter the 2nd number:");
    scanf("%d",&q);
    printf("\nSum is %d",(*a)+(*b));
    printf("\nDifference is %d",(*a)-(*b));
    printf("\nProduct is %d",(*a)*(*b));
    printf("\nQuotient is %0.3f\n\n",((*a*1000)/(*b))*0.001);
	}
    return 0;
}
