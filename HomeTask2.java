/*
Задание 2
Напишите программу, которая считает, распарсит и выведет в логгер заранее созданный файл с именами, предметами и оценками студентов
Формат строк в файле:
Андрей 5
Алена 5
Игорь 4
Формат вывода: Ученик %s получил сегодня %d.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.logging.Logger;

        

public class HomeTask2 {
    public static void main(String[] args) {
        Logger l = Logger.getAnonymousLogger();
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(reader)) {
            String line;
            String check = " "; 
            sb.append("Ученик ");
            while ((line = br.readLine()) != null) {      
                for (char item : line.toCharArray()) {
                   if (Character.isLetter(item)){
                        sb.append(item);
                   }
                   if (check.equals(Character.toString(item))) {
                    sb.append(" получил ");
                   }
                   if (Character.isDigit(item)){
                    sb.append(item);
                    sb.append("\n");
                   }          
                }              
                System.out.println(line);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        l.info(sb.toString());
    }

}