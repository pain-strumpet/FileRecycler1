package com.soundspainful.filerecycler1;

public class FileObject {

    String fileName;
    String fileBody;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileBody() {
        return fileBody;
    }

    public void setFileBody(String fileBody) {
        this.fileBody = fileBody;
    }

    public FileObject(String fileName, String fileBody) {

        this.fileName = fileName;
        this.fileBody = fileBody;

    }

}
