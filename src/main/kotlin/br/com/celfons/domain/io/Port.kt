package br.com.celfons.domain.io

interface Port

interface PortIn<I>: Port {

    fun execute(i: I): I

}

interface PortOut<O>: Port {

    fun execute(): O

}

interface PortInOut<I, O>: Port {

    fun execute(i: I): O

}
