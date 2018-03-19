package interceptor;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorPower implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	// �ֵ���֮ǰ������action������֮��
	// ����� ���弴�� ����չ�Կ�ά���Ժ�ǿ
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		String str = "";// ���ܴ�action�������ַ���
		String role = "";// ��ɫ
		
		// ��session��ȡ�ý�ɫ
		role = (String) ServletActionContext.getRequest().getSession().getAttribute("role");

		//�ж��Ƿ��ǺϷ��û�
		if (role != null && !role.equals("")) {
			//�������С�����ǹ���Ա������������
			if(role.equals("zzm")) {
				//����action
				str = arg0.invoke();
			}else {
				System.out.println("�㲻�ǹ���Ա��Ϲ����");
				//�ǵ���struts.xml������powerfail��result
				str = "powerfail";
			}
		}else {
			System.out.println("���¼��");
			//�ǵ���struts.xml������loginfail��result
			str = "loginfail";
		}

		return str;
	}

}
