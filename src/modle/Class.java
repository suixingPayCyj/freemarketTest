package modle;
/**
 * 
 * 封装类信息
 * @author pc
 *
 */
public class Class {
		//类名
		private String   className;
		//包名
		private String 	 packageName;
		//引入的包
		private String[] imports;
		
		
		public Class(){
			
			
		}
		
		public Class(String packageName ,String className ,String[] imports){
			this.packageName = packageName;
			this.className   = className;
			this.imports     = imports;
		}
		
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getPackageName() {
			return packageName;
		}
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}
		public String[] getImports() {
			return imports;
		}
		public void setImports(String[] imports) {
			this.imports = imports;
		}
		
		
}
