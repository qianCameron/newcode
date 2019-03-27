public class removeduplicates {
    public static int removeDuplicates(int[] A) {
        if(A.length<=2) return A.length;
        int m=A.length;
        int two=1;
        int index=0;
        for(int i=1;i<m;i++){
            if(A[i]==A[index]&&two!=2){
                A[++index]=A[i];
                two++;
            }
            else if(two==2&&A[i]!=A[index]){
                two=1;
                A[++index]=A[i];
            }
            else if(two!=2&&A[i]!=A[index]){
                two=1;
                A[++index]=A[i];
            }
        }
        return index+1;
    }
    public  static void main(String[] args){
        int[] A={1,2,2};
        int l=removeDuplicates(A);
        System.out.println(l);
        for(int i=0;i<l;i++){
            System.out.println(A[i]);
        }
    }
}
