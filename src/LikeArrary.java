import java.util.ArrayList;
import java.util.Scanner;

public  class LikeArrary {
    //static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        long[] count=new long[1];
        count[0]=0;
       // System.out.print("n="+n);
        //System.out.print("k="+k);
        process(n,k,count,list);
        System.out.print(count[0]%1000000007);
    }
    public static void process( int n, int k, long[] count, ArrayList<Integer> list){
        if(list.size()==n){
            //for(int x:list){
               // System.out.print(x+" ");
            //}
          // System.out.print("\n");
            if(happy(list)){
                count[0]++;
                return;
            }
            else return;
        }
        for(int i=1;i<=k;i++){
            list.add(i);
            //for(int x:list){
            //System.out.print(x+" ");
            //}
             //System.out.print("\n");
            process(n,k,count,list);
            list.remove(list.size()-1);
        }
    }
    public static boolean happy(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<=list.get(i+1)||list.get(i)%list.get(i+1)!=0){
                continue;
            }
            else return false;
        }
        return true;
    }
}
