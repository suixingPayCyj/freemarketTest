package suixingpay;

import java.io.File;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modle.Attr;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class Test4 {
	public static void main(String[] args) throws Exception {
		
		//定义bean类应该有的属性
		List<Object> attrList = new ArrayList<Object>();
		
		attrList.add(new Attr("userName","String"));
		attrList.add(new Attr("password","String"));
		attrList.add(new Attr("age","int"));
		attrList.add(new Attr("hobby","String"));
		
		//定义插入值的Map
		Map<String , Object> map = new HashMap<String , Object>();
		
		map.put("packageName", "modle.student");
		map.put("author", "adams");
		map.put("attrs", attrList);
		map.put("className", "Student");
		
		
		Configuration con = new Configuration();
		
		//设置FreeMarker的模板所在的文件夹
		con.setDirectoryForTemplateLoading(new File("bean_template"));
		Template template = con.getTemplate("/test4.ftl");
		StringWriter out = new StringWriter();
        template.process(map, out);
        
        System.out.println(out.toString());
        
        
	}
}
