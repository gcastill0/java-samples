import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX example: draws an 8x8 board and prints tile context (row/col + A1..H8)
 * when the user clicks a tile.
 */
public class Board extends Application {

    private static final int SIZE = 8;
    private static final int CELL = 60;

    private final Label status = new Label("Click a tile...");

    @Override
    public void start(Stage stage) {
        GridPane board = buildBoard();

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        root.setCenter(board);
        root.setBottom(status);
        BorderPane.setMargin(status, new Insets(10, 0, 0, 0));

        Scene scene = new Scene(root);
        stage.setTitle("Connect 6");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private GridPane buildBoard() {
        GridPane grid = new GridPane();
        grid.setHgap(0);
        grid.setVgap(0);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {

                Color fill = ((row + col) % 2 == 0) ? Color.BEIGE : Color.SADDLEBROWN;

                Rectangle square = new Rectangle(CELL, CELL);
                square.setFill(fill);
                square.setStroke(Color.BLACK);

                StackPane cell = new StackPane(square);

                // Store board position on the cell
                cell.setUserData(new int[]{row, col});

                // Handle click: get context back from the cell
                cell.setOnMouseClicked(e -> {
                    int[] pos = (int[]) cell.getUserData();
                    int r = pos[0];
                    int c = pos[1];
                    String label = toLabel(r, c);

                    status.setText("Clicked: row=" + r + ", col=" + c + " (" + label + ")");
                    System.out.println("Clicked: row=" + r + ", col=" + c + " (" + label + ")");
                });

                grid.add(cell, col, row);
            }
        }

        return grid;
    }

    /**
     * Converts (row, col) to chess-style label:
     * bottom-left is A1, top-right is H8.
     *
     * JavaFX GridPane row 0 is top, so rank is (8 - row).
     */
    private String toLabel(int row, int col) {
        char file = (char) ('A' + col); // A..H
        int rank = SIZE - row;          // 8..1
        return "" + file + rank;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
