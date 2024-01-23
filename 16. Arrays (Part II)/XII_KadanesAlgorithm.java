public class XII_KadanesAlgorithm {
    public static void kadanes(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++) {
            cs += numbers[i];
            if(cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        if(ms == 0) {
            ms = max;
        }
        System.out.println("Maximum Subarray sum = "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        kadanes(numbers);
    }
}