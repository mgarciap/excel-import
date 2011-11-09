package test

class FileUploadController {

    def excelService

    def index = { }

    def upload = {
        def f = request.getFile('theFile')
        log.debug "Original Filename: $f.originalFilename"
        log.debug "Input Name: $f.name"
        log.debug "Storage Description: $f.storageDescription"

        if(!f.empty) {
            def file = new File("/tmp/$f.originalFilename")
            f.transferTo(file)
            log.debug "Sending to process '$file.absolutePath'"
            excelService.process(file.absolutePath)
            response.sendError(200,'Done');
        }
        else {
            flash.message = 'file cannot be empty'
            render(view:'uploadForm')
        }
    }
}
