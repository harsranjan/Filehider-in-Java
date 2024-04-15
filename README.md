# File Hider

File Hider is a Java application designed to securely hide files, ensuring privacy and confidentiality for users. It allows users to hide sensitive files and reveal them as needed, with authentication via OTP (One Time Password) sent to their email addresses.

## Features

- **User Authentication:** Users can log in or sign up using their email addresses and verify their identity via OTP sent to their email.
- **File Hiding:** Once authenticated, users can hide files securely, ensuring they are not easily discoverable or accessible.
- **File Revealing:** Users can reveal hidden files when needed, ensuring they have access to their hidden files whenever necessary.
- **Database Storage:** User information and hidden files metadata are stored securely in a MySQL database.

## Technologies Used

- Java
- JDBC (Java Database Connectivity)
- JavaMail API for email communication

## Installation

1. Clone the repository:
<br>
git clone https://github.com/your-username/file-hider.git

2. Set up your MySQL database and configure the database connection in the project.

3. Open the project in IntelliJ IDEA.

4. Compile and run the Java application from IntelliJ IDEA.

## Usage

1. Launch the application.
2. Choose to log in if you have an existing account or sign up if you're a new user.
3. Follow the prompts to authenticate via OTP sent to your email address.
4. Once authenticated, you can hide files by providing their paths.
5. You can also reveal hidden files when needed.

## Future Enhancements

- Implement file encryption for added security.
- Enhance the user interface for better usability.
- Introduce multi-factor authentication for enhanced security.

## Contributing

Contributions are welcome! If you have any ideas for improvements or new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
