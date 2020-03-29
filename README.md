<p align="center">

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)

<!-- ABOUT THE PROJECT -->
## About The Project

This project will show you how to build a web application including CRUD operations using Spring Boot, Thymeleaf, Spring Data JPA, H2 Database.


### Built With
* [Spring](https://spring.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Thymeleaf](https://www.thymeleaf.org/)
* [Maven](https://maven.apache.org/)
* [Embedded Tomcat](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/html/howto-embedded-web-servers.html)

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* [Maven](https://howtodoinjava.com/maven/how-to-install-maven-on-windows/)
* [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows)
* [H2 Database](https://www.tutorialspoint.com/h2_database/h2_database_installation.htm)

### Installation

* Clone the repo
```sh
git clone https://github.com/targettechgroup/spring-boot-contacts.git
```
* Go to the pom.xml directory in terminal 
* Install Maven Dependencies
```sh
mvn clean install
```

## Usage

* Go to the pom.xml directory in terminal
```sh
mvn spring-boot:run
```
* Alternatively, You can also run the application using IntelliJ by hitting the green run icon in class 
`Application`

* [Launch the app by clicking this link ](http://localhost:8080/) or Open Browser and enter http://localhost:8080/