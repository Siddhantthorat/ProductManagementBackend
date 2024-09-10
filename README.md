# Spring Boot Product Management API with MongoDB Atlas

## Overview

This Spring Boot project implements a product management system with *basic authentication* and *method-level authorization* using *MongoDB Atlas* as the database. *Admins* can manage products, while *customers* can view only visible products.

## Features

- *Authenticatiosn & Authorization*: 
  - Basic authentication with roles (admin, customer).
  - Admin can add, edit, delete, and view all products.
  - Customers can only view visible products.
  - Role-based access using method-level authentication.

- *Product Management*:
  - *Admin*: Full product CRUD operations.
  - *Customer*: View only visible products and details.
## Note:
1.I have used basic auth, we can use other authentication providers as well.

2.I have Implemented Exception Handling in few apis, we can also go ahead with globalexceptionhandler like using advice controller.

3.I have used Mongodb Atlas , we can use any database or local database.

4.If any modifications needed please reachout to me, I have tried to implement best coding standards.
