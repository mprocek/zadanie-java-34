import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Direction[] direction = Direction.values();

        for (int i = 0; i<direction.length; i++){
            System.out.println(direction[i]);
        }

        System.out.println("Podaj kierunek geograficzny: ");
        String myDirection = scan.nextLine();

        Direction myDirect = Direction.valueOf(myDirection);

        System.out.println("Idziemy na " + myDirect.getNameDirection());

        System.out.println("Podaj numer: ");
        int num = scan.nextInt();
        System.out.println("Wybrałeś kierunek " + convert2(num,direction));

    }

    public static String convert(int num){
        String numToString;
        Direction myDirectNum;
        if (num == Direction.NORTH.ordinal()){
            myDirectNum = Direction.NORTH;
            numToString = myDirectNum.getNameDirection();
        } else if(num == Direction.EAST.ordinal()){
            myDirectNum = Direction.EAST;
            numToString = myDirectNum.getNameDirection();
        } else if(num == Direction.SOUTH.ordinal()){
            myDirectNum = Direction.SOUTH;
            numToString = myDirectNum.getNameDirection();
        } else if(num == Direction.WEST.ordinal()){
            myDirectNum = Direction.WEST;
            numToString = myDirectNum.getNameDirection();
        } else {
            myDirectNum = Direction.UNDEFINED;
            numToString = myDirectNum.getNameDirection();
        }
        return numToString;
    }

    public static String convert2(int num, Direction[] direction){
        if(num<direction.length){
            return direction[num].getNameDirection();
        } else {
            return direction[direction.length-1].getNameDirection();
        }
    }
}
