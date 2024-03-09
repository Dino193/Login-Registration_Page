package security.service;



import java.util.List;

import security.dto.UserDto;
import security.entity.User;

public interface UserService {
	
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}

