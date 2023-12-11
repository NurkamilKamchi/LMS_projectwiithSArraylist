package Service;

import models.User;

public interface UserService {
    User login(User user);

    User updatePassword(User user);
}
