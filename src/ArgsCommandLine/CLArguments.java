package ArgsCommandLine;

public class CLArguments {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("No arguments provided");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument nr " + i + ": " + args[i]);
        }
    }
}
