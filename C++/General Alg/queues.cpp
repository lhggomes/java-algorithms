#include <stack>
#include <iostream>
#include <queue>

using namespace std;

string check_state(string ltr1, string ltr2){
	if (ltr1 == ltr2){
		return "Yes";
	}
	return "No"; 
}


int main(){
	stack<int> s;
	queue<int> q; 
	
	string letters;
	cout<< "Input the chars letters";
	cin >> letters;
	int count = 0; 
	
	
	/* Setting the string into a Queue and a Stack */ 
	for (int i = 0; i < letters.size(); i++){
		s.push(letters[i]);
		q.push(letters[i]);	
	}
			

	
	/*  Compare the both methods of pop */ 
	string compareString;
	while (! s.empty()){
		int j = 0;
		char c = q.front(), a = s.top();
		if (c == a){
			compareString += q.front(); 
		}
		q.pop();
		s.pop();	
	}
	
	
	/* Now, check if the generated */ 
	cout << "Do the string is a palindrome? " << check_state(letters, compareString);
	
	
	
	
}
