//PROGRAM TO REVERSE A GIVEN STRING
//P S SIDHARTH
//ROLL NO:49
import java.util.Scanner;
class reverse {
    public static void main(String[] args) {
        String st, reverse = "";
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the string:");
        st = S1.nextLine();
        int length = st.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + st.charAt(i);
        }
			System.out.println("The reversed string is"+reverse);

        S1.close();
    }
}
