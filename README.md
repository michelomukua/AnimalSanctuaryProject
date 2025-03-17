# AnimalSanctuaryProject

## Overview
This application models an animal sanctuary. The sanctuary has space for five species of animals: Cow, Duck, Lion, Gorilla and Hyena. The animals live happy lives and are cared for by an attendant.
The application is to help the user find available space to house and feed individuals of those specified animal species. The application indicated if there were no space to house the animals. 
The Animal class was created with name and sound as defining common properties. This class was made public as the superclass. Specific species extended the Animal class forming the subclasses. The subclasses defining state and behavior unique to each species were also created such as the sounds made by the species while being fed. 
A public Attendant class was also created to assign the Animal species to available enclosures and to feed named individuals of a chosen species. 

An AnimalSanctuaryApp was created from which to run all these activities.

A non-static AnimalSanctuaryApp main object was constructed and invoked.

A new Scanner object was assigned to the field.

In a while loop, menu options were displayed to:
- List the animals by calling the sanctuary's listAnimals method.
- Add a new animal
The choice then prompted the user to choose which animal species to house. 
The chosen animal was then added to the sanctuary.
The user was then prompted for the animal's name which was assigned to the animal thereafter.
The named individual was added to the sanctuary by passing it to the sanctuary's addAnimal method.



## Technologies / Concepts Used
* Java
* Polymorphism: We applied superclass animal references to subclass objects (Cow, Duck, Gorilla, Hyena and Lion)
* Inheritance: We extended methods and fields of animal types (child classes) to inherit those of Animal (parent) class 

## Lessons Learned
 Strings are also a non-primitive variable type.
 Inheritance is a form of code refactoring.
 UML diagram are very useful in projects with mutliple objects and fields
 


