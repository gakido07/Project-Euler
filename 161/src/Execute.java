public class Execute {

    public static void main(String[] args){
        Grid grid = new Grid();
        grid.initializeGrid(3, 3);

        TrinominoSolver solver = new TrinominoSolver();

        solver.solve(grid);
//        System.out.println(grid.getCells()[0]);
    }
}
