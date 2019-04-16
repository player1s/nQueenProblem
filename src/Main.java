import Model.Board;

public class Main {

    private static int level = 1;
    private static int solutions = 0;

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Board board = new Board(4);
        put(board);
        System.out.println("Amount of solutions: " + solutions);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("run time in ms: " + elapsedTime);
    }

    private static int put(Board board)
    {

        for (int i = 1; i <= board.getSize(); i++) {
            if(!board.getField(level, i).isDestroyed()) {
                board.placeQueen(board.getField(level, i));

                if(!(level == board.getSize())) {
                    level++;
                    put(board);
                }
            }
        }

        if(board.countOccupied() == board.getSize())
        {
            solutions++;
        }

        board.removeQueen(board.searchQueenOnLevel(level));

        level--;
        return 0;
    }
}
