package test

class ExcelService {

    static transactional = true

    def test() {
        log.debug  'Starting test'
        String fileName = './files/test.xls'
        test.BookExcelImporter importer = new test.BookExcelImporter(fileName);
        def booksMapList = importer.getBooks();

        booksMapList.each { Map bookParams ->
            log.debug "$bookParams.title - $bookParams.author - $bookParams.numSold - $bookParams.value"
        }
    }

    def process(filename) {
        def importer = new test.BookExcelImporter(filename);
        def booksMapList = importer.getBooks();

        booksMapList.each { Map bookParams ->
            log.debug "$bookParams.title - $bookParams.author - $bookParams.numSold - $bookParams.value"
        }
    }
}
