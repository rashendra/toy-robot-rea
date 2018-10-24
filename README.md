# TOY ROBOT COMMAND LINE APPLICATION

### How To Build and execute the application
#### This application has been developed as a command line application as requested 
Pre-requisites
--------------
JDK 1.8.x 

Technologies/ Libraries used

    Java 8
    JUnit

#### How to run and deploy
Go to the project root directory and run following commands
#### To build and run the application
    ./gradlew build   
    once build , just execute the .jar file 
    java -jar build/libs/toy-robot-rea.jar 
    alternatively you can directly execute the RunCommandLineApplication.java main method using a desired IDE
#### Once the application start running it will display the below . Commands will be taken from the console as below
	Enter your Commands :: (Ctrl + D / C to exist the programme)
	After that please enter the commands (See the below sample )
	PLACE 1,1,NORTH
	REPORT
	1,1,NORTH
	MOVE
	MOVE
	REPORT
	1,3,NORTH
	
#Design pattern and Design principles
## The program exhibits the command design patter , where command interface represents the Command and ToyObject represents the request which s wrapped under command 
## 
    
#Validations
## Any invalid command will  throw a run time exception 
## Any coordinates given outside the table top will throw a run time exception 
## Any command which will push the toy robot outside the table top will be ignored    
    
# Further enhancement and limitations 
## System.out.println(""); has been used to display the output in the console. Loggers has not been used to keep the output simple
## Application can be configured to work as a web with Restful services to receive commands and give the response  - ( Required hours 4 hours)
## Application can be configured to work with spring framework ( required hours 2 hours), which will allow to define services with @Service
## Application an be configured to run as a spring-boot application 
     
    
    