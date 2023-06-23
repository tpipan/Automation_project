package homework02;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        int days = 0;


        for (int i = 1900; i >= 1900 && i <= 2016; i++) {
            if ((i%4==0) || ((i%100==0)&&(i%400==0))) {
                days = 29;
            }
            else{
                days = 28;
            }
            System.out.println("Numarul de zile din luna Februarie este pentru anul " + i + " este " + days);
        }
    }
}
