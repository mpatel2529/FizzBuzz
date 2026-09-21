package lab1;

public class Multiples {
    static void main() {
        for(int i = 1; i<1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
