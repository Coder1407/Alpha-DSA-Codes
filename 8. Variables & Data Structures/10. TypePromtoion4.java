class TypePromtoion4 {
    public static void main(String args[]) {
        byte b = 5; //byte range is -127 to 128.
        //b = b * 2; //wrong
        b = (byte) (b*2); //right
        System.out.println(b);
    }
}
