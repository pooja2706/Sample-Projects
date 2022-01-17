#include<iostream>
using namespace std;
inline string addingIfToString(string str);
int main(){
	string str;
	while(true){
	cout<<"Enter a string: ";
	cin>>str;
	cout<<addingIfToString(str)<<endl;
}	
}

inline string addingIfToString(string str){
	
	char ch1=str.at(0);
	char ch2=str.at(1);
	
	
	if(ch1=='i' && ch2=='f'){
		return str;
	}
	
	else{
	string str1="if"+str;
	return str1;
	}	
}
