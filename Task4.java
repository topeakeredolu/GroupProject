package GroupProject;

public class Task4 {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        int sum1=0;
        int sum2=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]%2==0){
                    sum1=sum1+arr[row][col];

                }else if(arr[row][col]%2!=0){
                    sum2=sum2+arr[row][col];
                }

            }


        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
