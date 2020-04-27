/**
 * Составьте программу, которая принимает с клавиатуры целое число 
и, если оно соответствует оценке ученика, 
выводит на экран соответствующую «текстовую форму оценки» 
(1 или 2 – «неудовлетворительно», 
3 – «удовлетворительно», 
4 – «хорошо», 
5 – «отлично»). 
В случае, если число не является оценкой, 
следует вывести на экран соответствующее текстовое сообщение.

<ins>Проверка⇑</ins>
 ввод: 5 ⇒ вывод: отлично; ввод: 6 ⇒ вывод: это не оценка)
 */
import java.io.*;
import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int grade = readInt("imagine that you are a teacher...\nand one of your students gave you his work...\nwrite a grade for his work:   ", 
                                scanner);
            if (grade == 0) {
                System.out.println("this is not work, this is NONSENSE");
            }
            else if (grade == 1 || grade == 2){
                System.out.println("this is bad work");    
            }
            else if (grade == 3) {
                System.out.println("jolly good");    
            }
            else if (grade == 4) {
                System.out.println("good work");
            }
            else if (grade == 5) {
                System.out.println("WOW! AMAZING WORK!!!");
            }
            else{
                System.out.println("ERROR: not a grade");
            }
        }   catch (NumberFormatException e) {
            System.out.println("ERROR: not a grade");
        }
    }
    private static int readInt(String str, Scanner scanner) throws NumberFormatException {
        System.out.print(str);
        return Integer.parseInt(scanner.nextLine());
        
    }
} 