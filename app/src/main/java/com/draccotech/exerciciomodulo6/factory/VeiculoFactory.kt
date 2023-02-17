package com.draccotech.exerciciomodulo6.factory

import com.draccotech.exerciciomodulo6.mAbstract.CarroAbstract
import com.draccotech.exerciciomodulo6.mAbstract.MotoAbstract
import com.draccotech.exerciciomodulo6.mAbstract.VeiculoAbstract
import com.draccotech.exerciciomodulo6.mInterface.CarroInterface
import com.draccotech.exerciciomodulo6.mInterface.MotoInterface
import com.draccotech.exerciciomodulo6.mInterface.VeiculoInterface

class VeiculoFactory {

    fun createVeiculo(numberOfWheels: Int, id: Int): VeiculoAbstract?{
        if(numberOfWheels == 2){
            return MotoAbstract(id)
        }

        if(numberOfWheels == 4){
            return CarroAbstract(id)
        }

        return null
    }
}