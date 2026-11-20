import java.util.Scanner;
public class Count21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int move;

        System.out.println("Count 21!");
        System.out.println("Each turn, you add 1, 2, or 3 to the total.");
        System.out.println("If the total reaches or passes 21, you lose the game.");
        System.out.println();

        while(total < 21)
        {
            System.out.print("Enter 1, 2, or 3 >> ");
            move = input.nextInt();
            while(move < 1 || move > 3)
            {
                System.out.println("Invalid. Try Again.");
                System.out.print("Enter 1, 2, or 3 >>");
                move = input.nextInt();
            }
            total = total + move;
            System.out.println("Total: " + total + ".");

            if(total >= 21)
            {
                System.out.println("You hit " + total + ". You lose!");

            }
            else
            {
                move = 4 - (total % 4);
                total = total + move;
                System.out.println("Computer moves " + move + ".");
                System.out.println("Computer's total is " + total + ".");
            }
            System.out.println();
        }
        input.close();
    }
}