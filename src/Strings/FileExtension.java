package Strings;

public class FileExtension {
    public static void main(String[] args) {
        // We want to check what is the file extension of any file
        String file = "some_file.jpeg";
        int index = file.lastIndexOf(".");
        System.out.println("char length = " + file.length());
        System.out.println("file extension = " + file.substring(index+1));

    }
}
