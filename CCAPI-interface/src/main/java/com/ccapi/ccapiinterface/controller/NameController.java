package com.ccapi.ccapiinterface.controller;
import com.ccapi.ccapiclientsdk.model.User;
import com.ccapi.ccapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * 名称 API
 *
 */

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name,HttpServletRequest request){
        System.out.println(request.getHeader("caocao"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){

    /*    String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        //todo 实际情况应该是去数据库中查看是否已分配给用户
        if(!accessKey.equals("hanhan")){
            throw new RuntimeException("无权限");
        }
        if(Long.parseLong(nonce) > 10000){
            throw new RuntimeException("无权限");
        }
        //todo 时间和当前时间不能超过 5 分钟

        //todo 实际情况中从数据库查出 secretKey
        String serverSign = SignUtils.genSign(body, "hanhan");
        if(!sign.equals(serverSign)){
            throw new RuntimeException("无权限");
        }*/
        String result = "POST 你的名字是" + user.getUsername();
        // 调用成功后 : 次数加 1
        return result;
    }
}
