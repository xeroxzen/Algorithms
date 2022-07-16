/*
DOCUMENTATION
1. A program to demonstrate the use of file handling in C.
2. The program should open a file and write some data to it.
3. The program should then read the data back from the file and
display it on the screen.
4. The program should then close the file.
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    FILE *fp;
    char ch;
    char str[100];
    int i = 0;
    // Opening a file
    fp = fopen("read_some_data.txt", "w");
    if(fp == NULL){
        printf("Error opening file\n");
        exit(1);
    }
    // Get the data from the user
    printf("Enter the string to be written to the file: ");
    scanf("%s", str);
    // Writing data to the file
    fprintf(fp, "%s", str);
    fclose(fp);
    fp = fopen("read_some_data.txt", "r");
    if(fp == NULL){
        printf("Error opening file\n");
        exit(1);
    }
    while((ch = fgetc(fp)) != EOF){
        printf("%c", ch);
    }
    // Closing the file
    fclose(fp);
    return 0;
}

