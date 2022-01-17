#include <stdio.h>
#include <math.h>
struct rectangle{
    int x1,x2,y1,y2;
}r;
int main() {
    int l,b;
    
    while(1){
	    printf("Enter x1:");
	    scanf("%d",&r.x1);
	    printf("Enter x2:");
	    scanf("%d",&r.x2);
	    printf("Enter y1:");
	    scanf("%d",&r.y1);
	    printf("Enter y2:");
	    scanf("%d",&r.y2);
	    if(r.x2>r.x1)
	        l=r.x2-r.x1;
	    else l=r.x1-r.x2;
	    if(r.y2>r.y1)
	        b=r.y2-r.y1;
	    else b=r.y1-r.y2;
	    areaofrect(l,b);
	}
return 0;
}
int areaofrect(int l, int b) {
    float area=l*b;
    printf("%f\n",area);
}
