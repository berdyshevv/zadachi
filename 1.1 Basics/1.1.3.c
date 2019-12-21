/**
 * Задача 1.1.3
 * Составьте программу, которая присваивает значения двум переменным, 
 * а затем выводит на экран:
 * в первой строке - произведение этих переменных (с поясняющей надписью), 
 * во второй – сумму этих переменных (с поясняющей надписью).
*/

#include <stdio.h>

int main(void) {
    int num1;
    int num2;
    scanf("%d", &num1);
    scanf("%d", &num2);

    printf("the product of varibles is %d * %d = %d\n", num1, num2, num1 * num2 );
    printf("the sum of %d and %d equas to %d", num1, num2, num1 + num2 );
    // printf("%d\n", 2147483647);
    // printf("%d\n", 2147483647 - 1);
    // printf("%d\n", 2147483647 + 1);
    // printf("%d", 2147483647 + 2 );

}
