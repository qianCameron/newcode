import java.util.ArrayList;

public class combine {
   static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();

        combine(list,n,k,1);
        return res;
    }
    public static void combine(ArrayList<Integer> list,int N,int k,int start) {
        if (k == 0) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = start; i <= N; i++) {
            //if (!list.contains(i)) {
            for (int n:list
                 ) {
                System.out.print(n);
            }
System.out.print('\n');
            list.add(i);
            combine(list, N, k - 1, i+1 );
            list.remove(list.size() - 1);
        //}
        }
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> r=combine(4,3);
        for(ArrayList<Integer> lists:r){
            for(Integer n:lists){
                //System.out.print(n);
            }
            System.out.print("\n");
        }
    }
}
