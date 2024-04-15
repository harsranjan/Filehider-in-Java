package views;

import dao.UserDAO;
import model.User;
import service.GenerateOTP;
import service.SendOTPService;
import service.UserService;
import java.io.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Welcome {
    private final Scanner scanner = new Scanner(System.in);

    public void welcomeScreen() {
        System.out.println("Welcome to the app");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to signup");
        System.out.println("Press 0 to exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> login();
            case 2 -> signUp();
            case 0 -> System.exit(0);
        }
    }

    private void login() {
        System.out.println("Enter email");
        String email = scanner.next();
        try {
            if(UserDAO.isExists(email)) {
                String genOTP = GenerateOTP.getOTP();
                SendOTPService.sendOTP(email, genOTP);
                System.out.println("Enter the otp");
                String otp = scanner.next();
                if(otp.equals(genOTP)) {
                    new UserView(email).home();
                } else {
                    System.out.println("Wrong OTP");
                }
            } else {
                System.out.println("User not found");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void signUp() {
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        String genOTP = GenerateOTP.getOTP();
        SendOTPService.sendOTP(email, genOTP);
        System.out.println("Enter the otp");
        String otp = scanner.next();
        if(otp.equals(genOTP)) {
            User user = new User(name, email);
            int response = UserService.saveUser(user);
            switch (response) {
                case 1 -> System.out.println("User registered");
                case 0 -> System.out.println("User already exists");
            }
        } else {
            System.out.println("Wrong OTP");
        }
    }
}
