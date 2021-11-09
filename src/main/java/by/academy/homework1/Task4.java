package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {
        int a = 2;
        double x=0;
        for (int i = 0 ; x < 1_000_000; i++){
           x =  Math.pow(a, i);

            if (x>1_000_000){
                System.out.println("Число 2 в степени " + i + " меньше 1_000_000 and = "+x);
            }else {
                System.out.println("Число 2  в степени" + i + "больше 1_000_000 and =" +x);
            }
        }
    }
}
