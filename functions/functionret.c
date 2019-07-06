#include <stdio.h>


int add(int a, int b) {
    int c=a+b;
    return c;
}

int main() {
    int first = 5;
    int second =4;
    int total = add(first, second);
    printf("Addition is %d \n", total);
    return 0;
}