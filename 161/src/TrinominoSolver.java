public class TrinominoSolver {

    public void solve(Grid grid) {
        if((grid.rows() * grid.columns()) % 3 != 0) {
            System.out.println("Grid cannot be filled with Trinominoes");
        }
        else{
            System.out.println("grid Can be filled");
        }
    }

    public void findSubGrids(Grid grid) {
        grid.getCells();
    }
}
