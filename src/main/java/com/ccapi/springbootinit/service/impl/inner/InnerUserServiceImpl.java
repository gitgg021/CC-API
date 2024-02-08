package com.ccapi.springbootinit.service.impl.inner;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccapi.ccapicommon.model.entity.User;
import com.ccapi.ccapicommon.service.InnerUserService;
import com.ccapi.springbootinit.common.ErrorCode;
import com.ccapi.springbootinit.exception.BusinessException;
import com.ccapi.springbootinit.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if(StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
