# api-py
Minimal microservice for single module with basic CRUD operations using Java Springboot


## How to Setup

### Pre-requisites
- Install [Java SDK](https://www.oracle.com/java/technologies/downloads/#java21)
- Download [Maven](https://maven.apache.org/download.cgi) and [install](https://maven.apache.org/download.cgi)
- Install dependencies
```bash
mvn clean install
```

### Start in Dev Mode
Run following commands

```bash
java -jar target/crud-api-microservice-0.0.1-SNAPSHOT.jar
```

## To Test
To test run the following commands

```bash
# To get all data
curl localhost:8080/api/items

# To create new data
curl -X POST -H 'content-type:application/json' -d '{"name":"Example Item","price":10.99}' localhost:8080/api/items 

# To get specific Data based on id
# Replace :id with the value of id returned in above command
curl -X GET localhost:8080/api/items/:id

# To delete specific Data based on id
# Replace :id with the value of id returned in above command
curl -X DELETE localhost:8080/api/items/:id  #replace id with the value of id returned in above command
```

You can test the same using postman