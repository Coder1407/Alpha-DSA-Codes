class TypePromotion2 {
    public static void main(String args[]) {
    short a = 5;
    byte b = 25;
    char c = 'c';
    //byte bt = a+b+c; //gives error
    byte bt = (byte) (a+b+c); //type casting
    System.out.println(bt);
    }
}
