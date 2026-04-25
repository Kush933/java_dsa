public class Quick_Sort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[],int start,int end){
        if(start<end){
          //last element
        int pidx = partition(arr,start,end);
        
        quicksort(arr,start,pidx-1);//left
        quicksort(arr,pidx+1,end);//end
        }
    }
    public static int  partition(int arr[],int start,int end) {
        int pivot =arr[end];
        int i=start-1;//to make palace for element smaller than pivot 

        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
              i++;
                //swap
                int temp = pivot;
                arr[end]=arr[i];//dont write pivot =arr[i] qki pivot ek variable hai jiskachange fun me reflect ni hoga 
                arr[i]=temp;
                return i;

    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        printArr(arr);
    }
}
