
public class MergeSort{
    private static void conquerArray(int arr[],int si,int mid,int ei){
        int mergedArray[]= new int[ei-si+1];
        int siArr1 = si;
        int siArr2 = mid+1;
        int siMerged = 0;
        while(siArr1 <= mid && siArr2 <= ei ){
            if(arr[siArr1] <= arr[siArr2]){
                mergedArray[siMerged++] = arr[siArr1++];
            }else{
                mergedArray[siMerged++] = arr[siArr2++];
            }
        }
        while(siArr1 <= mid){
            mergedArray[siMerged++] = arr[siArr1++];
        }
        while(siArr2 <= ei){
            mergedArray[siMerged++] =  arr[siArr2++];
        }
        // copy element of mergedArray to original arr
        for(int i = 0,j=si;i<mergedArray.length;i++,j++){
            arr[j] = mergedArray[i];
        }
    }

    private static void divideArray(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divideArray(arr,si,mid);
        divideArray(arr,mid+1,ei);
        // conquer all element
        conquerArray(arr,si,mid,ei);
    }


    public static void main(String[] jd){
        int arr[] = {23,54,43,65,33,53,63};
        int n = arr.length - 1;
        divideArray(arr,0,n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}