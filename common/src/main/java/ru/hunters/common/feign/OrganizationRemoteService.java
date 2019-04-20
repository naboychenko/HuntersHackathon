package ru.hunters.common.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "organization-service", path ="/organizations")
public interface OrganizationRemoteService {

}
