import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ProductMenu {
    public static void main(String[] args) {
        int indexOptions = 0;
        do {

            Map<String, Integer> options = new HashMap<>();
            options.put("Update", 1);
            options.put("Delete", 2);
            options.put("Add", 3);
            options.put("List", 4);
            options.put("Exit", 5);

            Object[] arrayOptions = options.keySet().toArray();

            Object option = JOptionPane.showInputDialog(null,
                    "Select an option: ",
                    "Product Manager",
                    JOptionPane.INFORMATION_MESSAGE, null, arrayOptions, arrayOptions[0]);

            if (option == null) {
                JOptionPane.showMessageDialog(null, "You must select an operation!");
            } else {
                indexOptions = options.get(option.toString());
                switch (indexOptions) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Product updated successfully");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Product deleted successfully");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Product added successfully");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Product listed successfully");
                        break;
                }
            }
        } while (indexOptions != 5);
        JOptionPane.showMessageDialog(null, "You logged out!");
    }
}
