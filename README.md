# Cell Towers
## Introduction
In a bucolic setting there is a long country road with houses scattered very sparsely along it. The road has an western and eastern endpoint. Everyone is an avid cell-phone user, and we need to give themn all reception by placing cell towers. The issues is that cell-phone towers only provide reception 4 miles to the east and to the west. We want to place towers so that every house is covered, using as few cell-towers as possible.

## Description 
This program generates a random set of 20 houses. It represents houses on the road by using an array list. The western endpoint of the road is represented by integer 0. For instance the set {2, 9, 10} means that there is a house 2 miles east from western endpoint, there is a house 9 miles east from the western endpoint, and there is a house 10 miles east from the western endpoint. The program returns a list of cell towers following the same format, that represents the fewest number of cell towers such that every house receives coverage.

## Requirements
*Used to execute JAR file*
- JDK version 15.0.1 or newer
- JRE version 15.0.1 or newer 

## User Manual
1. Download repository as a ZIP 
2. Unzip folder
3. Navigate to repository in command-line interpreter
4. Execute command java -jar cellTowers.jar

## Reflection
I do not factor the rand function used in my program in my time complexity as this is only used to generate an arbitrary set of houses and is not part of the inherent algorithm. I decided to do this as it shows that my program works for a variety of different sets without the need to make up inputs. I also used the Java library Collections.sort to sort the list of houses. While this is not necessary for my program to work, it makes for much nicer and realistic results. If the list isn't sorted usually the houses are too far apart to have anything outside of the same number of radio towers as houses. Therefore I will not factor this into my algorithm either. With this in mind, my program would have a time complexity of O(n) where n is ther number of houses. This is because I have a single for loop that iterates through my list of houses, and every instance within the for loop has a constant time complexity. 

## Results
Houses are located at:  
[4, 7, 11, 13, 23, 30, 32, 44, 57, 63, 71, 77, 79, 81, 82, 85, 87, 92, 94, 95]  
Cell towers are located at:  
[8, 17, 27, 36, 48, 61, 75, 85, 96]  
Press enter to exit.  

Houses are located at:
[0, 5, 6, 8, 11, 13, 15, 19, 32, 33, 43, 50, 52, 56, 58, 65, 67, 73, 82, 95]  
Cell towers are located at:  
[4, 15, 36, 47, 56, 69, 86, 99]  
Press enter to exit.  

Houses are located at:  
[5, 7, 8, 9, 10, 18, 23, 26, 37, 40, 48, 55, 63, 68, 76, 81, 86, 87, 88, 97]  
Cell towers are located at:  
[9, 22, 41, 52, 67, 80, 90, 101]  
Press enter to exit.  
