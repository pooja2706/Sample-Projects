#include<iostream>
using namespace std;

class areaOfRectangle{
	int length, breadth, a;
	public:
	void area(){
		cout<<"Enter the length of the rectangle: ";
		cin>>length;
		cout<<"Enter the breadth of the rectangle: ";
		cin>>breadth;
		a=length*breadth;
	}
	
	void display(){
		cout<<"Area of the rectangle is: "<<a<<endl;
	}
};

int main(){
	areaOfRectangle a;
	a.area();
	a.display();
	return 0;
}
