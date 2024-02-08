package com.ccapi.springbootinit.service.impl.inner;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccapi.ccapicommon.model.entity.InterfaceInfo;
import com.ccapi.ccapicommon.service.InnerInterfaceInfoService;
import com.ccapi.springbootinit.common.ErrorCode;
import com.ccapi.springbootinit.exception.BusinessException;
import com.ccapi.springbootinit.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }


}

