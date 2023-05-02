import java.util.Calendar;
import java.util.GregorianCalendar;

//public class Main {
//    public static void main(String[] args)
//    {
//        Number [] numbers = { new Rational(1,2), new Integer(4), new Double(5.6)};
//        java.util.Arrays.sort(numbers);
//    }
//}

//public class Main {
//    public static void main(String[] args)
//    {
//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(x.intValue());
//        System.out.println((Integer) x.compareTo(new Integer(4)));
//    }
//}

public class Main {
    public static void main(String[] args)
    {
        java.util.Date x = new java.util.Date();
        java.util.Date y = (java.util.Date) x.clone();
//        new x.clone();
        System.out.println(x=y);
    }
}