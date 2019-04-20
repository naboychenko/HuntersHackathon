package ru.hunters.patientservice.controllers

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import ru.hunters.patientservice.model.Patient
import ru.hunters.patientservice.services.PatientService
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = PatientServiceController)
class PatientServiceControllerSpec extends Specification {

    @Autowired
    protected MockMvc mockMvc

    @SpringBean
    PatientService patientService = Mock(PatientService)

    def "getPatient should return patient"() {

        given:
        def patient = new Patient()
        patient.setPatientId("123")
        patient.setOrganizationId("abc")
        patientService.getPatientByOrganizationIdAndPatientId(_ as String, _ as String) >> patient
        when: "getPatient method is invoked"
        def result = mockMvc.perform(
                get('/v1/organizations/{organizationId}/patients/{patientId}', "abc", "123"))

        then: "valid filters should be returned"
        result.andExpect(status().isOk())

        and:
        result.andExpect(jsonPath('$.patientId').value('123'))
        result.andExpect(jsonPath('$.organizationId').value('abc'))
    }
}
