import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation=true;
        System.out.print("Enter the First Number :");
        num1 = sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^) :");
        operator = sc.next().charAt(0);
        System.out.print("Enter the Second number :");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result= num1+num2;
            case '-'->result= num1-num2;
            case '*' ->result= num1*num2;
            case '/'->{
                if(num2==0){
                    System.out.printf("Division not possible due to %f",num2);
                }else{
                    result=num1/num2;
                }

            }
            case '^'->result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperation=false;
            }
        }
        if(validOperation){
        System.out.printf("The %c of %.1f and %.1f is %.1f ",operator,num1,num2,result);

        }


        sc.close();
    }

}
