package com.masi.webserver.core.service;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1NodeList;
import org.springframework.stereotype.Service;

@Service
public class K8sAPIServiceImpl implements K8sAPIService {

  final
  CoreV1Api coreV1Api;

  public K8sAPIServiceImpl(CoreV1Api coreV1Api) {
    this.coreV1Api = coreV1Api;
  }

  public V1NodeList v1NodeList() throws ApiException {
    return this.coreV1Api.listNode(null, null, null, null, null, null, null, null, null, null);
  }
}
