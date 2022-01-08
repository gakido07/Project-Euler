import java.util.ArrayList;
import java.util.List;

public class TriominoSolver {

    public void solve(Grid grid) {
        if((grid.rows() * grid.columns()) % 3 != 0) {
            System.out.println("Grid cannot be filled with Trinominoes");
        }
        else{
            System.out.println("grid Can be filled");
            grid.getCells();
        }
    }

    public List<Grid> extractSubGrids(Grid grid) {
        List<Grid> subGrids = new ArrayList<>();
        for(int rowCount = 0; rowCount < grid.rows(); rowCount++) {
            for(int columnCount = 0; columnCount < grid.columns(); columnCount ++) {
                if(((rowCount + 1) * (columnCount + 1) % 3 == 0) && (rowCount + 1 <= grid.rows()) && (columnCount + 1 <= grid.columns() )) {
                    Integer rows = rowCount + 1;
                    Integer columns = columnCount + 1;
                    Grid subGrid = new Grid(rows, columns);
                    subGrids.add(subGrid);
                }
            }
        }
        return subGrids;
    }

    public Grid fillSubGrids(Grid subGrid) {
        Boolean fillDirectionRight = false;
        Boolean fillDirectionLeft = false;
        TriominoForms[] triominoForms = TriominoForms.values();
//        for(TriominoForms tromino: triominoForms) {
//            Integer yAxis = tromino.getYAxis();
//            Integer xAxis = tromino.getXAxis();
//            String startPosition = tromino.getStartPositon();
//            for(int rowCount = 0; rowCount < subGrid.rows(); rowCount++){
//                Integer rowsFilled = 0;
//                for(int columnCount = 0; columnCount < subGrid.columns(); columnCount ++) {
//                        if(startPosition.equals("left") && xAxis == 1) {
//                            if(!subGrid.isCellFilled(rowCount, columnCount)) {
//                                subGrid.toggleCell(rowCount, columnCount);
//                                rowsFilled++;
//                            }
//                        }
////                        if()
//                }
//            }
//        }

        for(int rowCount = 0; rowCount < subGrid.rows(); rowCount++) {
            for(int columnCount = 0; columnCount < subGrid.columns(); columnCount ++) {
                subGrid.getCellRelativePosition(rowCount, columnCount);
                System.out.println(subGrid.getCellRelativePosition(rowCount, columnCount).toString());
            }
        }


        return subGrid;
    }
}
