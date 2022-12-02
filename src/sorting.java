import java.util.ArrayList;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println("enter the size of first list");
        int n1=in.nextInt();
        System.out.println("enter the size of second list");
        int n2=in.nextInt();
        int i,inp;
        for(i=0;i<n1;i++){
            System.out.println("enter the elements of first list");
            inp=in.nextInt();
            list1.add(inp);
        }
        for(i=0;i<n2;i++){
            System.out.println("enter the elements of the second list");
            inp=in.nextInt();
            list2.add(inp);
        }
        System.out.println(list1);
        System.out.println(list2);
        int first=0,second=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(first<n1 && second<n2){
            if(list1.get(first)>list2.get(second)){
                res.add(list2.get(second));
                second+=1;
            }
            else if(list1.get(first)<list2.get(second)){
                res.add(list1.get(first));
                first+=1;
            }
            else{
                res.add(list1.get(first));
                res.add(list2.get(second));
                first+=1;
                second+=1;
            }
        }
        for(i=first;i<n1;i++){
            res.add(list1.get(i));
        }
        for(i=second;i<n2;i++){
            res.add(list2.get(i));
        }
        System.out.println(res);
    }
}
