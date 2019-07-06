#include <stdio.h>


void add(int a, int b) {
    printf("Addition is %d \n", a+b);
}

int main() {
    int first = 5;
    int second =4;

    add(first, second);
    return 0;
}