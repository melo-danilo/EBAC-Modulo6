package com.draccotech.exerciciomodulo6.mAbstract

abstract class VeiculoAbstract(val id: Int) {
    abstract var model: String
    abstract var velocity: Long
    abstract val acceleration: Int

    abstract fun acceleration(): String
    abstract fun slowdown() : String

    fun getVelocity(): String {
        return when (this.velocity) {
            in 0 .. 0 -> "ID: $id . Modelo: ${model}. Veiculo parou! Velocidade: ${this.velocity} km/h"
            in 1..19 -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está mais rápido que um caracol"
            in 20..39 -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está mais rápido que uma tartaruga"
            in 40..59 -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está mais rápido que um canguru"
            in 60..79 -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está mais rápido que um cavalo"
            in 80..99 -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está mais rápido que um guepardo"
            else -> "ID: $id . Modelo: ${model}. Velocidade: ${this.velocity} km/h. Você está muito rápido! Talvez seja melhor diminuir a velocidade"
        }
    }

}