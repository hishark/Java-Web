package jxnu.edu.cn.x3321.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {

	String downloadFile;

	public String getDownloadFile() {
		return downloadFile;
	}

	public void setDownloadFile(String downloadFile) {
		this.downloadFile = downloadFile;
	}
	
	public String fileDownload() {
		String str ="succ";
		return str;
	}
	
	/*public InputStream getTargetFile() {
		return ServletActionContext
				.getServletContext()
				.getResourceAsStream("/fileUpload/"+this.downloadFile);
	}*/
	
	public InputStream getTargetFile(){
		System.out.println("aggggggg");
	
		return ServletActionContext.
				getServletContext().
				getResourceAsStream("/fileUpload/"+this.downloadFile);
	}
}
