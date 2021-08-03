# Kotlin - Movie App

[Using Fragments](https://developer.android.com/jetpack/androidx/releases/fragment)

[Navigation](https://developer.android.com/guide/navigation/navigation-getting-started)

### Using in App Gradle

Source File: app/build.gradle (:app)

```shell script
  plugins {
    ...
    id "androidx.navigation.safeargs.kotlin"
  }

  (...)
  // Fragment
  implementation 'androidx.fragment:fragment-ktx:1.3.6'
    
  // Navigation
  implementation "androidx.navigation:navigation-fragment-ktx:2.3.5"
  implementation "androidx.navigation:navigation-ui-ktx:2.3.5"
```

### Using in Build Gradle

Source File: build.gradle (CursoAndroid)

```shell script
  (...)
  dependencies {
    classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5"
  }
```
