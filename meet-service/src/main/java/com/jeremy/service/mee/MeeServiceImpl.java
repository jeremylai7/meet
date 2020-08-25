package com.jeremy.service.mee;

import com.jeremy.data.mee.model.Mee;
import com.jeremy.data.mee.dao.MeeMapper;
import com.jeremy.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Auther: Jeremy
 * @Date: 2020-08-25
 */
@Service
public class MeeServiceImpl extends BaseServiceImpl<Mee> implements MeeService{

       @Resource
       private MeeMapper meeMapper;

}
