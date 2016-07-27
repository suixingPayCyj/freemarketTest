
package suixingpay;

import java.io.File;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Test2 {
	
	//模板配置对象
	private Configuration con ;
	
	//初始化一个Configuration实例
	public void init() throws Exception{
		
		//创建一个Configuration实例
		con = new Configuration();
		//设置FreeMarker的模板所在的文件夹
		con.setDirectoryForTemplateLoading(new File("bean_template"));
		
		}
	
	
	public void process() throws Exception{
		
		//构造填充数据所使用的Map
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
