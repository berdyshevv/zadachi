/**
 * 1.2.2
 * Составьте программу, которая принимает с клавиатуры целое число и 
 * определяет, является ли оно положительным или нет,	
 * и выводит на экран одно из двух сообщений: 
 * "положительное число"  или  "не положительное число". 
 * 
 * Например: ввод: 6 ⇒ вывод: положительное число; 
 * ввод: -8 ⇒ вывод: не положительное число; ввод: 0⇒ вывод: не положительное число
 */
#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);
    if (a >0 ) {
        printf("positive");
    }
    else if (a <0 ){
        printf("negative");    
    }
    else{
        printf("not positive, nor negaive, it is a zero");
    }
    
    return 0;
}

