package com.masi.webserver.core.web;

import com.masi.webserver.ApplicationV1Controller;
import com.masi.webserver.core.service.K8sAPIService;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1NodeList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController extends ApplicationV1Controller {

  final
  K8sAPIService k8sAPIService;

  public NodeController(K8sAPIService k8sAPIService) {
    this.k8sAPIService = k8sAPIService;
  }

  @GetMapping(value = "/nodes")
  public V1NodeList nodes() throws ApiException {
    return this.k8sAPIService.v1NodeList();
  }
}
