package suixingpay;

import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Template;

public class Test1 {
	public static void main(String [] args) throws Exception{
		
		Template t = new Template(null,new StringReader(" ������ģ�������(����:${username} �Ա�:${sex} ����:${age})"),null);
		
		Map map = new HashMap();
		map.put("username", "cyj");
		map.put("sex", "female");
		map.put("age", "26");
		
		t.process(map, new OutputStreamWriter(System.out));
	}
}
