package ex4;
import ex3.Factory;
import ex3.Result;
import ex4.Table;

public class TableFactory extends Factory {
    private String tableHeader;
    private String rowFormat;

    public TableFactory(String tableHeader, String rowFormat) {
        this.tableHeader = tableHeader;
        this.rowFormat = rowFormat;
    }

    @Override
    public Result createDisplayer() {
        return new Table(tableHeader, rowFormat);
    }
}