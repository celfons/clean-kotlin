package br.com.celfons.domain

interface Port

interface Command<T>: Port {

    fun execute(t: T): T

}

interface Query<T>: Port {

    fun execute(): T

}
