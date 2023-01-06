import java.util.Scanner;

public class PlayerHandler {

    private static Scanner sc = new Scanner(System.in);
    private static int posX = 0;
    private static int posY = 0;

    public static void PlayerSpawn() throws CustomException {
        int x = Map.GenX();
        int y = Map.GenY();

        while (x == 0 || x == 9){
            x = Map.GenX();
        }

        while (y == 0 || y == 9){
            y = Map.GenY();
        }

        Map.MapSet(y, x, 1);
        posY = y;
        posX = x;
    }

    public static void PlayerMoveSelect() throws CustomException, Exception {
        System.out.println("Available Moves:");
        System.out.println(Moves.LEFT);
        System.out.println(Moves.RIGHT);
        System.out.println(Moves.DOWN);
        System.out.println(Moves.UP);
        String move = sc.nextLine();
        switch (move){
            case "Up" -> PlayerMove("Up");
            case "Left" -> PlayerMove("Left");
            case "Down" -> PlayerMove("Down");
            case "Right" -> PlayerMove("Right");
            default -> throw new Exception("Špatná cesta");
        }
    }

    public static void PlayerMove(String choice) throws CustomException {
        Map.MapSet(posY, posX, 2);
        if (choice.equals("Up")){
            posY = posY - 1;
        }else if (choice.equals("Left")){
            posX = posX - 1;
        }else if (choice.equals("Down")){
            posY = posY + 1;
        }else if (choice.equals("Right")){
            posX = posX + 1;
        }
        Map.MapSet(posY, posX, 1);
        Map.MapPrint();
    }
}