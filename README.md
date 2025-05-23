# ShoppingCartApplication
Shopping cart created by spring boot

This application is developed using spring-boot framework following mvc architecture using maven build tool along with spring web, spring data-jpa and mysql-jdbc dependences. This is a shopping cart Application used to display catalog items from our database. It is simple application demonstrating the simplistic use of spring-boot framework reducing boiler plate code.

# Steps used in this project
install ubuntu using this command wsl --install

install java in ubuntu using this command sudo apt install default-jre

check version java -version

install mysql in ubuntu using this command sudo apt install mysql-server

check version using mysql -V

# prerequistes before coding
use command in linux: sudo service mysql start (to start sql server)

sudo mysql (to enter mysql CLI)

create user using command CREATE USER your_user_name@localhost IDENTIFIED BY your_password;

create database if not exists database_name; (In my case it is shopping_db)

grant permissions to root user on your created database name using command GRANT ALL PRIVILEGES your_database_name.* TO your_user_name@localhost;

# Main project (Make sure to use linux shell in IDE as it secure and simple)
1) Browse spring intializer in web and select language-java, spring-boot version-3.5.0, buildtool-maven and add dependencies -springweb, data-jpa, mysql-jdbc

2) springweb used to communicate using restAPI's, data-JPA used to map columns with databases using hibernate also performing CRUD operations and mysql-jdbc is used for connecting to mysql server.

3) follow MVC architecture meaning model view controller by creating three classes ProductDetails.java used to create and map columns to create a table in database, ProductDetailsRepo.java used for performing CRUD operations and automatically creating table without explicit sql table creation and finally create MainController.java for handling requests and responses for Display data from sql table as Json object.

4) Run main class in springBoot which is ShoppingApplication.java. It would be different  based on your name you create using spring initializer or instead use this command in your IDE vs code or another IDE in linux shell ./mvnw spring-boot:run

5) your application should connect to mysql creating table based on your entity class you create. Then you go to your browser http://localhost:8080/path/root to get the records initially it would be zero.

6) to add records and view use command in new terminal keeping your application running curl -X POST http://localhost:8080/path/root in my case root = add.

7) For more instructions refer this link: https://spring.io/guides/gs/accessing-data-mysql
