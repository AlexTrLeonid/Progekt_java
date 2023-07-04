import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


 
    public class hous5  {
    public static void main(String args[]){
        Logger logger = Logger.getLogger(  "MyLogger");
        logger.setLevel(Level.INFO);
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        Scanner n1 = new Scanner(System.in);
        SimpleFormatter sf = new SimpleFormatter();
        info.setFormatter(sf);
        System.out.print("Ввод числа  ");
        int num = n1.nextInt();
        System.out.print("Ввод знака  ");
        String n2 = n1.next();
        System.out.print("Ввод числа  ");
        int num1 = n1.nextInt();
        n1.close();
        if (n2.equals("+")) {
            System.out.println((num+num1));
            logger.log(Level.INFO, "сложение");}
        else if (n2.equals("-")) {
            System.out.println(num-num1);
            logger.log(Level.INFO, "вычитание");}
        else if (n2.equals("*")) {
            System.out.print(num*num1);
            logger.log(Level.INFO, "умножение");}
        else if (n2.equals("/")) {
            System.out.print(num/num1);
            logger.log(Level.INFO, "деление");}

    }
}