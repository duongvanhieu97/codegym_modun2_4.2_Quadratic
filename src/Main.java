import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = scanner.nextDouble();
        Quadratic quadratic = new Quadratic(a,b,c);
        System.out.println("a, b, c Phương trình bậc hai \n" + quadratic.display());
        if (quadratic.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiêm duy nhất: x = " + quadratic.getRoot() );
        }else {
            System.out.println("Phương trình có 2 nghiệm x1 = " + quadratic.getRoot1() + ", x2 = " + quadratic.getRoot2());
        }
    }
}
