package ${packageName}
//@author ${author}

public class ${className}{
	<#list attrs as begin >
		private ${begin.type} ${begin.field} ;
	</#list>
}