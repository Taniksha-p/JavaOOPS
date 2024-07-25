
public class typeof {
    public static void main(String[] args) {
        float x = 2.0f;
        
        // Since we know the variable type at compile time
        System.out.println("Type of x is: " + getType(x));
    }

    public static String getType(float var) {
        return "float";
    }

    public static String getType(int var) {
        return "int";
    }

    public static String getType(double var) {
        return "double";
    }

    public static String getType(long var) {
        return "long";
    }

    public static String getType(short var) {
        return "short";
    }

    public static String getType(byte var) {
        return "byte";
    }

    public static String getType(char var) {
        return "char";
    }

    public static String getType(boolean var) {
        return "boolean";
    }
}

