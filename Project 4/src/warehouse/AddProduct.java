package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        int count = StdIn.readInt(); 
        StdIn.readLine(); 
        Warehouse w = new Warehouse();

        for (int i = 0; i < count; i++) {
            int day = StdIn.readInt();
            int id = StdIn.readInt(); 
            String name = StdIn.readString(); 
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();

            w.addProduct(id, name, stock, day, demand);
        }

        StdOut.setFile(args[1]);
        StdOut.println(w);
    }
}
