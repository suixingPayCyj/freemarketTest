package modle;

/**
 * 封装属性信息
 * @author pc
 *
 */
public class Attr {

	public String field ;
	
	public String type ;
	
	public Attr(String field ,String type){
		this.field = field;
		this.type = type;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
