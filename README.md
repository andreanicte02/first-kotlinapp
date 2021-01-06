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



















