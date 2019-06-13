#Songr Application

The application uses localhost:8080 with different routes:
1. /hello - page displays "Hello, world"
* Example: `localhost:8080/hello`
2. /capitalize/[string] - page displays capitalized version of the string
* Example: `localhost:8080/capitalize/sample`
3. /reverse?sentence=[string] - page displays the reversed words
* Example: `localhost:8080/reverse/This is sample`
4. /albums - page displays all albums in the database. User can also add an album in the form.
* Example: `localhost:8080/albums`

## To run the application
1. Clone the repo and go to the directory. On the terminal, run `./gradlew bootRun`
2. Open your web browser and go to localhost:8080

## Source code
* [HelloWorldController](./src/main/java/com.fern.jorie.projectlab.songr/HelloWorldController.java)
* [HelloWorldTest](./src/test/java/com.fern.jorie.projectlab.songr/HelloWorldController.java)
* [Album](./src/test/java/com.fern.jorie.projectlab.songr/Album.java)
* [AlbumRepository](./src/test/java/com.fern.jorie.projectlab.songr/AlbumRepository.java)
* [AlbumController](./src/test/java/com.fern.jorie.projectlab.songr/AlbumController.java)

## Dependencies
`compile("org.springframework.boot:spring-boot-starter-data-jpa")
 implementation('org.postgresql:postgresql')
 implementation 'org.springframework.boot:spring-boot-starter-web'
 implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
 developmentOnly 'org.springframework.boot:spring-boot-devtools'
 testImplementation 'org.springframework.boot:spring-boot-starter-test'`