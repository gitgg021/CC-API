package com.ccapi.ccapiclientsdk;

import com.ccapi.ccapiclientsdk.client.CCAPIClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ccapi.client")
@Data
@ComponentScan
public class CCApiClientConfig {

    private String accessKey;
    private String secretKey;

    @Bean
    public CCAPIClient ccApiClient(){
        return new CCAPIClient(accessKey,secretKey);
    }

}
