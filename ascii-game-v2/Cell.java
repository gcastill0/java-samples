public class Cell {
    int index;
    int row, col;
    boolean state;
    Player player;
    
    public Cell(int _index) {
        this.index = _index;    
        this.row   = this.getRow();
        this.col   = this.getCol();

        this.player = null;
        this.state = Globals.FREE;
    }

    public void resetCell() {
        this.player = null;
        this.state = Globals.FREE;        
    }

    public int getRow() {
        return (int) Math.round(this.index / Globals.ARRAY_SIZE);
    }

    public int getCol() {
        return (int) Math.round(this.index % Globals.ARRAY_SIZE);
    }

    public boolean checkNewPosition(int[][] grid) {
        return false;
    }

    public void addPlayer(Player _player) {
        this.player = _player;
        this.state  = Globals.BUSY;
    }

    public void clearPlayer() {
        this.player = null;
        this.state  = Globals.FREE;
    }    

    public void display() {
        if (this.state == Globals.FREE) {
            System.out.print(Globals.SPACE);
            return;
        }

        System.out.print(this.player.name);
    }
}
