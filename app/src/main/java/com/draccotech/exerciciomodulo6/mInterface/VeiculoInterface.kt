package com.draccotech.exerciciomodulo6.mInterface

interface VeiculoInterface {
    var model: String
    var velocity: Long
    val acceleration: Long

    fun acceleration(): String
    fun slowdown() : String

    fun getVelocity(): String {
        return when (this.velocity) {
            in 0 .. 0 -> "Veiculo parou! Velocidade: ${this.velocity} km/h"
            in 1..19 -> "Velocidade: ${this.velocity} km/h. Você está mais rápido que um caracol"
            in 20..39 -> "Velocidade: ${this.velocity} km/h. Você está mais rápido que uma tartaruga"
            in 40..59 -> "Velocidade: ${this.velocity} km/h. Você está mais rápido que um canguru"
            in 60..79 -> "Velocidade: ${this.velocity} km/h. Você está mais rápido que um cavalo"
            in 80..99 -> "Velocidade: ${this.velocity} km/h. Você está mais rápido que um guepardo"
            else -> "Velocidade: ${this.velocity} km/h. Você está muito rápido! Talvez seja melhor diminuir a velocidade"
        }
    }
}