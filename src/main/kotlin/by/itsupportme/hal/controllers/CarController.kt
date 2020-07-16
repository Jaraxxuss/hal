package by.itsupportme.hal.controllers

import by.itsupportme.hal.services.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/car")
class CarController(
        @Autowired
        private val carService: CarService
) {
    @GetMapping("{id}")
    fun getOne(@PathVariable("id") id: Long) {

    }

    @GetMapping("/recent")
    fun getAll(){
        val pageable = PageRequest.of(0,2, Sort.by("year").descending())
        val cars = carService.findByModel("bwm",pageable)
        val resources = org.springframework.hateoas.RepresentationModel
    }
}