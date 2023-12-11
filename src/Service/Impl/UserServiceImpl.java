package Service.Impl;

import Service.UserService;
import models.User;

import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public User login(User user) {
        System.out.print("Enter email: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("Enter pessword: ");
        String pass = new Scanner( System.in).nextLine();
        if (email.equalsIgnoreCase(user.getEmail()) && pass.equals(user.getPassword())){
            return user;
        }
        return null;
    }

    @Override
    public User updatePassword(User user) {
        System.out.print("Enter email: ");
        String email = new Scanner(System.in).nextLine();
        if (email.equalsIgnoreCase(user.getEmail())){
            System.out.print("Enter new password: ");
            String pass = new Scanner(System.in).nextLine();
            if (pass.length()>=5){
                user.setPassword(pass);
                return user;
            }
        }
        return null;
    }
}
