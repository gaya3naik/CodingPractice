import java.util.Scanner;

/**
 * Created by gnaik on 13/04/17.
 */
public class TowersOfHanoi {

    private void solve(int discs, String start, String aux, String end){
        if(discs == 0){
                return;
        } else if( discs == 1){
            System.out.println(start + " -->" + end);
        }
        solve(discs-1, start, end, aux);  // First move all but last disks to the aux!
        System.out.println(start + " --> "+end);
        solve(discs-1, aux, start, end);
    }

    public static void main(String args[]){
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "A", "X", "B");
    }
}
