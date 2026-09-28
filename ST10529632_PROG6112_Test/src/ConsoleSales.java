public class ConsoleSales extends Console {

    public ConsoleSales ( String ConsoleType, String Store) {
        super(ConsoleType,Store, TotalSales);
    }
    public void printReport() {

        System.out.println("CONSOLE SALES REPORT");
        System.out.println("****************************************************");
        System.out.println("Console Type : " + ConsoleType());
        System.out.printf("Store : $%,.2f\n", Store());
        System.out.printf("Total Sales : $%,.2f\n", TotalSales());

    }

    private Object TotalSales() {
        return null;
    }

    private String ConsoleType() {
        ConsoleSales ConsoleSales = new ConsoleSales("PS5", "number 1 Electronic Store");
        .printReport();
    }
        return "";
    }
