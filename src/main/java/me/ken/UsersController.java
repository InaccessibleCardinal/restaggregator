package me.ken;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UsersController {
    UserRequest u = new UserRequest();

    @RequestMapping("/user/{id}")
    public HashMap index(@PathVariable String id) {
        HashMap parsed = new HashMap();

        try {
            String postsUrl = "posts?userId=" + id;
            String todosUrl = "todos?userId=" + id;
            int userIndex = Integer.parseInt(id) - 1;

            parsed.put("user", u.makeRequest("users", true, userIndex));
            parsed.put("userposts", u.makeRequest(postsUrl, false, userIndex));
            parsed.put("usertodos", u.makeRequest(todosUrl, false, userIndex));

        } catch (Exception e) {
            parsed = null;
            e.printStackTrace();
        }

        return parsed;
    }
}
