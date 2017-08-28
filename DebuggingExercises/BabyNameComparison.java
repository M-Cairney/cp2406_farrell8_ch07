import java.util.Scanner;

/**
 * Created by jc260799 on 28/08/17.
 */
public class BabyNameComparison {
    public static void main(String[] args) {

        String babyname1;
        String babyname2;
        String babyname3;
        String lastname;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 baby name:");
        babyname1 = in.nextLine();
        babyname2 = in.nextLine();
        babyname3 = in.nextLine();
        System.out.print("Enter a last name:");
        lastname = in.nextLine();
        System.out.println(babyname1 + " " + lastname);
        System.out.println(babyname2 + " " + lastname);
        System.out.println(babyname3 + " " + lastname);

    }
}
