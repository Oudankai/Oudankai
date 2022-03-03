package io.getarrays.userservice01.reposetory;

import io.getarrays.userservice01.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
