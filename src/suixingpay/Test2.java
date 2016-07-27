
package suixingpay;

import java.io.File;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Test2 {
	
	//ģ�����ö���
	private Configuration con ;
	
	//��ʼ��һ��Configurationʵ��
	public void init() throws Exception{
		
		//����һ��Configurationʵ��
		con = new Configuration();
		//����FreeMarker��ģ�����ڵ��ļ���
		con.setDirectoryForTemplateLoading(new File("bean_template"));
		
		}
	
	
	public void process() throws Exception{
		
		//�������������ʹ�õ�Map
		Map map = new HashMap();
		
		map.put("username", "chiyajing");
		map.put("sex", "girl");
		map.put("age", "26");
		
		Template t = con.getTemplate("test2.ftl");
		t.process(map, new OutputStreamWriter(System.out));
		
	}
	
	public static void main(String[] args) throws Exception {
		Test2 t = new Test2();
		t.init();
		t.process();
	}
}
