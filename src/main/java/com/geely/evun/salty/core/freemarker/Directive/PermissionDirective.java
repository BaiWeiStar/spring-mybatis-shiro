package com.geely.evun.salty.core.freemarker.Directive;
import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

import java.io.IOException;
import java.util.Map;

/**
 * 后台管理员权限许可
 */
public class PermissionDirective implements TemplateDirectiveModel {

    /***
     * 权限验证
     */
    @Override
    @SuppressWarnings("unchecked")
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, 	IOException {
        //TODO
    }

}