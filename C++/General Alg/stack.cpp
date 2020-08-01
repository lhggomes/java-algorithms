#include <queue>
#include <stack>
#include <iostream>

using namespace std; 

int main(){
	queue<int> q; 
	stack<int> s;
	
	
	int count = 0;
	int numberToPush = 0;
	
	while (count == 0){
		cout << "Insert a value:";
		cin >> numberToPush;
		if (numberToPush == 0){
			break;
		}
		q.push(numberToPush);
		s.push(numberToPush);
	
	}
	
	cout << "In Digitation Order\n";
	while(!q.empty()){
		cout << q.front() << endl;
		q.pop();
	}
	
	cout << "In Reverse Digitation Order\n"; 
	while (!s.empty()) {
		cout << s.top() << endl;
		s.pop();
	}
	
}

