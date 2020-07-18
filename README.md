# spring-learning
This repo serves to track my learning of Spring Framework

- Maven



### Spring
Spring aims to make developer challenges easy, like creating web applications, working with databases, securing applications, and microservices.

Spring make the J2EE(Java EE) development much easier.

#### Benenifit
- Alternitive of Java EE
- Spring make it easier to create Java enterprise application
- Flexible, modular, backwards compatible
- Large and active community



#### Spring Framework key areas
- Core  
At the center of Spring Core is Dependency Injection

- Web  
Spring web is the framework to handle web request, by `Spring web MVC` or `Spring web Webflux`.
`Spring web MVC` utilize Servlet, A servlet is an object that receives a request and generates a response base on that request.
`Spring web Webflux`, utilize reactive Programming. using data stream, asynchronous.

- AOP, Aspect-oriented programming
A programming paradigm, that aims to increase modularity, by allowing the separation of cross-cutting concerns.
examples, spring security,

- Data access
database sql
database transaction
exception handling
testing


- Integration
application communications

- Testing




#### Other

- application context, container
- Wiring construct
- IoC
- dependency injection
- AOP
- auto wiring
- component scan

* The components, commonly referred to as beans, in a Spring application context can be declared explicitly with Java or XML, discovered by component scanning, or automatically configured with Spring Boot autoconfiguration


#### Bean
A bean is a singleton, only one of them will get created

##### Bean Scopes
* Valid in any configuration
 - `Singleton`, the default bean scope inside Spring. Restrict to one instance per Spring container(Spring application context).
 - `Prototype`, new instance per request
* Valid only in web-aware spring projects
  - Request, a bean per HTTP request
  - Session, a bean per HTTP session
  - Global, a single bean per entire application.

##### Stereotypes Annotations

- `@Component`
- `@Repository`
- `@Service`, where you put you business logic

##### Bean Profiles
`@Profiles("dev")`, use to restrict a bean from expose to certain environment.

### SpEL, Spring expression language



### Spring benifit
- Testability
- Maintain ability
- Scalability
- Complexity
- Business focus, JDBC example, driver manager, try catch block....

### Spring project structure

* `mvnw` and `mvnw.cmd` — These are Maven wrapper scripts. You can use these scripts to build your project even if you don’t have Maven installed on your machine.
* `pom.xml` — This is the Maven build specification.
* `TacoCloudApplication.java` —This is the Spring Boot main class that bootstraps the project.
* `application.properties` — This file is initially empty, but offers a place where you can specify configuration properties.
* `static` — This folder is where you can place any static content (images, stylesheets, JavaScript, and so forth) that you want to serve to the browser. It’s initially empty.
* `templates` — This folder is where you’ll place template files that will be used to render content to the browser. It’s initially empty, but you’ll add a Thymeleaf template soon.
* `TacoCloudApplicationTests.java` — This is a simple test class that ensures that the Spring application context loads successfully. You’ll add more tests to the mix as you develop the application.


### Spring MVC
* `Controller`, a class that handles requests and responds with information of some sort.
* `View`



### Command
* Run test, `./mvnw test` in console


### Spring Boot
Spring Boot builds on top of Spring to make Spring even easier with simplified dependency management, automatic configuration, and runtime insights.  

It provide a new fast way to build Spring-based application.

* Auto-configuration
* Starter dependencies
* just run

* The Actuator provides runtime insight into the inner workings of an application, including metrics, thread dump information, application health, and environment properties available to the application.
* Flexible specification of environment properties.
* Additional testing support on top of the testing assistance found in the core framework.



### Spring Data JPA
* the ability to define your application’s data repositories as simple Java interfaces, using a naming convention when defining methods to drive how data is stored and retrieved.
* Spring Data is capable of working with several different kinds of databases, including relational (via JDBC or JPA), document (Mongo), graph (Neo4j), and others

### Spring Boot DevTools
* `Automatic application restart` when code changes, the application is loaded into two separate class loaders in the Java virtual machine (JVM). When a change is detected, DevTools reloads only the class loader containing your project code and restarts the Spring application context, but leaves the other class loader and the JVM intact. This means that any time you add, change, or remove a dependency in your build specification, you’ll need to do a hard restart of the application for those changes to take effect.

* `Automatic browser refresh when browser-destined resources` (such as templates, JavaScript, stylesheets, and so on) change
* `Automatic disable of template caches`
* Built in `H2 Console` if the H2 database is in use

### Spring Integration and Spring Batch
* At some point, most applications will need to integrate with other applications or even with other components of the same application. Several patterns of application integration have emerged to address these needs. Spring Integration and Spring Batch provide the implementation of these patterns for Spring-based applications.

* Spring Integration addresses real-time integration where data is processed as it’s made available. In contrast, Spring Batch addresses batched integration where data is allowed to collect for a time until some trigger (perhaps a time trigger) signals that it’s time for the batch of data to be processed.

### Spring Cloud
* Build on top of Spring Boot, aim for the distributed system.

* As I’m writing this, the application development world is entering a new era where we’ll no longer develop our applications as single deployment unit monoliths and will instead compose applications from several individual deployment units known as `microservices`.

* `Microservices` are a hot topic, addressing several practical development and runtime concerns. In doing so, however, they bring to fore their own challenges. Those challenges are met head-on by Spring Cloud, a collection of projects for developing cloud-native applications with Spring.



### Spring Security
* Spring Security addresses a broad range of application security needs, including authentication, authorization, and API security.


## Miscellaneous
### Reactive Programming

[ReactiveX](http://reactivex.io/) `RxJava`   
[Intro to Reactive Programming by Jordan Jozwiak of Google - CS50 Tech Talk](https://www.youtube.com/watch?v=KOjC3RhwKU4)
* Data stream
* Functional programming
* Asynchronous observers

### Tools
- [Lombok](https://projectlombok.org/)
- [JDL-studio](https://start.jhipster.tech/jdl-studio/), database modeling tools
