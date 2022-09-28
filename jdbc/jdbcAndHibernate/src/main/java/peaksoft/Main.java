package peaksoft;


import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;


import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        User user = new User("ryskeldi", "osmonaliev", (byte) 25);
        userService.createUsersTable();
        // userService.dropUsersTable();
//        userService.saveUser("ryskeldi","osmanalev",(byte) 20);
//        userService.saveUser("samat","jakypov",(byte) 20);
//        userService.saveUser("bermet","abdykerimova",(byte) 20);
        //  userService.removeUserById(1);

    }
}
