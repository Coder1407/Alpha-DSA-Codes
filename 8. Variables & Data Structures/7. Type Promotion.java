class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        // char c = b - a;  error
        int c = b - a;
        System.out.println(c);
    }
}
