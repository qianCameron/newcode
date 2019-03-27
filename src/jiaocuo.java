import java.util.Scanner;

public class jiaocuo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int max=1;
        int sum=1;
        int index=0;
        for(int i=0;i<str.length();i=i+sum){
            sum=1;
            for(int j=i;j<str.length()-1;j++){
                if(str.charAt(j)!=str.charAt(j+1)){
                    sum++;
                    //index=j+1;
                }
                else {
                    //index=j+1;
                    //System.out.println(index);
                    break;
                }

            }
            max=Math.max(sum,max);
            //System.out.println("max"+max);
        }
        System.out.print(max);
    }
}
