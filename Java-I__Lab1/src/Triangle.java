public class Triangle {
    public static void main(String[] args) {

        for (int height=0; height<7; height++){
            for (int num_spaces=height; num_spaces<7; num_spaces++)
                System.out.print(" ");
            for (int tees = 0; tees < (height * 2) + 1; tees++)
                System.out.print("T");
            System.out.println(); //New row or next line; Loop starts
            // from the top (height has incremented by 1)
        }
    }
}
