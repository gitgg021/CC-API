package com.ccapi.ccapiinterface;
import com.ccapi.ccapiclientsdk.client.CCAPIClient;
import com.ccapi.ccapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CcapiInterfaceApplicationTests {
    @Resource
    private CCAPIClient ccapiClient;

    @Test
    void contextLoads(){
        String result = ccapiClient.getNameByGet("hanhan");
        User user = new User();
        user.setUsername("huahua");
        String usernameByPost = ccapiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
