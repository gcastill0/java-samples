import java.util.ArrayList;

public class Player {
    String name;
    int type;
    ArrayList<Integer> history = new ArrayList<>();
    int row, col;

    public Player(String _name) {
        this.name = _name;
        this.type = Globals.PLAYER_ZOMBIE; // default type
        this.row = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
        this.col = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
    }

    public Player(String _name, int _type) {
        this.name = _name;
        this.type = _type; // assigned type

        if (_type == Globals.PLAYER_HUMAN) {
            this.row = Globals.ARRAY_SIZE -1;
            this.col = 0;
        } else {
            this.row = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
            this.col = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));    
        }
    }

    public void resetPlayer() {

        if (this.type == Globals.PLAYER_HUMAN) {
            this.row = Globals.ARRAY_SIZE -1;
            this.col = 0;
        } else {
            this.row = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
            this.col = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));    
        }

        this.history.clear();

    }

    public void newRandomLocation() {
        this.row = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
        this.col = (int) Math.round(Math.random() * (Globals.ARRAY_SIZE -1));
    }

    public void updateLocation(int _row, int _col) {
        this.row = _row;
        this.col = _col;
    }

    public void updateName(String _name) {
        this.name = _name;
    }

    public ArrayList<Integer> getMoveOptions() {
        ArrayList<Integer> options = new ArrayList<>();

        if ( this.row > 0 ) options.add(Globals.UP);                          // UP
        if ( this.row < (Globals.ARRAY_SIZE -1) ) options.add(Globals.DOWN);    // DOWN
        if ( this.col > 0 ) options.add(Globals.LEFT);                          // LEFT
        if ( this.col < (Globals.ARRAY_SIZE -1) ) options.add(Globals.RIGHT);    // RIGHT

        return options;
    }

    public void displayOptions() {
        ArrayList<Integer> options = getMoveOptions();

        System.out.print("Options: ");

        for (int option: options) {
            if (option == Globals.UP) {
                System.out.print("UP ");
            } else if (option == Globals.DOWN) {
                System.out.print("DOWN ");
            } else if (option == Globals.LEFT) {
                System.out.print("LEFT ");
            } else if (option == Globals.RIGHT) {
                System.out.print("RIGHT ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public void updateHistory() {
        int index = this.row * Globals.ARRAY_SIZE + this.col;
        this.history.add(index);
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

}
