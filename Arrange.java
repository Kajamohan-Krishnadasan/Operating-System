import java.util.*;

public class Arrange{
    public void functionLRU(ArrayList<String> al){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter buffer Size : ");
        int memory = sc.nextInt();
        List<String> list = new ArrayList<>(memory);
        List<Integer> flag = new ArrayList<>(memory);
        int pageFault=0;
        for(String i:al){
            if(list.size()<memory){
                if(!list.contains(i) ){
                    list.add(i);
                    flag.add(0);
                    for(int j=0;j<list.size();j++){
                        flag.set(j,flag.get(j)+1);
                    }
                    pageFault++;
                }
                else{
                    flag.set(al.indexOf(i),0);
                }
                System.out.println(list);
            }
            else
            {
                if(!list.contains(i)){
                    int max = Collections.max(flag);
                    list.set(flag.indexOf(max),i);
                    flag.set(flag.indexOf(max),0 );
                    System.out.println(list);
                    pageFault++;
                }
                else{
                    flag.set(list.indexOf(i),0);
                }
            }
        }
        System.out.println("Number of page fault : "+ pageFault);
    }
}
