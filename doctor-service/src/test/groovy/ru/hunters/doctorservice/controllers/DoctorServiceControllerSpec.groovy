package ru.hunters.doctorservice.controllers

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import ru.hunters.doctorservice.model.Doctor
import ru.hunters.doctorservice.services.impl.DoctorServiceImpl
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = DoctorController)
class DoctorServiceControllerSpec extends Specification {

    @Autowired
    protected MockMvc mockMvc

    @SpringBean
    DoctorService doctorService = Mock(DoctorServiceImpl)

    def "getDoctor should return doctor"() {
    }
}
