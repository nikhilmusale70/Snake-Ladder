import java.util.Random;

public class Snake_Ladder {
    public static void main(String[] args) {
        Random ran=new Random();
        int position=0;

        int die_no = ran.nextInt(6)+1;

        System.out.println("die's result :- " + die_no);
    }
}
