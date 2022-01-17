#include <stdio.h>

int main() {
    int l,b,a;
    while(1){
	    printf("\nEnter the length of rectangle :");
	    scanf("%d" ,&l);
	    printf("\nEnter the breadth of rectangle :");
	    scanf("%d" ,&b);
	    a=2*(l+b);
	    printf("\nPerimetre is:%d\n" ,a);
	}
    return 0;
}
