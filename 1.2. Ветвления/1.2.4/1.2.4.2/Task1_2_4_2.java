/**
Составьте программу, которая принимает с клавиатуры целое число, соответствующее порядковому номеру месяца. 
		В случае, если полученное значение равно порядковому номеру одного из месяцев, 
        следует вывести сезон (лето, осень, зима, весна), к которому относится месяц. 
		В случае, если введенное значение не является порядковым номером месяца, 
        следует вывести на экран сообщение об ошибке.
         ПРОВЕРКА:
         ввод: 10 ⇒ вывод: это осень; ввод: 15 ⇒ вывод: ошибка)
*/
import java.io.*;
import java.util.Scanner;
import java.lang.System.*;
import java.lang.Integer;


public class Task1_2_4_2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("imput a number of month ");
        String str = scan.nextLine();
        int month = Integer.parseInt(str);

        if(month >= 1 && month <= 3){
            System.out.println("Winter");
        }
        else if(month >= 4 && month <= 6){
            System.out.println("Spring");
        }
        else if(month >= 7 && month <= 9){
            System.out.println("Summer");
        }
        else if(month >= 10 && month <= 12){
            System.out.println("Fall");
        }
        else{
            System.out.println("ERROR: not a number of month");
        }
    }
}