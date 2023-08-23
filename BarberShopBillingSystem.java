import java.util.Scanner;
public class BarberShopBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {50, 55, 60, 61, 70, 75};
        
        System.out.print("Welcome to Bacani's BarberShop Billing System!\n");
        
        System.out.print("Username: ");
        String username = input.nextLine();
        
        System.out.print("Password: ");
        String password = input.nextLine();
        
        System.out.print("\nHaircut\t\tPrice\n");
        System.out.print("Fade Haircut\tP 50\n");
        System.out.print("Taper Haircut\tP 55\n");
        System.out.print("Buzz Cut     \tP 60\n");
        System.out.print("Crew Cut     \tP 61\n"); // Changed from 65
        System.out.print("French Crop  \tP 70\n");
        System.out.print("Undercut     \tP 75\n");
        
        System.out.print("Choose your haircut (1-6): ");
        int choice = input.nextInt();
        
        if (choice < 1 || choice > 6) {
            System.out.println("Invalid choice.");
            return;
        }
        
        int total = price[choice - 1]; // Adjusted array index
        
        System.out.print("The total price is : P " + total + "\n");
        
        System.out.print("Enter your payment here : P ");
        int payment = input.nextInt();
        
        if (payment < total) {
            System.out.println("Insufficient payment.");
            return;
        }
        
        System.out.print("Change : P " + (payment - total));
        
        System.out.print("\n\nTHANK YOU PLEASE COME AGAIN!\n");
    }
}

