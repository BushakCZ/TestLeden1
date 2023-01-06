public class Game {
    private Map map;


    public void start() throws CustomException, Exception {
        map = new Map();
        PlayerHandler.PlayerSpawn();
        Map.MapPrint();
        gameLoop();

    }

    public void gameLoop() throws CustomException, Exception {
        while (true){
            PlayerHandler.PlayerMoveSelect();
        }
    }

}