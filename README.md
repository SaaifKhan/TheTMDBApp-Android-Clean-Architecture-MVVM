# TheTMDBApp-Android-Clean-Architecture-MVVM
# Overview
This Repository contains a Detailed Sample app that Implements MVVM clean Architecture in Kotlin using Retorfit2, Dagger 2, Coroutines, AndroidX, Android Jetpack, DataBinding and Modern Arch

## Why Clean Arch? <br />
MVVM separates your view (i.e. Activitys and Fragments) from your business logic. MVVM is enough for small projects, but when your codebase becomes huge, your ViewModels start bloating. Separating responsibilities becomes hard.<br />
MVVM with Clean Architecture is pretty good in such cases. It goes one step further in separating the responsibilities of your code base. It clearly abstracts the logic of the actions that can be performed in your app.<br />
Note: You can combine Clean Architecture with the model-view-presenter (MVP) architecture as well. But since Android Architecture Components already provides a <br /> built-in ViewModel class, we are going with MVVM over MVP — no MVVM framework required!

<br /> 
⋅⋅* Presentation <br />
⋅⋅* Domain <br />
⋅⋅* Presentation <br />
⋅⋅* Data <br />
⋅⋅* UseCases <br />
⋅⋅* Repository Pattern <br />

## Communication between layers

-UI calls method from ViewModel. <br />
-ViewModel executes Use case.  <br />
-Use case combines data from Album and Photo Repositories.  <br />
-Each Repository returns data from a Data Source (Cached or Remote).  <br />
-Information flows back to the UI where we display the list of posts.  <br />

##Scenario
Used https:https://www.themoviedb.org/ as a public api to generate fake data for testing <br /> <br />

###### At Glance <br />
Created a list of Movies,TvShows and Artist <br />
In the Item of each , showed  name, Desc, and Images <br />
Update Each and Offline Support.  <br />
And: <br />
Supported orientation change <br />
Supported offline mode <br />
##Tools Used: <br />
###### Dagger 2  <br />
###### RoomDB <br />
###### MVVM <br />
###### Couroutine <br />
###### DataBinding <br />
###### Constraint Layout <br />
###### Lottie <br /> 
<br />

## Images
For Images <br/>
[(https://postimg.cc/gallery/QT1gfyL)]



