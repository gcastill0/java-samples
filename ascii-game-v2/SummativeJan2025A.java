import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SummativeJan2025A {
    public static Player[] players = {
            new Player(Globals.HUMAN, Globals.PLAYER_HUMAN),
            new Player(Globals.ELLIE, Globals.PLAYER_ELLIE),
            new Player(Globals.ZOMBIE, Globals.PLAYER_ZOMBIE),
            new Player(Globals.ZOMBIE, Globals.PLAYER_ZOMBIE),
            new Player(Globals.ZOMBIE, Globals.PLAYER_ZOMBIE)
    };

    public static Cell[][] grid_cells;
    public static boolean PLAYER_ALIVE = true;
    public static boolean ELLIE_FOUND  = false;
    public static boolean ELLIE_ALIVE  = true;
    public static int HUMAN_SCORE = 0;
    public static int ZOMBE_SCORE = 0;

    public static void main(String[] args) throws IOException {

        grid_cells = new Cell[Globals.ARRAY_SIZE][Globals.ARRAY_SIZE];

        // Initialize Global Grid

        for (int row = 0; row < Globals.ARRAY_SIZE; row++) {
            for (int col = 0; col < Globals.ARRAY_SIZE; col++) {
                int index = row * Globals.ARRAY_SIZE + col;
                grid_cells[row][col] = new Cell(index);
            }
        }

        // Add Sprites

        for (Player player : players) {

            int row = player.getRow();
            int col = player.getCol();

            while (grid_cells[row][col].state == Globals.BUSY) {
                player.newRandomLocation();
                row = player.getRow();
                col = player.getCol();
            }

            grid_cells[row][col].player = player;
            grid_cells[row][col].state = Globals.BUSY;

            player.updateHistory();
        }

        // int i = 0;
        // int j = 0;
        // String array[][] = new String [Globals.ARRAY_SIZE][Globals.ARRAY_SIZE];
        clearScreen();

        String username = name();

        clearScreen();

        System.out.println(username + ", welcome to the game: The Last of Us!");
        System.out.println();
        System.out.println();

        System.out.println("Your target is to find Ellie " + Globals.ELLIE
                + ", who is lost and needs your help to escape the zombies! \nUsing controls 1234, find Ellie and bring her back to safety while avoiding the zombies trying to eat you!");
        System.out.println(
                "Bring Ellie back to safety as fast as you can, or else you'll be too late to save her.\nEarn points by getting closer to her, but be warned, you can lose points by getting further away or being caught by zombies!\n");
        System.out.println(
                username + ", this is you: " + Globals.HUMAN);

        System.out.println("\n\nEllie is somewhere in this grid. Find her as quickly as possible!");

        displayGrid();
        System.out.println("  ^___ you are here");

        System.out.println("Are you ready? Starting game in...\n");

        for (int sleeper = 10; sleeper > 0; sleeper--) {
            for (int dot = sleeper; dot > 0; dot--) {
                System.out.print(".");
            }
            System.out.print(" " + sleeper);
            System.out.println();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO: Make a better catch block
                e.printStackTrace();
            }
        }

        System.out.println("\n  ^___ you are here.\n");
        int counter = 0;
        int choice = -1;

        while (!ELLIE_FOUND && PLAYER_ALIVE) {

            clearScreen();
            System.out.println("");
            System.out.println("Player: " + username + "\tMoves:" + counter + "\t\tChoice:" + choice);
            System.out.println(username + ": " + HUMAN_SCORE + "\t\tZombies:" + ZOMBE_SCORE);
            System.out.println("");

            displayGrid();

            System.out.println("Where would you like to move?");
            System.out.println(
                    "Use the following:\n\n'1' to move UP\n'2' to move DOWN\n'3' to move LEFT\n'4' to move RIGHT\n");

            players[Globals.PLAYER_HUMAN_INDEX].displayOptions();

            choice = playerMovement(players[Globals.PLAYER_HUMAN_INDEX].getMoveOptions());

            humanMovement(players[Globals.PLAYER_HUMAN_INDEX], choice);

            if (!ELLIE_FOUND && ELLIE_ALIVE && PLAYER_ALIVE) {
                npcMovement(players[Globals.PLAYER_ZOMBIE1_INDEX]);
                npcMovement(players[Globals.PLAYER_ZOMBIE2_INDEX]);
                npcMovement(players[Globals.PLAYER_ZOMBIE3_INDEX]);
            } else {
                clearScreen();
                System.out.println("");
                System.out.println("Player: " + username + "\tMoves:" + counter + "\t\tChoice:" + choice);
                System.out.println(username + ": " + HUMAN_SCORE + "\t\tZombies:" + ZOMBE_SCORE);
                System.out.println("");

                displayGrid();

                if (continueGame()) {
                    for (Player player : players) {
                        player.resetPlayer();
                    }

                    for (int row = 0; row < Globals.ARRAY_SIZE; row++) {
                        for (int col = 0; col < Globals.ARRAY_SIZE; col++) {
                            grid_cells[row][col].resetCell();
                        }
                    }

                    PLAYER_ALIVE = true;
                    ELLIE_FOUND = false;
                    ELLIE_ALIVE = true;

                    // Add Sprites

                    for (Player player : players) {

                        int row = player.getRow();
                        int col = player.getCol();

                        while (grid_cells[row][col].state == Globals.BUSY) {
                            player.newRandomLocation();
                            row = player.getRow();
                            col = player.getCol();
                        }

                        grid_cells[row][col].player = player;
                        grid_cells[row][col].state = Globals.BUSY;

                        player.updateHistory();
                    }

                    players[Globals.PLAYER_HUMAN_INDEX].updateName(Globals.HUMAN);
                    players[Globals.PLAYER_ELLIE_INDEX].updateName(Globals.ELLIE);
                    players[Globals.PLAYER_ZOMBIE1_INDEX].updateName(Globals.ZOMBIE);
                    players[Globals.PLAYER_ZOMBIE2_INDEX].updateName(Globals.ZOMBIE);
                    players[Globals.PLAYER_ZOMBIE3_INDEX].updateName(Globals.ZOMBIE);
                }
            }

        }

    }

    public static void displayGrid() {
        // Display Grid

        for (int row = 0; row < Globals.ARRAY_SIZE; row++) {
            for (int col = 0; col < Globals.ARRAY_SIZE; col++) {
                grid_cells[row][col].display();
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String name() throws IOException {// takes the user's name
        String name;
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        return name;
    }

    public static boolean continueGame() throws IOException {// ask if user continues
        String answer;
        System.out.println();
        System.out.println("Do you want to play again? y/n, or YES/NO");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = br.readLine();

        if (answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no")) {
            return false;
        } else {
            if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
                return true;
            }
        }

        return true;
    }

    public static int playerMovement() throws IOException {

        int movement;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("Please type a number: ");
                movement = Integer.parseInt(br.readLine());

                if (movement == Globals.UP) {
                    break;
                } else if (movement == Globals.DOWN) {
                    System.out.println("DOWN");
                    break;
                } else if (movement == Globals.LEFT) {
                    System.out.println("LEFT");
                    break;
                } else if (movement == Globals.RIGHT) {
                    System.out.println("RIGHT");
                    break;
                } else {
                    System.out.println("That is not an option. You entered " + movement + ". Please try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("That is not possible as you will leave the grid. Please select another move.");
            }
        }

        return movement;
    }

    public static int playerMovement(ArrayList<Integer> options) throws IOException {

        int movement = -1;

        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Please type a number: ");
                movement = Integer.parseInt(br.readLine());

            } catch (NumberFormatException e) {
                System.out.println("That is not possible as you will leave the grid. Please select another move.");
            }

            if (options.contains(movement) == false) {
                System.out
                        .println("You cannot move in that direction. You entered " + movement + ". Please try again.");
            } else if (movement == Globals.UP || movement == Globals.DOWN || movement == Globals.LEFT
                    || movement == Globals.RIGHT) {
                break;
            } else {
                System.out.println("That is not an option. You entered " + movement + ". Please try again.");
            }

        }

        return movement;
    }

    public static void humanMovement(Player humanPlayer, int movement) {

        ArrayList<Integer> options = humanPlayer.getMoveOptions();
        if (options.contains(movement) == false)
            return;

        int row = humanPlayer.getRow();
        int col = humanPlayer.getCol();
        int next_row = humanPlayer.getRow();
        int next_col = humanPlayer.getCol();

        if (movement == Globals.UP)
            next_row--;
        if (movement == Globals.DOWN)
            next_row++;
        if (movement == Globals.LEFT)
            next_col--;
        if (movement == Globals.RIGHT)
            next_col++;

        if (next_row < 0 || next_row > (Globals.ARRAY_SIZE - 1) ||
                next_col < 0 || next_col > (Globals.ARRAY_SIZE - 1))
            return;

        if (grid_cells[next_row][next_col].state == Globals.BUSY
                && grid_cells[next_row][next_col].player.type == Globals.PLAYER_ZOMBIE) {
            humanPlayer.updateName(Globals.PLAYERZOMBE);
            PLAYER_ALIVE = false;
            ZOMBE_SCORE++;
        } else if (grid_cells[next_row][next_col].state == Globals.BUSY
                && grid_cells[next_row][next_col].player.type == Globals.PLAYER_ELLIE) {
            humanPlayer.updateName(Globals.PLAYERELLIE);
            ELLIE_FOUND = true;
            HUMAN_SCORE++;
        }

        grid_cells[row][col].clearPlayer();
        humanPlayer.updateLocation(next_row, next_col);
        grid_cells[next_row][next_col].addPlayer(humanPlayer);

    }

    public static void npcMovement(Player npcPlayer) {

        ArrayList<Integer> options = npcPlayer.getMoveOptions();
        int row = npcPlayer.getRow();
        int col = npcPlayer.getCol();
        int next_row = npcPlayer.getRow();
        int next_col = npcPlayer.getCol();

        int movement = (int) (Math.random() * options.size());

        if (movement == Globals.UP)
            next_row--;
        if (movement == Globals.DOWN)
            next_row++;
        if (movement == Globals.LEFT)
            next_col--;
        if (movement == Globals.RIGHT)
            next_col++;

        if (next_row < 0 || next_row > (Globals.ARRAY_SIZE - 1) || next_col < 0 || next_col > (Globals.ARRAY_SIZE - 1))
            return;

        if (grid_cells[next_row][next_col].state == Globals.BUSY && grid_cells[next_row][next_col].player.type == Globals.PLAYER_ZOMBIE)
            return;

        if (grid_cells[next_row][next_col].state == Globals.BUSY && grid_cells[next_row][next_col].player.type == Globals.PLAYER_ELLIE) {
            ELLIE_ALIVE = false;
            ZOMBE_SCORE++;
            players[Globals.PLAYER_ELLIE_INDEX].updateName(Globals.ELLIEZOMBIE);
            npcPlayer.updateName(Globals.ELLIEZOMBIE);
        }

        grid_cells[row][col].clearPlayer();
        npcPlayer.updateLocation(next_row, next_col);

        grid_cells[next_row][next_col].addPlayer(npcPlayer);

        return;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}