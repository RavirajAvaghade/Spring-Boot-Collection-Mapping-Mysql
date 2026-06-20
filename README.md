# Spring Boot Collection Mapping MySQL

## 📌 Project Overview

This project demonstrates Collection Mapping in Spring Boot using Spring Data JPA, Hibernate, and MySQL Database.

Collection Mapping is used to store multiple values such as List, Set, and Map for a single entity in a separate collection table.

## 🚀 Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate ORM
* MySQL Database
* Maven
* Eclipse IDE

## 📂 Features

* Collection Mapping using `@ElementCollection`
* List Collection Mapping
* Set Collection Mapping
* Map Collection Mapping
* Automatic Table Creation using Hibernate
* MySQL Database Integration

## 🗄️ Database Tables

### Employee Table

Stores employee details.

### Collection Tables

Stores employee-related collection data such as:

* Phone Numbers
* Emails
* Skills
* Courses

## 📖 Annotations Used

* `@Entity`
* `@Id`
* `@ElementCollection`
* `@CollectionTable`
* `@JoinColumn`
* `@Column`
* `@MapKeyColumn`

## ⚙️ How to Run

1. Clone the repository
2. Open the project in Eclipse or IntelliJ IDEA
3. Configure MySQL Database
4. Update `application.properties`
5. Run the Spring Boot Application
6. Verify tables in MySQL

## 📸 Output

The application creates parent and collection tables in MySQL and stores collection data successfully.

## 👨‍💻 Author

**Raviraj Yuvraj Avaghade**

* Java Full Stack Developer
* Spring Boot Developer
* AWS Cloud Enthusiast

GitHub: https://github.com/RavirajAvaghade
