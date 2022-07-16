/***************************************
// Array Implementation
// Author: Andile Jaden Mbele
***************************************/
#include <iostream>

using namespace std;

int main()
{
    // implement an array of integers
    int array[5] = {1, 2, 3, 4, 5};

    // implement an array of strings as cars
    string cars[5] = {"BMW", "Audi", "Mercedes", "Volvo", "Toyota"};

    // implement an array of strings as rockets
    string rockets[5] = {"Falcon 1", "Falcon 9", "Falcon Heavy", "Falcon Heavy", "Falcon Heavy"};

    // print the first element of the array of rockets
    cout << rockets[0] << endl;
    // print the last element of the array of cars

    cout << cars[4] << endl;
    // print the last element of the array of integers

    cout << array[4] << endl;
    // print all the elements of the array of rockets
    for (int i = 0; i < 5; i++)
    {
        cout << rockets[i] << endl;
    }

    return 0;
}