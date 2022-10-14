# Using the Project

## Commands
The project defines the following commands.

| Command    | Description                                                                         |
|------------|-------------------------------------------------------------------------------------|
| make up    | starts the project.                                                                 |
| make down  | Stops the project, destroying all the containers. The data is preserved by default. |
| make stop  | Stops the project, preserving the containers and the data.                          |
| make reset | Removes the volume preserving the data to reset the project to its initial state.   |
| make clear | Stops the project, destroys all containers, and resets the data.                    |

