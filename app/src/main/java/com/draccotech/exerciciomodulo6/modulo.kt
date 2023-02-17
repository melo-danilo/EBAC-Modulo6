package com.draccotech.exerciciomodulo6

import com.draccotech.exerciciomodulo6.factory.VeiculoFactory
import com.draccotech.exerciciomodulo6.mAbstract.CarroAbstract
import com.draccotech.exerciciomodulo6.mAbstract.MotoAbstract
import com.draccotech.exerciciomodulo6.mAbstract.VeiculoAbstract
import com.draccotech.exerciciomodulo6.mInterface.CarroInterface
import com.draccotech.exerciciomodulo6.mInterface.MotoInterface
import com.draccotech.exerciciomodulo6.mInterface.VeiculoInterface
import java.util.*

fun main(){

    val factory = VeiculoFactory()
    val veiculosList: MutableList<VeiculoAbstract> = mutableListOf()

    for(i in 1..100){
        val veiculo =
            factory.createVeiculo(
                Random().nextInt(2).times(2) + 2,
                i
            )
        veiculosList.add(veiculo!!)
    }

    veiculosList.forEach {
        it.acceleration()
        println("Acelerando ------------------------------")
        println(it.getVelocity())
        it.slowdown()
        println("Reduzindo  ------------------------------")
        println(it.getVelocity())
    }

}
