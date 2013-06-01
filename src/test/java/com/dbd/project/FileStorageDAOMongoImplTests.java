package com.dbd.project;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dbd.project.dao.FileUploadDao;
import com.dbd.project.dao.FileUploadImplDao;
import com.mongodb.gridfs.GridFSDBFile;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class FileStorageDAOMongoImplTests {
 
 @Autowired
 private FileUploadDao fileStorageDAOMongoImpl;
 @Autowired 
 private GridFsTemplate template;
 
 @Test
 public void testIfItSavesFileToGridFs() throws FileNotFoundException
 {
  
  InputStream inputStream = new FileInputStream("G:\\test.txt");
  String id = fileStorageDAOMongoImpl.save(inputStream, "bla", "bla");
  System.out.println("New File ID: " + id);
                assertNotNull(id);
  
 }
 
 @Test public void shouldListExistingFiles() {
	 List<GridFSDBFile> files = template.find(null);
 
	 for (GridFSDBFile file: files) {
		 System.out.println(file);
	 }
 }
 
 }
