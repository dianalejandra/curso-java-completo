import javax.swing.*;

public class TheLongestName {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog(null,"Put one name");
        String name2 = JOptionPane.showInputDialog(null,"Put a second name");
        String name3 = JOptionPane.showInputDialog(null,"Put a third name");

        String max = (name1.split(" ")[0].length() < name2.split(" ")[0].length())? name2: name1;
        max = (name3.split(" ")[0].length() < max.split(" ")[0].length())? max : name3;

        System.out.println("The longest name is " + max);
    }
}
