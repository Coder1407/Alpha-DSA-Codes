public class V_charAt {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"  ");
        }
    }
    public static void main(String[] args) {
        String str = "Tony Stark";
        printLetters(str);
    }
}
