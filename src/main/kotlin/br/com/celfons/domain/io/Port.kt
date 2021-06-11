package br.com.celfons.domain.io

interface Port<I, O> {

    fun execute(input : I): O

}
