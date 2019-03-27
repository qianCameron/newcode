public class NUMDISTINCT {
   static int count=0;
    public static int numDistinct(String S, String T) {
        StringBuilder sb=new StringBuilder();
        char[] s=S.toCharArray();
        //char[] t=T.toCharArray();
        num(sb,s,T,0);
        return count;
    }
    public static void num(StringBuilder sb,char[] s,String t,int start){

        if(sb.length()==t.length()){
            //System.out.println(sb.toString());
            if(sb.toString().equals(t)){count++;return;}

        }
        if(sb.length()>t.length()){return;}
        for(int i=start;i<s.length;i++){
            System.out.println(sb.toString());
            sb.append(s[i]);
            num(sb,s,t,start+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public static void main(String[] args){
        System.out.println(numDistinct("rabbbit","rabbit"));
    }
}
