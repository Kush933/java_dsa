public class Solution15 {
  public int [] selectionSort(int[] nums){
    int n=nums.length;
    for(int i=0;i<n-1;i++){
      int minIndex = i;
      for( int j=i+1;j<n;j++){
        if(nums[j]<nums[minIndex]){
          minIndex = j ;
        }

      }
      //swap
      int temp=nums[i];
      nums[i]=nums[minIndex];
      nums[minIndex]=temp;
    }
    return nums;


  }
  public static void main(String[] args) {
     int [] arr={7,4,1,5,3};
     Solution15 obj = new Solution15();
     int [] sortedArray = obj.selectionSort(arr);
     System.out.println("Sorted Array:");
     for(int num:sortedArray){
      System.out.print(num + " ");
     }
  }
  
}
