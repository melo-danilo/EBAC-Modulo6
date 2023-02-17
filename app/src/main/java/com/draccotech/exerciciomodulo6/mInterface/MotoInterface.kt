package com.draccotech.exerciciomodulo6.mInterface

class MotoInterface() : VeiculoInterface {

    override var model: String = ""
    override var velocity: Long = 0
    override val acceleration: Long
        get() = 5

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