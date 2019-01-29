import java.sql.SQLOutput;
import java.util.Scanner;

public class Avarage_Score {
    public static void main(String[] args) {
        int sum=0;
        int numbers;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("please enter the "+i+1 +" variable");
            numbers=scanner.nextInt();
            sum=sum+numbers;
        }
        int average=sum/10;
        System.out.println("the avarage of the number is "+average);

    }
}
