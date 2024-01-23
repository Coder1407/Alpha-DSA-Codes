//Maximum subarray sum-II
public class XI_PrefixSum{
    public static void maxSubarraySum(int numbers[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        //Prefix array
        int prefix[] = new int[numbers.length];
        prefix[0]= numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        //Calculating maximum subarray sum
        for(int i=0; i<numbers.length; i++) {
            int start=i;
            for(int j=i; j<numbers.length; j++) {
                int end=j;
                if(start==0) {
                    currsum = prefix[end];
                }
                else {
                    currsum = prefix[end] - prefix[start-1];
                }
                if(currsum>maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}