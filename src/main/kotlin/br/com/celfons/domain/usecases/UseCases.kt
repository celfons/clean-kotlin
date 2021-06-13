package br.com.celfons.domain.usecases

interface UseCases

interface UseCasesIn<I>: UseCases {

    fun execute(i: I): I

}

interface UseCasesOut<O>: UseCases {

    fun execute(): O

}

interface UseCasesInOut<I, O>: UseCases {

    fun execute(i: I): O

}
