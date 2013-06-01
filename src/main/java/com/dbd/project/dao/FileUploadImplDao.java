package com.dbd.project.dao;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.stereotype.Service;

import com.dbd.project.model.FileUpload;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSFile;

@Service
public class FileUploadImplDao implements FileUploadDao {
	@Autowired
	private GridFsOperations gridOperation;
	@Autowired
	private MongoTemplate mongoTemplate;
	public static final String COLLECTION_NAME = "fs.files";

	@Override
	public String save(InputStream inputStream, String contentType,
			String filename) {
		DBObject metaData = new BasicDBObject();
		metaData.put("meta1", filename);
		metaData.put("meta2", contentType);

		GridFSFile file = gridOperation.store(inputStream, filename, metaData);

		return file.getId().toString();
	}


	public void deleteFile(FileUpload file) {
		Query query = new Query();
		query.addCriteria(Criteria.where("filename").is(file.getFile().getOriginalFilename()));
		gridOperation.delete(query);
	}

	public GridFSDBFile find(String name){
		Query query = new Query();
		query.addCriteria(Criteria.where("filename").is(name));
        GridFSDBFile output = (GridFSDBFile) gridOperation.findOne(query);
        return output;
	}
}
