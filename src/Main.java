import java.util.Scanner;

void main() {
//    System.out.println(2);
    Scanner sc =new Scanner(System.in);
    String name;
    double price;

    System.out.println("What item would you like to buy");
    name=sc.nextLine();
    System.out.println("Enter the Price of the product");
    price =sc.nextDouble();

    sc.close();
}
