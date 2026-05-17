public class Insertion_sort {
  public int[] insertionSort(int [] nums){
    int  n=nums.length;
    for(int i=1;i<n;i++){
      int key=nums[i];
      int j= i-1;

      while(j>=0 && nums[j]>key){
        nums[j+1]=nums[j];
        j--;
      }
       nums[j+1]=key;
    }
    return nums;
  }
  public static void main(String[] args) {
    Insertion_sort obj = new Insertion_sort();
    int arr[]={7,4,1,5,3};
    int sorted[]=obj.insertionSort(arr);
    System.out.println("Sorted Array");

    for( int nums:arr){
      System.out.print(num + " ");
    }
  }
  
}
