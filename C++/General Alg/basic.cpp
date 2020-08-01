#include <iostream>
#include <stdint.h>

using namespace std;

int main(){
	int c = 0;
	int values = 0, value = 0;
	while(c != 10){
		cout << "Input a number [" << c << "]" ;
		cin >> value;
		values += value;
		c++;
	}
	
	cout<< "The avg is " << values / 10;
	
}
