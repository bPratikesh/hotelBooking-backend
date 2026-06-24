package com.pratikesh.airBnbApp.util;

import com.pratikesh.airBnbApp.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class ApplicationUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
