import Model.Board;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Board board = new Board(3);
        board.placeQueen(board.getField(1,1));
        board.placeQueen(board.getField(3,2));
        System.out.println("Amount of destroyed fields: " + board.countDestroyed());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("run time in ms: " + elapsedTime);
    }
}
