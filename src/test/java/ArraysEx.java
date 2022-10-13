import java.util.Arrays;
public class ArraysEx {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        weekdays[0] = "Sunday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekdays));

        for(String day: weekdays)
            System.out.println(day);

        for(int i=0;i<=weekdays.length-1;i++)
            System.out.println(weekdays[i].toUpperCase());
    }
}
