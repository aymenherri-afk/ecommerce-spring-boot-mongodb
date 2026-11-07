# E-Commerce Application

## Description

This project is a monolithic E-Commerce application developed using Spring Boot and MongoDB.

## Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB
- Postman
- Maven

## Architecture

The application follows a layered architecture:

- Model
- Repository
- Service
- Controller

## Database

Database name: ecommerce_db
Collection name: products

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product |
| POST | /api/products | Add product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

## Run the Application

Run MongoDB first.

Then execute:
```bash
mvn spring-boot:run