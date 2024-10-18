package com.phuocqt.user_management.mapper;

import com.phuocqt.user_management.dto.request.UserCreationRequest;
import com.phuocqt.user_management.dto.request.UserUpdateRequest;
import com.phuocqt.user_management.dto.response.UserResponse;
import com.phuocqt.user_management.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
