package suixingpay;

import java.io.IOException;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class UpperFirstCharacter implements TemplateDirectiveModel {

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		// TODO Auto-generated method stub
		
		if(!params.isEmpty()){
			throw new  TemplateModelException("参数 Map params为空");
		}
		
		if(loopVars.length==0){
			throw new  TemplateModelException("参数 loopVars为空");
		}

	}

}
