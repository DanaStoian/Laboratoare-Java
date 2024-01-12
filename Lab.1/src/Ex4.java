//4. Calculate and display the total number of days for months with fewer than 31 days.
public class Ex4 {
    public static void main(String[] args) {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int totalNumber = 0;
        for (int i = 0; i < 12; i++) {
            if (month_days[i] < 31) {
                totalNumber += month_days[i];

            System.out.println("The total number of days for the months with less than 31 days is" + totalNumber);
            }
        }
    }
}