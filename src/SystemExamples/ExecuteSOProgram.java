package SystemExamples;

public class ExecuteSOProgram {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        String operativeSystem = System.getProperty("os.name");
        System.out.println("operativeSystem = " + operativeSystem);

        try{
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                process = rt.exec("gedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (Exception e){
            System.err.println("Command not known: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("The editor is closed");
        System.exit(0);
    }
}