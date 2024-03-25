# Getting Started
# Run MySql with docker
1. Create `docker-compose.yml`
```JavaScript
version: '3.8'
services:
  mysql:
    image: mysql:latest
    environment:
      MYSQL_ROOT_PASSWORD: test123
      MYSQL_DATABASE: mydb
    ports:
      - "3307:3306"
    volumes:
      - mysql-data:/var/lib/mysql
      - ./my.cnf:/etc/mysql/conf.d/my.cnf
    networks:
      - my_network

volumes:
  mysql-data:
networks:
  my_network:
    driver: bridge
```
2. Create `my.cnf` to allow other containers to communicate with this container
```JavaScript
[mysqld]
bind-address = 0.0.0.0
```
3. Run: `docker-compose up -d`
4. Note: Any docker containers want to access this DB server should be in the same network with this server.
# Run in Debug mode
1. Change the application.properties: `spring.datasource.url=jdbc:mysql://localhost:3307/miu`
2. Run: mvn spring-boot:run
# Run with docker
1. Change the application.properties: `spring.datasource.url=jdbc:mysql://mysql-container-name:3306/miu`
2. Build the docker-image: `mvn spring-boot:build-image -DskipTests`
3. Run: `docker run --name my-spring-app --network mysql_my_network -t -p 8000:8080 demo:0.0.1-SNAPSHOT`

