import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {

    private Boolean[][] cells;

    public Grid(Integer rowNum, Integer columnNum) {
        Boolean[][] grid = new Boolean[rowNum][columnNum];
        for(int rowCount = 0; rowCount < rowNum; rowCount++) {
            for(int columnCount = 0; columnCount < columnNum; columnCount ++) {
                grid[rowCount][columnCount] = false;
            }
        }
        this.cells = grid;
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

    public void toggleCell(Integer rowCoordinate, Integer columnCoordinate){
        Boolean status = this.cells[rowCoordinate][columnCoordinate];
        if(status) {
            this.cells[rowCoordinate][columnCoordinate] = false;
        }
        else{
            this.cells[rowCoordinate][columnCoordinate] = true;
        }
    }

    public Boolean isCellFilled(Integer row, Integer column) {
        return this.cells[row][column];
    }


    public Cell.RelativeCellPosition getCellRelativePosition(Integer rowCoordinate, Integer columnCoordinate) {
        Boolean top;
        Boolean left;
        Boolean down;
        Boolean right;

        Cell topCell = new Cell(rowCoordinate - 1, columnCoordinate);
        Cell rightCell = new Cell(rowCoordinate, columnCoordinate + 1);
        Cell bottomCell = new Cell(rowCoordinate + 1, columnCoordinate);
        Cell leftCell = new Cell(rowCoordinate, columnCoordinate -1);

        if(topCell.getRowIndex() < 0) {
            top = false;
        }
        else {
            top = true;
        }

        if(rightCell.getColumnIndex() > this.cells[0].length - 1) {
            right = false;
        }
        else {
            right = true;
        }

        if(bottomCell.getRowIndex() > this.cells.length -1 ) {
            down = false;
        }
        else {
            down = true;
        }

        if(leftCell.getColumnIndex() < 0) {
            left = false;
        }
        else {
            left = true;
        }

        return new Cell.RelativeCellPosition(top, right, down, left);

    }
}
