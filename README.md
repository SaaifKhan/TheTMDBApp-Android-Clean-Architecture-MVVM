# TheTMDBApp-Android-Clean-Architecture-MVVM
# Overview
This Repository contains a Detailed Sample app that Implements MVVM clean Architecture in Kotlin using Retorfit2, Dagger 2, Coroutines, AndroidX, Android Jetpack, DataBinding and Modern Arch

## Implemented by Clean Architecture
⋅⋅* Presentation <br />
⋅⋅* Domain <br />
⋅⋅* Presentation <br />
⋅⋅* Data <br />
⋅⋅* UseCases <br />
⋅⋅* Repository Pattern <br />

## Communication between layers

-UI calls method from ViewModel.
-ViewModel executes Use case.
-Use case combines data from Album and Photo Repositories.
-Each Repository returns data from a Data Source (Cached or Remote).
-Information flows back to the UI where we display the list of posts.

##Scenario
Used https:https://www.themoviedb.org/ as a public api to generate fake data for testing

###### At Glance
Created a list of Movies,TvShows and Artist
In the Item of each , showed  name, Desc, and Images
Update Each and Offline Support.
And:
Supported orientation change
Supported offline mode
##Tools Used:
###### Dagger 2
###### RoomDB
###### MVVM
###### Couroutine
###### DataBinding
###### Constraint Layout
###### Lottie








