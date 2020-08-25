package com.jeremy.admin.controller;
import com.jeremy.meet.web.core.utils.OutUtil;
import com.jeremy.meet.web.core.view.Result;
import com.jeremy.data.reservemeet.model.ReserveMeet;
import com.jeremy.service.reservemeet.ReserveMeetService;
import com.jeremy.data.query.PageQuery;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/** 会议预约表
* Created by Jeremy on 2020-08-25.
*/
@RestController
@RequestMapping("/reserve/meet")
public class ReserveMeetController {

    @Autowired
    private ReserveMeetService reserveMeetService;

    @PostMapping("/add")
    public Result add(ReserveMeet reserveMeet) {
        reserveMeetService.save(reserveMeet);
        return OutUtil.success(null);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        reserveMeetService.deleteByPrimaryKey(id);
        return OutUtil.success(null);
    }

    @PostMapping("/update")
    public Result update(ReserveMeet reserveMeet) {
        reserveMeetService.updateByPrimaryKey(reserveMeet);
        return OutUtil.success(null);
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ReserveMeet reserveMeet = reserveMeetService.findById(id);
         return OutUtil.success(reserveMeet);
    }

    @GetMapping("/list")
    public Result list(PageQuery query) {
       PageInfo<ReserveMeet> pageInfo = reserveMeetService.find(query);
       return OutUtil.success(pageInfo);
    }
}
