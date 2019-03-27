import java.util.Scanner;
import java.util.TreeSet;

public class quchong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            TreeSet<Integer> set = new TreeSet<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {

            set.add(scan.nextInt());
        }
        for (int x : set
        ) {
            System.out.println(x);
        }
    }
    }
}
