package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//��ѭ��bean�Ĺ淶
//Ϊÿ������������setget����
//���Էŵ�bean��
/*
 * һ��Ϊÿ������������setget�����������Ϳ���˵��һ��bean
 */
public class DoubleSelect {
	List<Company> list = new ArrayList<Company>();
	//�ұ���HashMap�ޣ���Mapû��
	Map<Integer,List<City>> map = new HashMap<Integer,List<City>>();
	public List<Company> getList() {
		/*
		 * �����ݿ���ȡ���ݣ����ﲻ�����ݿ�ȡ�� ���Լ�Ū������
		 */
		Company com;
		com = new Company();
		com.setId(1);
		com.setName("������ѵ");
		list.add(com);
		
		com = new Company();
		com.setId(2);
		com.setName("�����ҵ");
		list.add(com);
		
		com = new Company();
		com.setId(3);
		com.setName("�������");
		list.add(com);
		
		
		return list;
	}
	public void setList(List<Company> list) {
		this.list = list;
	}
	public Map<Integer, List<City>> getMap() {
		City c;
		List<City> lc;
		
		lc = new ArrayList<City>();
		c = new City();
		c.setId(1);
		c.setName("�ϲ�");
		lc.add(c);
		
		c = new City();
		c.setId(2);
		c.setName("��ɳ");
		lc.add(c);
		
		c = new City();
		c.setId(3);
		c.setName("�人");
		lc.add(c);
		
		map.put(1, lc);
		
		
		
		lc = new ArrayList<City>();
		c = new City();
		c.setId(1);
		c.setName("���");
		lc.add(c);
		
		c = new City();
		c.setId(2);
		c.setName("����");
		lc.add(c);
		
		c = new City();
		c.setId(3);
		c.setName("ʯ��ׯ");
		lc.add(c);
		
		map.put(2, lc);
		
		lc = new ArrayList<City>();
		c = new City();
		c.setId(1);
		c.setName("�Ϻ�");
		lc.add(c);
		
		c = new City();
		c.setId(2);
		c.setName("����");
		lc.add(c);
		
		c = new City();
		c.setId(3);
		c.setName("����");
		lc.add(c);
		
		map.put(3, lc);
		
		return map;
	}
	public void setMap(Map<Integer, List<City>> map) {
		this.map = map;
	}
	
	
}
