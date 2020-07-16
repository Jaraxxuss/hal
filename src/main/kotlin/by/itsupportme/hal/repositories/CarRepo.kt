package by.itsupportme.hal.repositories

import by.itsupportme.hal.model.Car
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepo : CrudRepository<Car,Long> {
    fun findByModel(model: String,pageable: Pageable) : List<Car>
}