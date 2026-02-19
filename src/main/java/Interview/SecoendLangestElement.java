package Interview;

public class SecoendLangestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,67,88,10,45};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.println("The secoend max number is "+arr[1]);
    }
}
