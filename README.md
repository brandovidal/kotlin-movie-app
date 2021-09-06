# Kotlin - Movie App

[Using Fragments](https://developer.android.com/jetpack/androidx/releases/fragment)

[Navigation](https://developer.android.com/guide/navigation/navigation-getting-started)

[Retrofit](https://square.github.io/retrofit/)

[Room](https://developer.android.com/training/data-storage/room)

### Using in App Gradle

Source File: app/build.gradle (:app)

```shell script
  plugins {
    (...)
    id "androidx.navigation.safeargs.kotlin"
    id 'kotlin-kapt'
  }

  (...)
  // Concat Adapter
  implementation "androidx.recyclerview:recyclerview:1.2.1"

  // Fragment
  implementation 'androidx.fragment:fragment-ktx:1.3.6'

  // ViewModel and LiveData KTX
  // ViewModel
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
  // LiveData
  implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

  // Navigation
  implementation "androidx.navigation:navigation-fragment-ktx:2.3.5"
  implementation "androidx.navigation:navigation-ui-ktx:2.3.5"

  // Retrofit - Converter GSON
  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation 'com.google.code.gson:gson:2.8.7'
  implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
  implementation 'androidx.legacy:legacy-support-v4:1.0.0'

  // Glide - Utils
  implementation 'com.github.bumptech.glide:glide:4.12.0'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'

  // Room
  implementation("androidx.room:room-runtime:2.3.0")
  implementation("androidx.room:room-ktx:2.3.0")
  kapt "androidx.room:room-compiler:2.3.0"

```

### Using in Build Gradle

Source File: build.gradle (MovieApp)

```shell script
  (...)
  dependencies {
    classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5"
  }
```
