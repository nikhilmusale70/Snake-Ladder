import java.util.Random;

public class Snake_Ladder {

    public static int no_play=0;
    public static int ladder=1;
    public static int snake=2;

    public static void main(String[] args) {
        Random ran=new Random();
        int position1=0;
        int position2=0;
        int i=0;
        int j=0;

        do {
            //for player 1
            int option = ran.nextInt(3);
            int die_no = ran.nextInt(6) + 1;
            i++;

            //System.out.println("you got " + die_no);

            if (option == ladder) {
                //System.out.println("ladder");
                position1 = die_no + position1;
                if (position1>100)
                    position1=position1-die_no;
            } else if (option == snake) {
                //System.out.println("snake");
                position1 = position1 - die_no;
                if (position1 < 0)
                    position1 = 0;
            } else {
                //System.out.println("No-Play");
            }

            //System.out.println("Player 1 Currently on :- " + position1);

       //for player 2

            int option2 = ran.nextInt(3);
            int die_no2 = ran.nextInt(6) + 1;
            j++;

            //System.out.println("you got " + die_no);

            if (option2 == ladder) {
                //System.out.println("ladder");
                position2 = die_no2 + position2;
                if (position2>100)
                    position2=position2-die_no2;
            } else if (option == snake) {
                //System.out.println("snake");
                position2 = position2 - die_no2;
                if (position2 < 0)
                    position2 = 0;
            } else {
                //System.out.println("No-Play");
            }

        }while (position1<100 && position2<100);
        if (position1==100)
            System.out.println("player1 won in "+i+" die thrown");
        if (position2==100)
            System.out.println("Player2 won in "+j+" die thrown");
        System.out.println(position1);
    }
}
