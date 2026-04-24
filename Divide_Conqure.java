public class Divide_Conqure {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int start ,int end ){
        if(start>=end){
            return;
        }
        //kaam 
        int mid =start +(end-start)/2;
        mergeSort(arr, start, mid);//left part
        mergeSort(arr, mid+1, end);//right part
        merge(arr,start,mid,end);

    }
    public static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr

        while(i<=mid && j<=end){
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=end){
            temp[k++]
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0,arr.length-1);
    }
    
}
