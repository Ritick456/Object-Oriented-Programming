package Level1;

import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0; 

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter rental days: ");
        int days = scanner.nextInt();
        
        CarRental rental = new CarRental(name, model, days);
        
        rental.displayRentalDetails();
    }
}
