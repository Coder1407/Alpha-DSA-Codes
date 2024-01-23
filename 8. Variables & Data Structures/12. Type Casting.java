class TypeCasting {
    public static void main(String args[]) {
        float a = 25.999f;
        int b = (int) a; //float to int -> larger stroing in smaller
        System.out.println(b); //No round off
    }
}
