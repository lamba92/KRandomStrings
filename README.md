# KRandomStrings [![Build Status](https://travis-ci.org/lamba92/KRandomStrings.svg?branch=master)](https://travis-ci.org/lamba92/KRandomStrings) [![](https://jitpack.io/v/lamba92/krandomstrings.svg)](https://jitpack.io/#lamba92/krandomstrings)

Common code library of extension functions for `kotlin.random.Random` object adding random strings and UUIDv4

Written in Kotlin with ❤️.

## Usage

Just call what you need:

```
val uuid: String = Random.uuid()
// 478b9e1c-a428-48e3-9f1f-af14e4deffcb

val alhpanum: String = Random.nextAlphanumericString()
// dn0-2\]2'f2023l]%

val char: Char = Random.nextChar()
```

Check the here for other functions.


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
    implementation 'com.github.lamba92:krandomstrings:{latest_version}'
}
```

If using Gradle Kotlin DSL:
```
repositories {
    maven(url = "https://jitpack.io")
}
...
dependencies {
    implementation("com.github.lamba92", "krandomstrings", "{latest_version}")
}

