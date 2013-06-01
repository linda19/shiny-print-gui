package com.dbd.project.dao;

import java.io.InputStream;

import com.dbd.project.model.FileUpload;
import com.mongodb.gridfs.GridFSDBFile;

public interface FileUploadDao {

	public String save(InputStream inputStream, String contentType, String filename);
	public void deleteFile(FileUpload file);
	public GridFSDBFile find(String name);
}
