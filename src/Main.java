import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exit(18,20);


    }
    public static void exit (int age,int temp) {
        if (age > 48 && age > 20 && temp > -20 && temp > 30) {
            System.out.println("Можно гулять ");

        }else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно гулять ");

        } else if (age < 45 && temp > -10 && temp < 25) {
            System.out.println("Можно гулять ");

        } else {
            System.out.println("Оставайтесь дома ");

        }
    }
    public static int generateRandomAge (int tect, int tect2 ) {
        Random random = new Random();
        return random.nextInt(tect, tect2);

    }
    
}