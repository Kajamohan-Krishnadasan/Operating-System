import java.util.ArrayList;
import java.util.Scanner;

public class StringCall {
    public ArrayList call(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Page :");
        int size = sc.nextInt();
        ArrayList<String> al=new ArrayList<>(size);
        System.out.println("Enter Page Name :");

        for(int i=0;i<size;i++){
            al.add(sc.next());
        }
        return al;
    }

}
