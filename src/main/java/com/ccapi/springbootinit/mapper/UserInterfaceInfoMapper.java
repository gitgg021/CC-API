package com.ccapi.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccapi.ccapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 60500
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-02-06 11:29:05
* @Entity com.ccapi.springbootinit.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




