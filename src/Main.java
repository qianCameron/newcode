import java.util.Scanner;
//网易游戏开发第一题
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();

        String[] str=new String[n];
        for(int i=0;i<n;i++){
           str[i]=scan.nextLine();


        }
        for(int i=0;i<n;i++){

            System.out.println(corect(str[i]));

        }

    }
    public static String corect(String time){
        String[] str=time.split(":");

        int shi=Integer.valueOf(str[0]);
        int fen=Integer.valueOf(str[1]);
        int miao=Integer.valueOf(str[2]);
        if(shi>23){
            int sg=shi%10;
            str[0]="0"+sg;
        }
        if(fen>59){
            int fg=fen%10;
            str[1]="0"+fg;
        }
        if(miao>59){
            int mg=miao%10;
            str[2]="0"+mg;
        }
        String res=str[0]+":"+str[1]+":"+str[2];
        return res;
    }

}
