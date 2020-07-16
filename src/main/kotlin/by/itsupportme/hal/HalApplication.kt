package by.itsupportme.hal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HalApplication

fun main(args: Array<String>) {
    runApplication<HalApplication>(*args)
}
