package com.jeremy.service.reservemeet;

import com.jeremy.data.reservemeet.model.ReserveMeet;
import com.jeremy.data.reservemeet.dao.ReserveMeetMapper;
import com.jeremy.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Auther: Jeremy
 * @Date: 2020-08-25
 */
@Service
public class ReserveMeetServiceImpl extends BaseServiceImpl<ReserveMeet> implements ReserveMeetService{

       @Resource
       private ReserveMeetMapper reservemeetMapper;

}
