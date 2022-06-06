import core.data.*;
import java.util.*;

public class test{
    public static void main(String[] args){
        DataSource ds = DataSource.connect(VCTmastersv1.csv);
        ds.load();
        ds.printUsageString();
    }
}