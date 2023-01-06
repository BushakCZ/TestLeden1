import java.util.Arrays;

public class Map {

    private static int[][] map = {
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
    };

    public int[][] getMap() {
        return map;
    }

    public static void MapPrint(){
        System.out.println("Map: ");
        for (int[] x : map)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }

    protected static void MapSet(int x, int y, int toSet) throws CustomException {
        if(map[x][y] == 2){
            throw new CustomException();
        }
        map[x][y] = toSet;
    }

    protected static int GenX(){
        int x = (int) Math.floor(Math.random()*9);
        return x;
    }

    protected static int GenY(){
        int y = (int) Math.floor(Math.random()*9);
        return y;
    }
}