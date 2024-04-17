# Spring Boot Application that combine Reactive and Non-Reactive MongoDB

### Options
##### AbstractMongoClientConfiguration and AbstractReactiveMongoConfiguration
[See](src/main/java/com/rbaul/mongo/config/ReactiveMongoConfig.java)
```properties
spring.main.allow-bean-definition-overriding=true
```
Otherwise, both create MappingMongoConverter

##### Not use AbstractReactiveMongoConfiguration
[See](src/main/java/com/rbaul/mongo/config/ReactiveMongoConfig2.java)

##### Create other AbstractReactiveMongoConfiguration
[See](src/main/java/com/rbaul/mongo/config/ReactiveMongoConfig3.java)