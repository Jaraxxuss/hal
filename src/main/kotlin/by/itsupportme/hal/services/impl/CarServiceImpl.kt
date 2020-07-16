package by.itsupportme.hal.services.impl

import by.itsupportme.hal.model.Car
import by.itsupportme.hal.repositories.CarRepo
import by.itsupportme.hal.services.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class CarServiceImpl(
        @Autowired
        private val carRepo: CarRepo
) : CarService{
    override fun findById(id: Long): Car? = carRepo.findById(id).orElse(null)
    override fun findByModel(model: String, pageable: Pageable): List<Car> {
        return carRepo.findByModel(model, pageable)
    }


}