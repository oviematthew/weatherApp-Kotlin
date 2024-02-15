# Weather App Kotlin

## This App Uses Retrofit Http Client & Gson Converter for this Weather App

Your ultimate companion for seamless organization and task management. Developed by FOL Group 07 as part of the INFO6134 Capstone Project, this app is designed to simplify your life and enhance your productivity.

## Steps to use Retrofit
1. Add dependency for retrofit in build.gradle
2. Add Internet permission in the AndroidManifest.xml file
3. Create a class that provides Retofit class’s instance
4. Create Data Class for the response data.
5. Create an interface and the methods for the API call
6. Call create() method on Retrofit Object to get an instance of
interface
retrofit.create(SomeInterface::class.java)
7. Call the interface method from a coroutine as it is a network
call
8. Get the data from the method call and display it on the UI.


