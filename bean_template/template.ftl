
package ${clazz.packageName};

<#list clazz.imports as begin>
import ${begin};
</#list>

public class ${clazz.className}{
	
	<#list attrs as begin >
		private ${begin.type} ${begin.field} ;
	</#list>
	
	<#list attrs as begin >
		public void set${begin.field?cap_first} (${begin.type} ${begin.field}){
			this.${begin.field}  =  ${begin.field};
			}
			
		public 	${begin.type} get${begin.field?cap_first}(){
				return this.${begin.field};
		}
	</#list>

	
}