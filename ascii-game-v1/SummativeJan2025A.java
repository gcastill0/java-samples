import java.io.*;

public class SummativeJan2025A {
    final static String SPACE = "[    ]";
    final static String ELLIE = "[ 👧 ]";
    final static String PLAYER = "[ 🧸 ]";
    final static String PLAYERELLIE = "[🧸👧]";
    final static String PATH = "[ X ]";
    final static String ZOMBIE1 = "[ 💀 ]";
    final static String ZOMBIE2 = "[ 💀️ ]";
    final static String ZOMBIE3 = "[ 💀 ]";

    public static void main(String[] args) throws IOException {
        int i = 0;
        int j = 0;
        String array[][] = new String[10][10];
        String name;
        SummativeJan2025A sJ = new SummativeJan2025A();
        name = sJ.name();
        System.out.println(name + ", welcome to the game: The Last of Us!");
        System.out.println("Your target is to find Ellie " + ELLIE
                + ", who is lost and needs your help to escape the zombies! \nUsing controls 1234, find Ellie and bring her back to safety while avoiding the zombies trying to eat you!");
        System.out.println(
                "Bring Ellie back to safety as fast as you can, or else you'll be too late to save her.\nEarn points by getting closer to her, but be warned, you can lose points by getting further away or being caught by zombies!\n");
        System.out.println(name + ", this is you: " + PLAYER + ". \nAre you ready? Starting game in... \n3\n2\n1\n");
        array = sJ.grid();
        i = sJ.randomI();
        j = sJ.randomJ();
        array[i][j] = ELLIE;
        System.out.println("  ^___ you are here");
        System.out.println("Ellie is somewhere in this grid. Find her as quickly as possible!");
        int counter = 0;
        while (true) {
            array = sJ.control(array, i, j, name, counter);
            if (array[9][0] == PLAYERELLIE) {
                break;
            }
            counter++;
        }
    }

    public String name() throws IOException {// takes the user's name
        String name;
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        return name;
    }

    public int randomI() {// creates random locations for the npcs
        int i = (int) Math.round(Math.random() * 9);
        return i;
    }

    public int randomJ() {// creates random locations for the npcs
        int j = (int) Math.round(Math.random() * 9);
        return j;
    }

    public String[][] grid() {
        SummativeJan2025A sJ = new SummativeJan2025A();
        int i;
        int j;
        String array[][] = new String[10][10];
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                array[a][b] = SPACE;
            }
        }
        array[9][0] = PLAYER;
        for (int a = 0; a < 3; a++) {
            while (true) {
                i = sJ.randomI();
                j = sJ.randomJ();
                if (array[i][j] == SPACE) {
                    if (a == 0) {
                        array[i][j] = ZOMBIE1;
                        break;
                    } else if (a == 1) {
                        array[i][j] = ZOMBIE2;
                        break;
                    } else {
                        array[i][j] = ZOMBIE3;
                        break;
                    }
                }
            }
        }
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(array[a][b]);
            }
            System.out.println();
        }
        return array;
    }

    public String[][] ellie(String array[][]) {
        int i;
        int j;
        SummativeJan2025A sJ = new SummativeJan2025A();
        String character = ELLIE;
        sJ.npcMovement(array, character);
        return array;
    }

    public String[][] zombie1(String array[][]) {// need to make it so there are 3 zombies
        SummativeJan2025A sJ = new SummativeJan2025A();
        String character = ZOMBIE1;
        sJ.npcMovement(array, character);
        return array;
    }

    public String[][] zombie2(String array[][]) {// need to make it so there are 3 zombies
        SummativeJan2025A sJ = new SummativeJan2025A();
        String character = ZOMBIE2;
        sJ.npcMovement(array, character);
        return array;
    }

    public String[][] zombie3(String array[][]) {// need to make it so there are 3 zombies
        SummativeJan2025A sJ = new SummativeJan2025A();
        String character = ZOMBIE3;
        sJ.npcMovement(array, character);
        return array;
    }

    public String[][] control(String array[][], int elliex, int elliey, String name, int counter) throws IOException {
        System.out.println("You have moved: " + counter + " space(s)!");
        SummativeJan2025A sJ = new SummativeJan2025A();
        String character = sJ.player(elliex, elliey, array);
        sJ.zombie1(array);
        sJ.zombie2(array);
        sJ.zombie3(array);
        int i = 0;
        int j = 0;
        int movement = 0;
        sJ.directions(array);
        i = sJ.findingICoordinate(array, character);
        j = sJ.findingJCoordinate(array, character);
        array[i][j] = PATH;
        sJ.ellie(array);
        elliex = sJ.findingICoordinate(array, ELLIE);
        elliey = sJ.findingJCoordinate(array, ELLIE);
        // array[elliex][elliey] = SPACE;
        array = sJ.playerMovement(movement, i, j, array, character, name);
        character = sJ.player(elliex, elliey, array);
        i = sJ.findingICoordinate(array, character);
        j = sJ.findingJCoordinate(array, character);
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(array[a][b]);
            }
            System.out.println();
        }
        return array;
    }

    public String player(int elliex, int elliey, String array[][]) {
        SummativeJan2025A sJ = new SummativeJan2025A();
        boolean found = sJ.findingEllie(elliex, elliey, array);
        String character = "";
        if (found == false) {
            character = PLAYER;
        } else {
            character = PLAYERELLIE;
        }
        return character;
    }

    public int findingICoordinate(String array[][], String character) {
        int i = 0;
        for (int a = 9; a >= 0; a--) {
            for (int b = 9; b >= 0; b--) {
                if (array[a][b] == character) {
                    i = a;
                }
            }
        }
        return i;
    }

    public int findingJCoordinate(String array[][], String character) {
        int j = 0;
        for (int a = 9; a >= 0; a--) {
            for (int b = 9; b >= 0; b--) {
                if (array[a][b] == character) {
                    j = b;
                }
            }
        }
        return j;
    }

    public String[][] playerMovement(int movement, int i, int j, String array[][], String character, String name)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Where would you like to move, " + name + "?");
            System.out.println(
                    "Use key '1' to move up, key '2' to move down, key '3' to move left, and key '4' to move right.");
            movement = Integer.parseInt(br.readLine());
            if (movement == 1) {
                i -= 1;
            } else if (movement == 2) {
                i += 1;
            } else if (movement == 3) {
                j -= 1;
            } else if (movement == 4) {
                j += 1;
            } else {
                System.out.println("That is not an option. You entered " + movement + ". Please try again.");
            }
            if (array[i][j] == PATH) {
                System.out.println(
                        "That is not possible as you cannot go where you have previously gone. Please try again.");
            }
            array[i][j] = character;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That is not possible as you will leave the grid. Please select another move.");
            if (movement == 1) {
                i += 1;
            } else if (movement == 2) {
                i -= 1;
            } else if (movement == 3) {
                j += 1;
            } else if (movement == 4) {
                j -= 1;
            }
            array[i][j] = character;
        } catch (NumberFormatException e) {
            System.out.println("That is not an option. Please enter non-numeric input");
            array[i][j] = character;
        }
        return array;
    }

    public String[][] npcMovement(String array[][], String character) {
        SummativeJan2025A sJ = new SummativeJan2025A();
        int a = (int) Math.round(Math.random() * 3) + 1;// direction it can move
        int i = sJ.findingICoordinate(array, character);
        int j = sJ.findingJCoordinate(array, character);
        array[i][j] = SPACE;
        if (a == 1) {
            if (j != 0) {
                j--;
                // System.out.println("You can go left!");
            }
        } else if (a == 2) {
            if (j != 9) {
                j++;
                // System.out.println("You can go right!");
            }
        } else if (a == 3) {
            if (i != 0) {
                i--;
                // System.out.println("You can go up!");
            }
        }
        if (a == 4) {
            if (i != 9) {
                i++;
                // System.out.println("You can go down!");
            }
        }
        array[i][j] = character;
        return array;
    }

    public boolean findingEllie(int elliex, int elliey, String array[][]) {// checks each turn if the user has reached
                                                                           // ellie, and if so, changes the character so
                                                                           // the user has ellie with them
        SummativeJan2025A sJ = new SummativeJan2025A();
        boolean character = false;
        int i = sJ.findingICoordinate(array, PLAYER);
        int j = sJ.findingJCoordinate(array, PLAYER);
        if (i == elliex && j == elliey) {
            System.out.println("You have found Ellie! Make your way to the exit, quick! Avoid the zombies!");
            array[i][j] = PLAYERELLIE;
            character = true;
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    if (array[a][b] == PATH) {
                        array[a][b] = SPACE;
                    }
                }
            }
        }
        return character;
    }

    public void directions(String array[][]) {// tells the user where they can go based off of their location in the
                                              // grid
        SummativeJan2025A sJ = new SummativeJan2025A();
        int i = 0;
        int j = 0;
        i = sJ.findingICoordinate(array, PLAYER);
        j = sJ.findingJCoordinate(array, PLAYER);
        if (j != 0) {
            System.out.println("You can go left!");
        }
        if (j != 9) {
            System.out.println("You can go right!");
        }
        if (i != 0) {
            System.out.println("You can go up!");
        }
        if (i != 9) {
            System.out.println("You can go down!");
        }
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}