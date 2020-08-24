package ${basePackage}.admin.controller;
import ${basePackage}.demo.web.core.utils.OutUtil;
import ${basePackage}.demo.web.core.view.Result;
import ${basePackage}.data.${packageName}.model.${modelNameUpperCamel};
import ${basePackage}.service.${packageName}.${modelNameUpperCamel}Service;
import ${basePackage}.data.query.PageQuery;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {

    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping("/add")
    public Result add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return OutUtil.success(null);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        ${modelNameLowerCamel}Service.deleteByPrimaryKey(id);
        return OutUtil.success(null);
    }

    @PostMapping("/update")
    public Result update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.updateByPrimaryKey(${modelNameLowerCamel});
        return OutUtil.success(null);
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
         return OutUtil.success(${modelNameLowerCamel});
    }

    @PostMapping("/list")
    public Result list(PageQuery query) {
       PageInfo<${modelNameUpperCamel}> pageInfo = aaService.find(query);
       return OutUtil.success(pageInfo);
    }
}
