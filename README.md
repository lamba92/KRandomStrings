# KRandomStrings [![Build Status](https://travis-ci.org/lamba92/KRandomStrings.svg?branch=master)](https://travis-ci.org/lamba92/KRandomStrings) [![](https://jitpack.io/v/lamba92/krandomstrings.svg)](https://jitpack.io/#lamba92/krandomstrings)

Common code library of extension functions for `kotlin.random.Random` object adding random strings and UUIDv4

Written in Kotlin with ❤️.

#### Platforms available:
 - JVM
 - JS
 - Linux
 - Android
 
Jitpack cannot build for MacOS or Windows so for now that's it folks.

## Usage

Just call what you need:

```
val uuid: String = Random.uuid()
// 478b9e1c-a428-48e3-9f1f-af14e4deffcb

val alhpanum: String = Random.nextAlphanumericString()
// abcdefghijk1234

val char: Char = Random.nextChar()
```

Check the [here](https://github.com/lamba92/KRandomStrings/blob/master/src/commonMain/kotlin/it/lamba/random/KRandomStrings.kt) for other functions.


## Installing [![](https://jitpack.io/v/lamba92/krandomstrings.svg)](https://jitpack.io/#lamba92/krandomstrings)

Add the [JitPack.io](http://jitpack.io) repository to the project `build.grade`:
```
repositories {
    maven { url 'https://jitpack.io' }
}
```

Then import the latest version in the `build.gradle` of the modules you need:

```
dependencies {
    implementation 'com.github.lamba92.krandomstrings:KRandomStrings{-platform}:{latest_version}'
}
```

If using Gradle Kotlin DSL:
```
repositories {
    maven(url = "https://jitpack.io")
}
...
dependencies {
    implementation("com.github.lamba92.krandomstrings", "KRandomStrings{-platform}", "{latest_version}")
}
```

The `-platform` placeholder should be replaced with:
 - `-jvm`
 - `-js`
 - `-android_native_32`
 - `-android_native_64`
 - `-linuxx86_64`
 
Leave it empty for common sources in common library.
