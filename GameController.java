import java.util.Scanner;

public class GameController {
    private GenericTile[][] maze;

    public void playGame() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int mazeSize = 0;

        while (mazeSize <= 0 || mazeSize % 2 == 0) {
            System.out.println("Enter maze size (odd integer greater than 0): ");
            mazeSize = scanner.nextInt();
        }

        scanner.close();

        this.createMaze(mazeSize);
        this.printMazeSummary();
    }

    public boolean isDoorLocked(GenericTile tile, int doorNumber) {
        return true;
    }

    public void createMaze(int mazeSize) {
        this.maze = new GenericTile[mazeSize][mazeSize];

        for (int i = 0; i < mazeSize; i++) {
            for (int j = 0; j < mazeSize; j++) {
                this.maze[i][j] = new GenericTile();
                this.maze[i][j].setExits();
            }
        }
    }

    public void printMazeSummary() {
        int size = this.maze.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Tile (" + j + ", " + i + ") (N, E, S, W) status: (");

                for (int k = 0; k < 4; k++) {
                    System.out.print(this.maze[i][j].getExitStr(k));

                    if (k == 3) {
                        System.out.println(").");
                    } else {
                        System.out.print(", ");
                    }
                }

            }
        }

        System.out.println("There are " + size + " rows and columns in the maze.");
        System.out.println("Start is at (0, " + (size / 2) + ") and goal is at (" + (size - 1) + ", " + (size / 2) + ").");
    }
}
