#include <iostream>
#include <stdint.h>

using namespace std;

int countLetters(char str[]) {
	int c = 0, a =0;
	while (str[c] != '\0') {
			if (str[c] == 'a' || str[c] == 'A'){
				a++;
				
				
			}
			c++;
		}

	return a; 
}

int main() {
	char seq[100];
	cout << "Insert a sequence of caracts:";
	cin >> seq;
	cout << "Your sequence have "<< countLetters(seq) << " letters a";}
	
