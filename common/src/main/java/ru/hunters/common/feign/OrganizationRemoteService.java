package ru.hunters.common.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "organizationservice", path ="/v1/organizations")
public interface OrganizationRemoteService {

}
