// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class hous4 {
    private static File Sem;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            Sem = new File("Sem.txt");
            Sem.createNewFile();
            fileWriter = new FileWriter(Sem);
            int[] sortArr = { 22, 55, 0, 10, -3, 8 };
            bubbleSort(sortArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            writeLog(Arrays.toString(sortArr));
        }
    }    

    public static void writeLog(String note) {
        
        try(FileWriter writer = new FileWriter("Sem.txt"))
        {
           fileWriter.write(note + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}