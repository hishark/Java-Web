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
	//�õ��ϴ�������File���͵Ķ���
	File myFile;
	//�ļ���
	String fileName;
	/*
	 * �ͻ���̫���� �ļ��ϴ���Ҫ������
	 * ���첽������������� �������������emm ���ﲻ�������
	 * �����һ����ʱ��������
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
	 * ���������һ��Ҫ��������淶��д ���ܵõ�file��ʵ���ļ���
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
	 * ���Ʋ�  Ҫ����ҵ���߼�����
	 * ҵ���߼���һ��Ҫ����дһ���� ��װ����
	 * ��ʦ͵����д��������
	 */
	public String fileUpload() {
		String str = "fileUploadSucc";
		newFileName = new Date().getTime()+getExtention(fileName);
		//�����õ�webcontent��·��
		File newFile = new File(ServletActionContext.
								getServletContext().
								getRealPath("/fileUpload/"+newFileName));
		/*
		 * �ѿͻ���myFile�����ݿ�������������newFile����ȥ
		 */
		copy(myFile,newFile);
		return str;
	}

	/*
	 * ������Щ������Ӧ�õ����ŵ�һ����ȥ�� service serviceimp
	 */
	
	//��.�����ȡ�ַ����õ���չ��������.
	private String getExtention(String fileName) {
		// TODO Auto-generated method stub
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}
	
	/*
	 * �ļ�IO��
	 */
	private void copy(File myFile, File newFile)  {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		//BufferedInputStream��������һ�ζ����ٸ��ֽ� һ���Զ�16k
		try {
			in = new BufferedInputStream(new FileInputStream(myFile),16*1024);
			out = new BufferedOutputStream(new FileOutputStream(newFile),16*1024);
			//һ���Զ���ô���ֽ� �ø�byte�����һ��
			byte[] buffer = new byte[16*1024];
			//>0�ͻ������ݡ�����buffer����ȥ
			while(in.read(buffer)>0) {
				//��bufferд��out��
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
