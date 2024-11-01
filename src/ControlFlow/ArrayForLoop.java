package ControlFlow;

import javax.swing.*;

public class ArrayForLoop {
    public static void main(String[] args) {
        String [] names = {"Wise", "Belle", "Billy", "Anton", "Diana", "Burnice", "Caesar", "Anby" };
        int count = names.length;
        for (int i = 0; i < count; i++) {
            if (names[i].toLowerCase().contains("WISE".toLowerCase()) || names[i].toLowerCase().contains("ANBY".toLowerCase())){
                continue;
            }
            System.out.println(i + ". " + names[i]);
        }

        String search = JOptionPane.showInputDialog("Insert a name, for example \"Wise\" or \"Belle\": ");
        System.out.println("search = " + search);

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)){
                found = true;
                break;
            }
            System.out.println("names = " + names[i]);
        }
        if (found){
            JOptionPane.showMessageDialog(null, search + " was found!");
        } else {
            JOptionPane.showMessageDialog(null, search + " does not exist in the system!");
        }
    }
}
