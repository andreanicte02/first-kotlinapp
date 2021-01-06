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


fun getItems(): List<MediaItem> = listOf(
        MediaItem("Title 1", "https://placekitten.com/200/200?image=1"),
        MediaItem("Title 2", "https://placekitten.com/200/200?image=2"),
        MediaItem("Title 3", "https://placekitten.com/200/200?image=3"),
        MediaItem("Title 4", "https://placekitten.com/200/200?image=4"),
        MediaItem("Title 5", "https://placekitten.com/200/200?image=5"),
        MediaItem("Title 6", "https://placekitten.com/200/200?image=6"),
        MediaItem("Title 7", "https://placekitten.com/200/200?image=7"),
        MediaItem("Title 8", "https://placekitten.com/200/200?image=8"),
        MediaItem("Title 9", "https://placekitten.com/200/200?image=9"),
        MediaItem("Title 10", "https://placekitten.com/200/200?image=10")
)