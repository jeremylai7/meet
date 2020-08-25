package com.jeremy.service.meet;

import com.jeremy.data.meet.model.Meet;
import com.jeremy.data.meet.dao.MeetMapper;
import com.jeremy.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Auther: Jeremy
 * @Date: 2020-08-25
 */
@Service
public class MeetServiceImpl extends BaseServiceImpl<Meet> implements MeetService{

       @Resource
       private MeetMapper meetMapper;

}
