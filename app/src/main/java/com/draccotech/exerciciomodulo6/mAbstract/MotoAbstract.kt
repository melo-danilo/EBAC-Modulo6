package com.draccotech.exerciciomodulo6.mAbstract

import java.util.*

class MotoAbstract(id: Int) : VeiculoAbstract(id) {

    override var model: String =
        when (Random().nextInt(5)){
            1 -> "Harley-Davidson"
            2 -> "Yamaha"
            3 -> "Kawasaki"
            4 -> "Ducati"
            else -> "Honda"
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