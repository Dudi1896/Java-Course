public class Main {
    public static void main(String[] args) {


        int n = 5;
        int m = 4;
        for (int row = 0; row < n ; row++) {

            for (int col = row; col < n  ; col++) {
                    System.out.print(" - ");
            }
            for (int col = 0; col <= row  ; col++) {
                System.out.print("*  ");
            }
            for (int col = n - row; col < n; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int row = 0; row < m ; row++) {
            for (int col = row; col <= row ; col++){
                System.out.print(" - ");
            }
            for (int col = m-row; col <= m; col++){
                System.out.print(" - ");
            }
            for (int col = row; col < m  ; col++) {
                System.out.print("*  ");
            }
            for (int col = row; col < m-1  ; col++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        for (int row = 0; row < n; row ++) {
            for (int col = row; col < n; col++) {
                System.out.print("   ");
            }
            for (int col = n- row; col <= n; col++) {
                if(row >= 0 ) {
                    System.out.print(row + 1 + "  ");
                }
            }
            for (int col = 0; col < row; col++) {
                System.out.print(row + 1 + "  ");
            }

            System.out.println();
        }

        for (int row = 0; row < n; row ++) {
            for (int col = row; col < n; col++) {
                System.out.print("   ");
            }
            for (int col = n- row; col <= n; col++) {
                if(row >= 0 ) {
                    System.out.print(n-col+1 + "  ");
                }
            }
            for (int col = 0; col < row; col++) {
                System.out.print(col+2 + "  ");
            }

            System.out.println();
        }


        System.out.println(" Multiplication Table");
        // Display the number title
        System.out.print(" ");
        for (int j = 1; j <= 9; j++)
        System.out.printf("%4d", j);

        System.out.println("\n———————————————————————————————————————");

        // Display table body
        for (int i = 1; i <= 9; i++) {
             System.out.print(i + " | ");
             for (int j = 1; j <= 9; j++) {
                 // Display the product and align properly
                 System.out.printf("%4d", i * j);
                 }
             System.out.println();
             }
    }
}