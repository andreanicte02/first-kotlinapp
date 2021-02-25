# General

- Pragramatico
- Consiso
- Seguro
- Interoperable

# Java-kotlin

Tools -> kotlin ->configure kotlin in project -> android with gradle

de esta forma se podrian combinar clases java y kotlin

En el archivo build. gradle de la raiz

```kotlin
classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
```

indica que ya se pueden compilar archivos kotlin



dentro de app en en archibo build.gradle, se mantien las siguientes dependecnias



```kotlin
 implementation 'androidx.appcompat:appcompat:1.1.0'
    implementation 'com.google.android.material:material:1.1.0'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
    implementation "androidx.core:core-ktx:+"
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"

```

el main se convierte a un archivo de kotlin

no es necesario usar ';'



la palabra 'override' es una palabra reservada no una notacion



'fun' se usa para escribir una nueva funcion

'unit' -> se podria hacer el equivalente al void de java



# Basico

## Funciones

las funciones no son obligadas a estrar dentro de clases de estar dentro de las clases

## Variables

val -> funciona como constante

var -> si puede cambiar el valor

kotlin trata de ser inmutable

el tipo el compilador es capaz de inferirlo

en kotlin no existen los tipos basicos como en java

en kotlin todos los tipos se comportan como clases



## String templates

```kotlin
toast("putos" ${textView.text}")
```



## Clases

Todas las clases son cerradas por defecto, no se puede extender una clase al menos que sea abierta

Solo existe un constructor principal

una clase abstracta es abierta por defecto



```kotlin
abstract class Person (name: String, age: Int)

class Developer: Person{

    constructor(name: String):super(name,29)

    constructor(age: Int ):super("Fanco", age)
}

```



## Properties



Equivalente a un campo + un getter + setter

Pareciera que es atra vez de un campo publico, pero detras hay un getter y un setter

Usando init se pueden iniciar algunos campos

Evitando incializar campos con init, o dentro d elas clases

```kotlin
abstract class Person (val name: String, val age: Int)
```

properties

field se usa para hacer referencia al valor del campo



```kotlin
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
```





kapt es una libreria para cargar imagenes



```kotlin
kapt 'com.github.bumptech.glide:compiler:4.11.0'
```







