package br.com.celfons.domain.usecases

interface UseCases<T> {

    fun execute(entity: T): T

}
