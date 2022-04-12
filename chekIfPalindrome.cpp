#include <iostream>
using namespace std;

int main(){
    //Check if a string is a palindrome
    string s;
    cout <<"Enter a string: ";
    cin >> s;
    for(int i = 0; i < s.length() / 2; i++){
        if(s[i] != s[s.length() - 1 - i]){
            cout << s << " is not a palindrome" << endl;
            return 0;
        }
        else{
        	cout << s <<" is a palindrome"<<endl;
    		return 0;
		}
    }
}