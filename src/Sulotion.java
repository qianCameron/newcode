import java.util.ArrayList;
public  class Sulotion {
    public static ArrayList<Integer> grayCode(int n) {

        int[] bit=new int[1];
        bit[0]=0;
        int change=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(n==0)
            return res;
        int[] check=new int[n];
        for(int i=0;i<n;i++){
            check[i]=1;
        }
        int[] now=new int[n];
        for(int i=0;i<n;i++){
            now[i]=0;
        }
        int[] pre2=new int[n];
        for(int i=0;i<n;i++){
            pre2[i]=0;
        }
        int[] pre1=new int[n];
        for(int i=0;i<n-1;i++){
            pre1[i]=0;
        }
        pre1[n-1]=1;
        res.add(array2int(pre2));
        res.add(array2int(pre1));
        while(res.size()!=(1<<n)){
            for(int i=0;i<n;i++){
                if(pre2[i]!=pre1[i]){
                    change=i;
                    break;}
            }
            if(change==0){
                for(int i=1;i<n;i++){
                    now=pre1;
                    if(pre1[i]==0) now[i]=1;
                    if(pre1[i]==1) now[i]=0;
                    //now=pre1[i]^check[i];
                    if(!res.contains(array2int(now))){
                        res.add(array2int(now));
                        break;
                    }
                }
            }
            else
                for(int i=0;i<n;i++){
                    if(i!=change){
                        now=pre1;
                        if(pre1[i]==0) now[i]=1;
                        if(pre1[i]==1) now[i]=0;
                        if(!res.contains(array2int(now))){
                            res.add(array2int(now));
                            break;
                        }
                    }
                }
            pre2=pre1;
            pre1=now;
            //for(int i=0;i<=change;i++){
            //     pre1[i]^check[i]
            //}
        }
        return res;
    }
    public static int array2int(int[] array){
        int start=0;
        int res=0;
        for(int i=array.length-1;i>=0;i--){
            if(array[i]==1){
                start=i;
                break;}
        }
        for(int i=start;i>=0;i--){
            res=res+array[i]*(1<<i);
        }
        return res;
    }
    public static void main(String[] args){
        ArrayList<Integer> res=new ArrayList<Integer>();
        res=grayCode(3);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }


    }
}