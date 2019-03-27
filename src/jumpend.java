//jump gameII 暴力递归方法求解，超时间了。
public class jumpend {
   static boolean[] is=new boolean[1];
    public static int canJump(int[] A) {
        if(A.length<=1)return 0;

        is[0]=false;
            return  canJump(A,0,is,0);

    }
    public static int canJump(int[] A,int n,boolean[] is,int jumps){
        if(n>=A.length) return Integer.MAX_VALUE;
        if(n==A.length-1){is[0]=true;return jumps;}
        if(A[n]==0&&n!=A.length-1) return Integer.MAX_VALUE;
        int[] B=new int[A[n]];
        for(int i=1;i<=A[n];i++){
           B[i-1]=canJump(A,n+i,is,jumps+1);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A[n];i++){
            min=Math.min(min,B[i]);
        }
        return min;
    }
    public static void main(String[] args){
        int[] a={1,2,1,1,4};
        int[] b={3,2,1,0,4};
        int ais=canJump(a);
        //int bis=canJump(b);
        System.out.print(is[0]);
        System.out.println(ais);
        //System.out.print(bis);
    }
}
