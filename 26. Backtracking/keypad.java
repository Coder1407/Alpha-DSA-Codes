public class keypad {
    final static char[][] keypad = {{},{},{'a','b','c'},{'d','e','f'} , {'g','h','i'} ,{'j','k','l'},{'m','n','o'} , {'p','q','r','s'} ,{'t','u','v'},{'w','x','y','z'}};
    public static void rec(String a , int len , int pos, StringBuilder ans)
    {
        if(pos==len)
        {
            System.out.print(ans.toString()+" ");
            return ;
        }
        char[] keyPos = keypad[Character.getNumericValue(a.charAt(pos))];
        for(int i=0;i<keyPos.length;i++)
        {
            rec(a,len,pos+1,new StringBuilder(ans).append(keyPos[i]));
        }
    }
    public static void main(String[] args) {
        String a ="27";
        int len=2;
        rec(a,len,0,new StringBuilder());
    }
}