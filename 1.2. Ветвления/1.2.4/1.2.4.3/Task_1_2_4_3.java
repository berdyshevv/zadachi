/**
Составьте программу, которая принимает с клавиатуры целое число, соответствующее определенному часу суток, 
и выводит на экран сообщение о его принадлежности к определённому периоду суток 
(утро: 6-9 часов, день: 10-17 часов, вечер: 18-22 часов, ночь: 23-5 часов). 
В случае, если введенное значение ошибочно, следует вывести на экран соответствующее текстовое сообщение.

 ввод: 7 ⇒ вывод: утро; ввод: 33 ⇒ вывод: ошибка)
*/
import java.io.*;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;

import java.lang.System.*;
import java.lang.Integer;


public class Task_1_2_4_3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("imput a hour ");
        String str = scan.nextLine();
        int hour = Integer.parseInt(str);

        if (6 <= hour && hour <= 9) {
            System.out.println("mornimg");    
        } 
        else if (10 <= hour && hour <= 17) {
            System.out.println("day");    
        }
        else if (18 <= hour && hour <= 22) {
            System.out.println("evneng");
        }
        else if (hour == 23 || 0 <= hour && hour <= 5)
        {
            System.out.println("night");
        }
        else{
            System.out.println("ERORR");
        }    
    }        
}