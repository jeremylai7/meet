package com.jeremy.admin.controller;
import com.jeremy.meet.web.core.utils.OutUtil;
import com.jeremy.meet.web.core.view.Result;
import com.jeremy.data.meet.model.Meet;
import com.jeremy.service.meet.MeetService;
import com.jeremy.data.query.PageQuery;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/** 会议室表
* Created by Jeremy on 2020-08-25.
*/
@RestController
@RequestMapping("/meet")
public class MeetController {

    @Autowired
    private MeetService meetService;

    @PostMapping("/add")
    public Result add(Meet meet) {
        meetService.save(meet);
        return OutUtil.success(null);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        meetService.deleteByPrimaryKey(id);
        return OutUtil.success(null);
    }

    @PostMapping("/update")
    public Result update(Meet meet) {
        meetService.updateByPrimaryKey(meet);
        return OutUtil.success(null);
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Meet meet = meetService.findById(id);
         return OutUtil.success(meet);
    }

    @GetMapping("/list")
    public Result list(PageQuery query) {
       PageInfo<Meet> pageInfo = meetService.find(query);
       return OutUtil.success(pageInfo);
    }
}
