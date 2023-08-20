package com.masi.webserver.core.config;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class K8SClientConfiguration {

  @Bean
  public CoreV1Api coreV1Api() throws IOException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);
    return new CoreV1Api();
  }

}
