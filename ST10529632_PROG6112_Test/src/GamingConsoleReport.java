public class GamingConsoleReport {
    public static void main(String[]args){

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria" };
        String[] console = {"PS5", "XBOX", "SWITCH" };

        int[][] sales = {{1000,2000, 3000},
                         {2000,3000, 4000},
                        {1500,1100, 1200},
                        };
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------------------------------");

        System.out.printf("%-18s", " ");
        for (int i = 0; i < console.length; i++) {
            System.out.printf("%-18s", console[i]);
        }
        System.out.println();

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-18s", sales[i][j]);
            }

            System.out.println();

        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------------------");

        for (int car = 0; car < console.length; car++) {
            int total = 0;
            for (int s = 0; s < sales[car].length; s++) {
                total += sales[car][s];
            }
            System.out.printf("%-10s %d\n", console[car], total);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES " +cities[1] );
        System.out.println("-------------------------------------------------------------------------");


    }

}