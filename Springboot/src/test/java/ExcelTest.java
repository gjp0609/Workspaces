import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author guojinpeng
 * @date 17.11.24 11:36
 */
public class ExcelTest {
    public static void main(String[] args) throws Exception {
        getLastLine();
    }

    public static void getLastLine() throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("c:/Files/Data/test.xls")));
        HSSFSheet sheet = workbook.getSheetAt(0);
        System.out.println(sheet.getLastRowNum());
        for (Row cells : sheet) {
            System.out.print(isEmptyLine(cells) + "  ");
            for (Cell cell : cells) {
                System.out.print(cell + "     ");
            }
            System.out.println();
        }
        sheet.getRow(0);
    }

    private static boolean isEmptyLine(Row row) {
        for (Cell cell : row) {
            CellType type = cell.getCellTypeEnum();
            if (!CellType.BLANK.equals(type)) return true;
        }
        return false;
    }
}
