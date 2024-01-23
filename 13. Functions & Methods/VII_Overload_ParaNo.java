public class VII_Overload_ParaNo {
    public static void multiply(int a, int b) {
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public static void multiply(int a, int b, int c) {
        System.out.println(a+" * "+b+" * "+c+" = "+(a*b*c));
    }
    public static void main(String[] args) {
        multiply(2, 3, 5);
        multiply(12, 16);
    }
}
