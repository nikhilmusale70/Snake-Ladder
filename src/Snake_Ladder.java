import java.util.Random;

public class Snake_Ladder {

    public static int no_play=0;
    public static int ladder=1;
    public static int snake=2;

    public static void main(String[] args) {
        Random ran=new Random();
        int position=0;

        do {
            int option = ran.nextInt(3);
            int die_no = ran.nextInt(6) + 1;

            System.out.println("you got " + die_no);

            if (option == ladder) {
                System.out.println("ladder");
                position = die_no + position;
            } else if (option == snake) {
                System.out.println("snake");
                position = position - die_no;
                if (position < 0)
                    position = 0;
            } else {
                System.out.println("No-Play");
            }

            System.out.println("Player 1 Currently on :- " + position);
        }while (position<100||position>100);
    }
}
