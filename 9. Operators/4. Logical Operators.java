class Logical {
    public static void main(String args[]){
        //Logical AND
        System.out.println((3>2) && (5>0));
        System.out.println((3<2) && (5>0));
        System.out.println((3>2) && (5<0));
        System.out.println((3<2) && (5<0));
        System.out.println();

        //Logical OR
        System.out.println((3>2) || (5>0));
        System.out.println((3<2) || (5>0));
        System.out.println((3>2) || (5<0));
        System.out.println((3<2) || (5<0));
        System.out.println();

        //Logical NOT
        System.out.println(!(3>2));
        System.out.println(!(2>3));
    }    
}
