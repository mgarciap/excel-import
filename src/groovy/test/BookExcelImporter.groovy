package test

import org.grails.plugins.excelimport.AbstractExcelImporter
import org.grails.plugins.excelimport.ExcelImportUtils

/**
 * Created by IntelliJ IDEA.
 * User: manu
 * Date: 11/1/11
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
class BookExcelImporter extends AbstractExcelImporter {

      static Map CONFIG_BOOK_COLUMN_MAP = [
              sheet:'Sheet1',
                 startRow: 1,
              columnMap:  [
                      'A':'title',
                      'B':'author',
                      'C':'numSold',
                      'D':'value'
              ]
      ]

      public BookExcelImporter(fileName) {
        super(fileName)
      }

      List<Map> getBooks() {
        List bookList = ExcelImportUtils.columns(workbook, CONFIG_BOOK_COLUMN_MAP)
      }
}
