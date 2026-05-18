public class largest_element {
  public int largestElement(int[] nums){
    int max=nums[0];
    int pos=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
        max=nums[i];
        pos=i;
         System.out.println(pos);  
    }
    }
    return pos;

  }
  public static void main(String[] args) {
    largest_element obj=new largest_element();
    int nums[]={3,3,6,1};
    int result = obj.largestElement(nums);
   
  }
  
}
