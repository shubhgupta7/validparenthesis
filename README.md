# validparenthesis
This project is a web application that validates a string of parentheses. It features a twinkling star background, a real-time clock displaying Indian Standard Time, and an input field for users to enter a string of parentheses. The application uses Java, Spring Boot, and MongoDB for the backend, and HTML, CSS, and JavaScript for the frontend
# Valid Parenthesis

This project is a web application that checks if a given string of parentheses is valid. It uses Java, Spring Boot, and MongoDB for the backend, and HTML, CSS, and JavaScript for the frontend.

## Features

- Twinkling star background animation
- Real-time clock displaying Indian Standard Time
- Input field for entering a string of parentheses
- Displays the result of the validation on the same page
- Stores the input and result in a MongoDB database

## Prerequisites

- Java 11 or higher
- Maven
- MongoDB

## Getting Started

### Backend

1. Clone the repository:
    ```sh
    git clone https://github.com/shubhgupta7/ValidParenthesis.git
    cd ValidParenthesis
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the Spring Boot application:
    ```sh
    mvn spring-boot:run
    ```

### Frontend

1. Open `ValidParenthesis/src/main/resources/static/index.html` in your browser to access the application.

## API Endpoints

- **GET** `/getAll`: Retrieves all results from the database.
- **POST** `/valid`: Validates the given string of parentheses and stores the result.
- **GET** `/getValue/{string}`: Validates the given string of parentheses and returns the result.

## Project Structure

- `src/main/java/com/Project/ValidParenthesis`: Contains the Java source code.
- `src/main/resources/static`: Contains the static HTML, CSS, and JavaScript files.

## Technologies Used

- Java
- Spring Boot
- Maven
- MongoDB
- HTML
- CSS
- JavaScript

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
