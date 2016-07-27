package suixingpay;

import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Template;

public class Test1 {
	public static void main(String [] args) throws Exception{
		
		Template t = new Template(null,new StringReader(" 这里是模版的内容(姓名:${username} 性别:${sex} 年龄:${age})"),null);
		
		Map map = new HashMap();
		map.put("username", "cyj");
		map.put("sex", "female");
		map.put("age", "26");
		
		t.process(map, new OutputStreamWriter(System.out));
	}
}
