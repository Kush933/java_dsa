public class Bubble_sort {
  public int [] bubbleSort(int[] nums){
    int n = nums.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(nums[j]>nums[j+1]){
          int temp = nums[j];
          nums[j]=nums[j+1];
          nums[j+1]=temp;
        }
      }
    }return nums;
  }
  public static void main(String[] args) {
    Bubble_sort obj = new Bubble_sort();
    int arr[]={7,4,1,5,3};
    int [] sorted = obj.bubbleSort(arr);
    System.out.println("Sorted Array:");

    for(int num : sorted){
      System.out.print(num + " ");
    }
  }
  
}
