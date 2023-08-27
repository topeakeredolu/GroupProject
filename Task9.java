package GroupProject;

public class Task9 {
    public static void main(String[] args) {
        int [] arr={0,1, 1, 2, 3, 5, 8, 13, 21, 34};
        int large1=0;
        int large2=0;
        if(arr[0]> arr[1]){
            large1=arr[0];
            large2=arr[1];


        }else{
            large1=arr[1];
            large2=arr[0];

        }
        for (int i = 2; i <=arr.length-1 ; i++) {
            if(arr[i]> large1){
                large2=large1;
                large1=arr[i];
            }else if (arr[i]>large2){
                large2=arr[i];
            }

        }
        System.out.println(large2);

    }
}
