public class Cell {
    private Integer rowIndex;
    private Integer columnIndex;

    public Cell(Integer rowIndex, Integer columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public Integer getColumnIndex() {
        return columnIndex;
    }

    public static class RelativeCellPosition {
        private Boolean top;
        private Boolean right;
        private Boolean down;
        private Boolean left;

        public RelativeCellPosition(Boolean top, Boolean right, Boolean down, Boolean left) {
            this.top = top;
            this.right = right;
            this.down = down;
            this.left = left;
        }

        @Override
        public String toString() {
            return top.toString() + " " + right.toString() + " " + down.toString() + " " + left.toString();
        }
    }
}
