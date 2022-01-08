import java.util.List;

public class Execute {

    public static void main(String[] args){
        Grid grid = new Grid(9, 2);
        TriominoSolver solver = new TriominoSolver();
        solver.solve(grid);
        List<Grid> subGrids = solver.extractSubGrids(grid);
        System.out.println(subGrids.size());
        System.out.println(subGrids.get(0).rows());
        System.out.println(subGrids.get(0).columns());

        Grid filledGrid = solver.fillSubGrids(subGrids.get(0));
//        System.out.println(filledGrid.isCellFilled(0,0));
    }
}
