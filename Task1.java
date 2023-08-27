package GroupProject;

public class Task1 {
    public static void main(String[] args) {
        int [] temp={22,20,18,19,22,21,23};
        int min=temp[0];
        int max=temp[0];


        for (int i = 1; i < temp.length; i++) {

            if(temp[i]>max){
                max=temp[i];


            }else if(temp[i]<min){
                min=temp[i];

            }


        }
        System.out.println(min);
        System.out.println(max);
    }
}
