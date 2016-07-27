package suixingpay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import modle.Attr;
import modle.Class;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Test3 {

	private static String TEMPLATE_NAME = "template.ftl";
	private Configuration con ;
	private Properties    ploader;
	/**
	 * 数据初始化
	 */
	public void init(){
		
		//初始化负责管理的实例
		try {
			
			con     = new Configuration();
			ploader = new Properties();
			
			con.setDirectoryForTemplateLoading( new File("bean_template"));
			ploader.load(new FileInputStream("D://workspace_suixingPay//freemarketTest//src//bean.properties"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	/**
	 * 加载类信息
	 */
	public Class loadClass(){
		String packageName = ploader.getProperty("packageName");
		String className   = ploader.getProperty("className");
		String values      = ploader.getProperty("imports");
		String [] imports  = values.split(",");
		Class clazz        = new Class(packageName,className,imports);
		
		return clazz;
	}
	
	/**
	 * 加载属性信息
	 */
	
	public List<Attr> loadAttr(){
		
		List<Attr> AttrList = new ArrayList<Attr>();
		
		String   values = ploader.getProperty("Attr");
		String[] Attrs  = values.split(",");
		
		for(String Attr : Attrs){
			String[] attr = Attr.split(":");
			AttrList.add(new Attr(attr[0],attr[1]));
		}
		
		return AttrList;
	}
	
	/**
	 * 在指定文件中进行输出
	 */
	
	public void write(Map<String , Object> map){
		
		try {
			
			Template temp = con.getTemplate(TEMPLATE_NAME);
			temp.process(map, new OutputStreamWriter(System.out));
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void process(){
		
		Class clazz = loadClass();
		List<Attr> attrs = loadAttr();
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("clazz", clazz);
		map.put("attrs", attrs);
		
		write(map);
	}
	
	
	public static void main(String[] args) {
		
		Test3 bbcm = new Test3();
		bbcm.init();
		bbcm.process();
		
	}
}
