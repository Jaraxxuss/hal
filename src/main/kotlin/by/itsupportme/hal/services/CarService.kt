package by.itsupportme.hal.services

import by.itsupportme.hal.model.Car
import org.springframework.data.domain.Pageable

interface CarService {
    fun findById(id: Long) : Car?
    fun findByModel(model: String,pageable: Pageable) : List<Car>
}