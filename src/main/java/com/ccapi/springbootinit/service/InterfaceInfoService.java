package com.ccapi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccapi.ccapicommon.model.entity.InterfaceInfo;

/**
* @author 60500
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-02-05 16:45:06
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
