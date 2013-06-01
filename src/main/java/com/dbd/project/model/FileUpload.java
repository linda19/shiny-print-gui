package com.dbd.project.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

/**
 * POJO encapsulating the uploaded file received in a multipart request.
 * 
 * @author anda
 * 
 */
public class FileUpload{

    private MultipartFile file;

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public MultipartFile getFile() {
        return file;
    }
}
