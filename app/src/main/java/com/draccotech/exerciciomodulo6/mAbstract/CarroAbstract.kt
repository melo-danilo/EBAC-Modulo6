package com.draccotech.exerciciomodulo6.mAbstract

import java.util.*

class CarroAbstract(id: Int) : VeiculoAbstract(id) {

    override var model: String =
        when (Random().nextInt(5)){
            1 -> "Mustang"
            2 -> "Camaro"
            3 -> "Challenger"
            4 -> "BMW M4"
            else -> "Porsche 911"
        }

    override var velocity: Long = 0
    override val acceleration: Int
        get() = Random().nextInt(120)

    override fun acceleration(): String {
        this.velocity += this.acceleration
        return "$velocity"
    }

    override fun slowdown(): String {
        if (this.velocity <= this.acceleration) {
            this.velocity = 0
        } else {
            this.velocity -= this.acceleration
        }
        return "$velocity"
    }

}