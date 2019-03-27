import java.util.Arrays;
/*题目为给定一个分值数组，每个孩子对应一个数值，保证分值高的孩子的糖果比
* 分值低的孩子多，每个孩子至少有一块糖，求最少的糖果数量
*
*
* */
public class Candy {
    public static int candy(int[] ratings) {
        int l=ratings.length;
        if(l<2) return l;
        Arrays.sort(ratings);
        int[] dp=new int[l+1];
        dp[0]=0;
        dp[1]=1;
        int temp;
        for(int i=2;i<=l;i++){
            if(ratings[i-1]==ratings[i-2]){
                temp=dp[i-1];
                temp=temp+temp-dp[i-2];
                dp[i]=temp;
            }
            else{
                temp=dp[i-1];
                temp=temp+temp-dp[i-2]+1;
                dp[i]=temp;
            }
        }
        return dp[l];
    }
    public static void main(String[] args){
        int[] d={5,4,8,9,7,4,66,5,46,65,5,6};
        System.out.print(candy(d));
    }
}
