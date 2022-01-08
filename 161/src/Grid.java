import java.util.Arrays;

public class Grid {

    private Boolean[][] cells;

    public Grid() {
    }

    public Boolean[][] getCells() {
        return cells;
    }

    public Integer rows() {
        return cells.length;
    }

    public Integer columns() {
        return  cells[0].length;
    }

    public void toggleCell(Integer xCoordinate, Integer yCoordinate){
        Boolean status = this.cells[xCoordinate][yCoordinate];
        if(status) {
            this.cells[xCoordinate][yCoordinate] = false;
        }
        else{
            this.cells[xCoordinate][yCoordinate] = true;
        }
    }


    public void initializeGrid(Integer rowNum, Integer columnNum){
        Boolean[][] grid = new Boolean[rowNum][columnNum];
        for(int rowCount = 0; rowCount < rowNum; rowCount++) {
            for(int columnCount = 0; columnCount < columnNum; columnCount ++) {
                grid[rowCount][columnCount] = false;
            }
        }
        this.cells = grid;
    }
}
