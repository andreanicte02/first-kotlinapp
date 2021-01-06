package com.example.firstappkotlin


fun add(x: Int, y:Int): Int = x + y

abstract class Person (name: String, val age: Int){

    var name = name
    get() = "name: $field"

    set(value){
        field = value
    }

}



class Developer: Person{

    constructor(name: String):super(name,29)

    constructor(age: Int ):super("Fanco", age)
}

fun test(){

    val d = Developer("Pancho")

    val name = d.name //name pancho
}