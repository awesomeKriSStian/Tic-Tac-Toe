public class Main {

    private static char [][] grid = {
            {'X', 'O', 'X'},
            {'X', 'O', 'X'},
            {'X', 'O', 'X'},
    };

    public static void main(String[] args) {
        wyswietlGrid();
    }

    private static void wyswietlGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
