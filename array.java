public class array {
    public static void main(String[] args) {
        int[] arr= {7,2,-1,4,-3,2,-1,6};
        seperatenumber(arr);
        for( int i=0 ; i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    public static void seperatenumber(int[] arr){
    int  j =  arr.length()-1 ;
    for( int i = 0 ;i<arr.length; i++){
        if(arr[i] < 0 && arr[i] != arr[j]){
             if(arr[j] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
             }
             else{
                j--;
             }
        else{
            i++;
        }

        }
    }

}
}
