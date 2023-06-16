package com.pravin.blog.services;

import com.pravin.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto RegisterNewUser(UserDto userDto);

    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user,Integer userId);
    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
