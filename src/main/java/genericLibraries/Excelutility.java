package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	private Workbook wb;
	/**
	 * this method is used to initialize excel
	 * @param excelPath
	 * @throws IOException 
	 */
	public void excelInitialization(String excelPath) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelPath);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
			
		}
	}

}

/**
*This method is used to read data from excel
*@param sheetName
*@param expectedTest
@return
*/
