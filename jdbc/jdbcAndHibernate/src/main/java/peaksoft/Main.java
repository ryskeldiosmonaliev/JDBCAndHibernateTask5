package peaksoft;


import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;


import java.sql.*;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        //UserService userService = new UserServiceImpl();
     //   userService.createUsersTable();
        // userService.dropUsersTable();
//       userService.saveUser("ryskeldi","osmanalev",(byte) 20);
//        userService.saveUser("samat","jakypov",(byte) 20);
//      userService.saveUser("bermet","abdykerimova",(byte) 20);
//        //  userService.removeUserById(1);


        UserService us = new UserServiceImpl();

        us.createUsersTable();

        User user1 = new User("Nurperi", "Arzymatova", (byte) 19);
        User user2 = new User("Atabek", "Issakunov", (byte) 20);
        User user3 = new User("Muktarbek", "Kubanov", (byte) 20);
        User user4 = new User("Aisezim", "Orozbaeva", (byte) 19);

        us.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        us.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        us.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        us.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        List<User> list = us.getAllUsers();
        System.out.print(list + "\n");

        us.removeUserById(1);
        us.removeUserById(2);

        us.dropUsersTable();

        us.cleanUsersTable();

        Util.shutDown();
    }
}
