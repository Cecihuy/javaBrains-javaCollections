import java.util.Date;

class Hello{
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[20];
        numbers[0] = 10;
        System.out.println(numbers[0]);

        Date[] dates = new Date[7];
        dates[3] = new Date();
        System.out.println(dates[3]);
    }
}