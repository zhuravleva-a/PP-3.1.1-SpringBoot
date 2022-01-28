package ru.zhuravleva.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.zhuravleva.springboot.model.User;
import ru.zhuravleva.springboot.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class DBInit {

    private UserService userService;

    @Autowired
    public DBInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void createUsersTable() {

        userService.save(new User("Александр", "Стретович", 35, "andrey@email.com"));
        userService.save(new User("Максим", "Завьялов", 28, "maksim@email.com"));
        userService.save(new User("Сабина", "Хасанова", 37, "sabina@email.com"));
        userService.save(new User("Полина", "Соколова", 32, "polina@email.com"));
        userService.save(new User("Антон", "Константинов", 29, "anton@email.com"));

    }

}