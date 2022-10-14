# order-site-in-a-box
Sample architecture of an order site.  This project runs in a single Docker project.
**WARNING This is a work in progress (WIP).**

## Description
This project implements a simple website with a Java microservice back-ends, a stand-alone database, and both an API 
and a front-end written in React.  This entire project runs in a set of Docker containers.

The purpose of this website is to implement an order entry system.  While there are plenty of excellent commercial 
and open-source, the purpose of this project is to bring a number of technologies together to clearly demonstrate some 
state-of-the-market technologies.  The initial list is:
- Docker
- Gradle
- Relational Databases (PostgreSQL)
- Shared caches (Redis)
- Java
- React
- REST

This list is subject to change without notice.


## Parent Project
The parent project at the top level is a Docker Compose-based project that runs the package.  It stands up a shared
database.  See the [USAGE](USAGE.md) file for instructions.


## Child Projects
The following child projects are used to create the site.  All these projects are started and stopped automatically.

- **database** provides the database for the project.
- **user** provides the processing for the user domain.
- **security** provides the authentication and authorization.
- **order** provides the order processing.
- **inventory** provides the inventory processing.
- **payment** provides the system to process the payments for the orders.
