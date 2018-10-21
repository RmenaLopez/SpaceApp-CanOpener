# NDP
NDP backend 

## Service
This service provides funtionality for NDP app.
The service runs in a digitalocean droplet with IP: 178.128.181.138
REST requests are proceses on the server and the information is stored in a SQL server database.

### To run the service localy:

- run the DB, on project source directory:
  * docker-compose up
  
- compile project, on project source dir:
  * mvn clean install
  
- start project, on project source dir:
  * java -jar target/SpaceApp-CanOpener-0.0.1-SNAPSHOT.jar
