/**
 * Составьте программу, которая принимает с клавиатуры число 
 * и превращает его в положительное, 
 * если оно отрицательное, либо в ноль во всех остальных случаях. 
 * 
 * Например: 
 * ввод: -9 ⇒ вывод: 9; 
 * ввод: 8 ⇒ вывод: 0; 
 * ввод: 0 ⇒ вывод: 0
 */

 #include <stdio.h>

 int main(void) {
    int a;
    scanf("%d", &a);
    if (a < 0){
        printf("%d", a - a - a);
    }
    else{
        printf("0");
    }
    
    return 0;
 }
