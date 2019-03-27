import java.util.Scanner;

public class qishui {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //int temp=0;
        while(scan.hasNext()){
            int temp=scan.nextInt();
            if(temp==0){
                continue;
            }
            else
            System.out.println(process(temp));
        }

    }
    public static int process(int a){
        int res=0;
        while(a>=3){
            int p=a/3;
            res=res+p;

            a=a%3+p;
        }
        if(a==2){
            res++;
        }
        return res;

    }
}
