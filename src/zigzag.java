public class zigzag {
        public static String convert(String s, int nRows) {
            if(nRows==1) return s;
            StringBuilder sb=new StringBuilder();
            char[] c=s.toCharArray();
            for(int i=0;i<c.length;i+=2*nRows-2){
                sb.append(c[i]);
            }
            for(int j=1;j<nRows-1;j++){
                for(int i=j;i<c.length;i=i+2*nRows-2){
                    sb.append(c[i]);
                    //System.out.print(sb.toString());
                    if(i+2*nRows-2-2*j<c.length){
                    sb.append(c[i+2*nRows-2-2*j]);
                    }
                }
            }
            for(int i=nRows-1;i<c.length;i+=2*nRows-2){
                sb.append(c[i]);
            }
            return sb.toString();
        }
    public static void main(String[] args){
            System.out.println(convert("ab", 1));
    }
}
