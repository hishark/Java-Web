package jxnu.edu.cn.x3321.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	//得到上传上来的File类型的对象
	File myFile;
	//文件名
	String fileName;
	/*
	 * 客户端太多了 文件上传需要重命名
	 * （异步锁来产生随机数 以随机数做名字emm 这里不用这个）
	 * 这里简化一下用时间来产生
	 */
	String newFileName;
	
	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getFileName() {
		return fileName;
	}

	/*
	 * 这个函数名一定要按照这个规范来写 才能得到file真实的文件名
	 */
	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}
	
	
	/*
	 * 控制层  要调用业务逻辑层了
	 * 业务逻辑层一定要单独写一个类 封装起来
	 * 老师偷懒就写在这里了
	 */
	public String fileUpload() {
		String str = "fileUploadSucc";
		newFileName = new Date().getTime()+getExtention(fileName);
		//函数得到webcontent的路径
		File newFile = new File(ServletActionContext.
								getServletContext().
								getRealPath("/fileUpload/"+newFileName));
		/*
		 * 把客户端myFile的内容拷贝到服务器的newFile里面去
		 */
		copy(myFile,newFile);
		return str;
	}

	/*
	 * 下面这些方法都应该单独放到一个类去啦 service serviceimp
	 */
	
	//从.后面截取字符串得到扩展名（包括.
	private String getExtention(String fileName) {
		// TODO Auto-generated method stub
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}
	
	/*
	 * 文件IO流
	 */
	private void copy(File myFile, File newFile)  {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		//BufferedInputStream可以设置一次读多少个字节 一次性读16k
		try {
			in = new BufferedInputStream(new FileInputStream(myFile),16*1024);
			out = new BufferedOutputStream(new FileOutputStream(newFile),16*1024);
			//一次性读这么多字节 拿个byte数组存一哈
			byte[] buffer = new byte[16*1024];
			//>0就还有数据。读到buffer里面去
			while(in.read(buffer)>0) {
				//把buffer写进out流
				out.write(buffer);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}
	
}
