/**
 * Задача 1.1.5
 *  Составьте программу, которая принимает с клавиатуры два целых числа и 
 * выводит на экран следующие значения (каждое в отдельной строке): 
 * сумму введенных чисел, их произведение,
 * разницу между первым и  вторым, 
 * разницу между вторым и первым. 
 * 
 * Например: ввод: 5, 9 ⇒ вывод: 14, 45, -4, 4 
 */

#include <stdio.h>

int main(){
    int num1; 
    int num2;
    scanf("%d%d", &num1, &num2);
    printf("%d\n", num1 + num2);
    printf("%d\n", num1 * num2);
    printf("%d\n", num1 - num2);
    printf("%d\n", num2 - num1);
    
    return 0;
}
