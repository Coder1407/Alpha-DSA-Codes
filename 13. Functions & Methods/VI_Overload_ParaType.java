public class VI_Overload_ParaType {
    public static void multiply(int a, int b) {
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public static void multiply(float a, float b) {
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public static void multiply(double a, double b) {
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public static void main(String[] args) {
        multiply(1.6f, 2.3f);
        multiply(12, 16);
        multiply(12.6, 3.44);
    }
}