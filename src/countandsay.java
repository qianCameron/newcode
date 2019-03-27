public class countandsay {
    public static String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        int w=0;
        int num=n;
        while(num>0){
            num=num/10;
            w++;}
        if(w==1){
            sb.append(count);
            sb.append(n);
            return sb.toString();}
        int[] a=new int[w];
        int j=w-1;
        while(n>0){
            a[j]=n%10;
            n=n/10;
            j--;
        }
        for(int i=1;i<w;i++){
            if(a[i]!=a[i-1]){
                sb.append(count);
                sb.append(a[i-1]);
                count=1;
            }
            else count++;
        }
        sb.append(count);
        sb.append(a[w-1]);
        return sb.toString();
    }
    public static void main(String[] args){
        int n=1211;
        System.out.println(countAndSay(n));
    }
}