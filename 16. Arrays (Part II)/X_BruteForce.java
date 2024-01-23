//Maximum subarray sum-I
public class X_BruteForce{
    public static void printSubarrays(int numbers[]) {
        int maxsum=0;
        for(int i=0; i<numbers.length; i++) {
            int start=i;
            for(int j=i; j<numbers.length; j++) {
                int end=j;
                int currsum=0;
                for(int k=start; k<=end; k++) {
                    currsum=currsum+numbers[k];
                }
                System.out.println(currsum);
                if(currsum>maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printSubarrays(numbers);
    }
}