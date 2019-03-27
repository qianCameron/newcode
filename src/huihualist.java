import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class huihualist{
    //网易游戏第二题 把回话id按最近发布时间排序显示
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int n=scan.nextInt();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list;
        for(int i=0;i<n;i++){
            list=new ArrayList<Integer>();
            int m=scan.nextInt();
            for(int j=0;j<m;j++){
                list.add(scan.nextInt());
            }
            res.add(list);
        }
        for(int i=0;i<n;i++){
            String str="";
            set.clear();
            for(int j=res.get(i).size()-1;j>=0;j--){
                if(!set.contains(res.get(i).get(j))){
                    set.add(res.get(i).get(j));

                    str=str+res.get(i).get(j)+" ";
                    //ystem.out.print(res.get(i).get(j));
                }
            }
            str.substring(0,str.length()-1);
            System.out.print(str);
            System.out.print("\n");
        }
    }

}