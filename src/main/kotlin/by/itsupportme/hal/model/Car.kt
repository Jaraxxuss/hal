package by.itsupportme.hal.model

import javax.persistence.*

@Entity
class Car(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val model: String? = null,
        val weight: Int? = null,
        val year: Int? = null
) {

}