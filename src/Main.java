import Model.Board;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(8);
        System.out.println(board.countDestroyed());
    }
}
