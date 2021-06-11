package br.com.celfons.domain.usecases

interface UseCases<I, O> {

    fun execute(entity: I): O

}
