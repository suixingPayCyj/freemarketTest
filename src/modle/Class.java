package modle;
/**
 * 
 * ��װ����Ϣ
 * @author pc
 *
 */
public class Class {
		//����
		private String   className;
		//����
		private String 	 packageName;
		//����İ�
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
