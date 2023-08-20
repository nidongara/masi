package com.masi.webserver.core.service;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1NodeList;

public interface K8sAPIService {
  V1NodeList v1NodeList() throws ApiException;
}
