package SystemExamples;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        // a map is an associative array
        Map<String, String> varEnv = System.getenv();
        System.out.println("System environment variables: " + varEnv);

        System.out.println("------- Listing Environment Variables -------");
        for(String key : varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
        
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}
