package OOPSem4.Homework4.Service;

import OOPSem4.Homework4.Model.Student;
import OOPSem4.Homework4.Model.User;
import OOPSem4.Homework4.Repository.UserRepository;

import java.util.List;

public interface UserService {
    void add(User user);

    void remove(User user);

    void remove(int index);


    void edit(User user, User updatedUser);

    void print(User user);

    List<User> getAllUsers();


    User get(User user);

    void saveAll(List<User> users);

    List<User> getStudents();

    List<User> getTeachers();

    public UserRepository<User> getRepository();

    }

