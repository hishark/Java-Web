package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/*
 * ��������Ҫ���� 
 * Ĭ�ϵ���Щ��������������struts-default.xml�� 
 * �Զ���������Ҫȥstruts.xml�ж���
 */
public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation action) throws Exception {
		// TODO Auto-generated method stub
		String str = "";

		// ִ��action֮ǰ
		System.out.println("before action...");

		/*
		 * ����action ����action ��ʱϵͳ���̽���action action��execute�������ص��ַ������������str
		 */
		str = action.invoke();

		// ִ��action֮��
		System.out.println("after action...");

		// str���ص�struts.xml�и���action��result����ƥ��
		return str;
	}

}
