import java.util.Scanner;

/**
 * Created by Администратор on 15.12.2015.
 */
public class Calculator {
    private double result;

    public void add(double... number) {
        for (Double num : number)
            this.result += num;
    }

    public void subtraction(double ...number) {
        this.result = number[0];
        for (Double num : number)
            this.result -= num;
        this.result += number[0];
    }

    public void del(double... number) {
        this.result = number[0];
        for (Double num : number)
            this.result /= num;
        this.result *= number[0];
    }

    public void mult(double... number) {
        this.result = number[0];
        for (Double num : number)
            this.result *= num;
        this.result /= number[0];
    }
    private void math(String chose,double fist,double second)
    {
        switch (chose) {
            case "+":
                add(fist, second);break;
            case "-":
                subtraction(fist, second);break;
            case "*":
                mult(fist, second);break;
            case "/":
                del(fist, second);break;
            default:
                System.out.println("Eror");
                break;
        }
    }

    public void operation() {
        Scanner sc = new Scanner(System.in);

        double fist=0, second=0;
        String value="no";
        String exit="no";
        while (!exit.equals("yes")) {

            if(value=="no"){
                System.out.print("Enter fisrt number:");
                fist = sc.nextDouble();
            }
            else{ fist=this.result;}
            System.out.print("Enter second number:");
            second = sc.nextDouble();

            System.out.print("Enter operation(+,-,*,/)");
            String chose = sc.next();

            math(chose,fist,second);

            System.out.println(fist + chose + second + " = " + this.result);
            System.out.print("Exit(yes/no)");
            exit=sc.next();
            System.out.print("use the old value(yes/no)?");
            value=sc.next();

        }
          sc.close();

}

    public double getResult() {
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }

}
