# Weather App Kotlin

## This App Uses Retrofit Http Client & Gson Converter for this Weather App

Your ultimate companion for seamless organization and task management. Developed by FOL Group 07 as part of the INFO6134 Capstone Project, this app is designed to simplify your life and enhance your productivity.

## Steps to use Retrofit
- Add dependency for retrofit and GSON in build.gradle -
   val retrofit_version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")

- Add Internet permission in the AndroidManifest.xml file
  <uses-permission android:name="android.permission.INTERNET"/>
  
- Create an object class that provides Retofit class’s instance
- Create Data Class for the response data.
- Create an interface and the methods for the API call
- Call create() method on Retrofit Object to get an instance of the interface
  retrofit.create(SomeInterface::class.java)
- Call the interface method from a coroutine as it is a network call
- Get the data from the method call and display it on the UI.

## View Model implementation of the model data classes and used to listen to livedata by the Main Activity


