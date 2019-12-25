/**
* Задача 1.1.6
* Составьте программу, которая принимает с клавиатуры два целых числа и 
* выводит на экран следующие значения (каждое в отдельной строке): 
* квадрат каждого числа (отдельно) и сумму квадратов введенных чисел. 

* Например: ввод: 4, 6 ⇒ вывод: 16, 36, 52
*/
#include <stdio.h>

int main(void){
    int one;
    int two;
    scanf("%d%d", &one, &two);
    printf("%d times %d equals %d\n%d times %d equals %d\n%d plus %d equals %d", 
    one, one, one * one, 
    two, two, two * two, 
    one * one, two * two, one * one + two * two);

    return 0;
}