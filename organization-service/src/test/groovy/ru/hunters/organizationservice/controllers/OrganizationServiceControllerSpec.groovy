package ru.hunters.organizationservice.controllers

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import ru.hunters.organizationservice.services.OrganizationService
import ru.hunters.patientservice.model.Patient
import ru.hunters.patientservice.services.PatientService
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = OrganizationServiceController)
class OrganizationServiceControllerSpec extends Specification {

    @Autowired
    protected MockMvc mockMvc

    @SpringBean
    OrganizationService organizationService = Mock(OrganizationService)

    def "getOrganization should return organization"() {

        given:
        def organization = new Organization()
        organization.setOrganizationId("123")
        organizationService.getOrganizationByIdentifier(_ as String) >> organization
        when: "getOrganizationByIdentifier method is invoked"
        def result = mockMvc.perform(
                get('/v1/organizations/{identifier}/', "123"))

        then: "valid filters should be returned"
        result.andExpect(status().isOk())

        and:
        result.andExpect(jsonPath('$.organizationId').value('123'))
    }
}
