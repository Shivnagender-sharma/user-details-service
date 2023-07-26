package com.immersion.useraudit.user.domain.model;

import com.immersion.useraudit.user.domain.enums.Role;
import com.immersion.useraudit.user.domain.model.Address;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {
    private String id;
    private String name;
    private String email;
    private String contactNumber;
    private String about;

    private Role role;
    private List<Address> address;
    private boolean isActive;
}
