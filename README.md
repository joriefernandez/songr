#Songr Application

The application uses localhost:8080 with different routes:
1. /hello - page displays "Hello, world"
* Example: `localhost:8080/hello`
2. /capitalize/[string] - page displays capitalized version of the string
* Example: `localhost:8080/capitalize/sample`
3. /reverse?sentence=[string] - page displays the reversed words
* Example: `localhost:8080/reverse/This is sample`

## To run the application
1. Clone the repo and go to the directory. On the terminal run `./gradlew bootRun`
2. Open your web browser and go to localhost:8080

## Source code
* [HelloWorldController](./src/main/java/com.fern.jorie.projectlab.songr/HelloWorldController.java)
* [HelloWorldTest](./src/test/java/com.fern.jorie.projectlab.songr/HelloWorldController.java)
