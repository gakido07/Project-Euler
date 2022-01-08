public enum TriominoForms {
    FIRST(1,-1, "left"), SECOND(-1, -1, "left"), THIRD(1,1, "right"), FOURTH(-1, 1, "left"), FIFTH(0, 2, "left"), SIXTH(2, 0, "left");

    private Integer xAxis;
    private Integer yAxis;
    private String startPositon;

    private TriominoForms(Integer xAxis, Integer yAxis, String startPositon ) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.startPositon = startPositon;
    }

    public Integer getXAxis() {
        return xAxis;
    }

    public Integer getYAxis() {
        return yAxis;
    }

    public String getStartPositon() {
        return startPositon;
    }
}
