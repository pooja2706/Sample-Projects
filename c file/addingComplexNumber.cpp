#include<iostream>
using namespace std;

class additionOfComplexNumber{
	public: 
	int r1,i1;
	void takingInput(){
		cout<<"For 1st complex number\nEnter the real part: ";
		cin>>r1;
		cout<<"Enter the imaginary part: ";
		cin>>i1;	
	}
	
};

int main(){
	additionOfComplexNumber c1, c2;
	c1.takingInput();
	c2.takingInput();
	cout<<"The sum of complex number is: "<<c1.r1+c2.r1<<" + "<<c1.i1+c2.i1<<"i"<<endl;
	
	return 0;
	}
