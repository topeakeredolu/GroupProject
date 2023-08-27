package GroupProject;

public class Task8 {
    public static void main(String[] args) {

        int [] arr={0,1, 1, 2, 3, 5, 8, 13, 21, 34};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <10; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];

            }

        }
        System.out.println(max+" "+min);
    }
}
