package GroupProject;

public class Task7 {
    public static void main(String[] args) {
        int num1=0, num2=1, sum=0;
        System.out.print(num1+" "+num2);
        for (int i = 2; i < 10; i++) {
            sum=num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;

        }

    }
}
