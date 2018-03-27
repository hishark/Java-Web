package jxnu.edu.cn.x3321.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubleSelect {
	List<Company> list=new ArrayList<Company>();
	Map<Integer,List<City>> map=new HashMap<Integer,List<City>>();
	public List<Company> getList() {
		/*
		 * 从数据库取数据
		 */
		Company com;
		com=new Company();
		com.setId(1);
		com.setName("三杨培训");
		list.add(com);
		
		com=new Company();
		com.setId(2);
		com.setName("三杨就业");
		list.add(com);
		
		com=new Company();
		com.setId(3);
		com.setName("三杨软件");
		list.add(com);
		
		return list;
	}
	public void setList(List<Company> list) {
		this.list = list;
	}
	public Map<Integer, List<City>> getMap() {
		
		City c;
		List<City> lc;
		
		lc=new ArrayList<City>();
		c=new City();
		c.setId(1);
		c.setName("南昌");
		lc.add(c);
		c=new City();
		c.setId(2);
		c.setName("长沙");
		lc.add(c);
		c=new City();
		c.setId(3);
		c.setName("武汉");
		lc.add(c);
		map.put(1, lc);
		
		lc=new ArrayList<City>();
		c=new City();
		c.setId(1);
		c.setName("北京");
		lc.add(c);
		c=new City();
		c.setId(2);
		c.setName("天津");
		lc.add(c);
		c=new City();
		c.setId(3);
		c.setName("石家庄");
		lc.add(c);
		map.put(2, lc);
		
		
		lc=new ArrayList<City>();
		c=new City();
		c.setId(1);
		c.setName("杭州");
		lc.add(c);
		c=new City();
		c.setId(2);
		c.setName("苏州");
		lc.add(c);
		c=new City();
		c.setId(3);
		c.setName("上海");
		lc.add(c);
		map.put(3, lc);
		
		return map;
	}
	public void setMap(Map<Integer, List<City>> map) {
		this.map = map;
	}

}
