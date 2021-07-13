package departmentstore5;

public class Main {
    public static void main(String[] args) throws Exception {
        long itemID = 0;
        double price = 0.00d;
        String description = "Unknown";
        //The first list contains women's items
        //The other contains non-women items
        long[][]itemNumbers = new long[][]{
                { 947783, 934687, 973947, 987598, 974937 },
                { 739579, 367583, 743937, 437657, 467945 } };

        String[][]itemNames=new String[][]{
                {
                        "Women Double-faced wool coat",
                        "Women Floral Silk Tank Blouse",
                        "Women Push Up Bra",
                        "Women Chiffon Blouse",
                        "Women Bow Belt Skirtsuit"
                },
                {
                        "Men Cotton Polo Shirt",
                        "Children Cable-knit Sweater  ",
                        "Children Bear Coverall Cotton",
                        "Baby three-piece Set         ",
                        "Girls Jeans with Heart Belt  "
                }
        };
        double[][] unitPrices = new double[][] {
            { 275.25D, 180.05D, 50.00D, 265.35D, 245.55D },
            {  45.55D,  25.65D, 28.25D,  48.55D,  19.95D }
        };

        System.out.println("Item Identification");
        System.out.println("Item Number: " + itemID);
        System.out.println("Description: " + description);
        System.out.printf("Unit Price:  %.2f\n", price);
    }
}
