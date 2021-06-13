package br.com.celfons.domain.usecases

interface UseCases

interface CommandCases<T>: UseCases {

    fun execute(t: T): T

}

interface QueryCases<T>: UseCases {

    fun execute(): T

}
