package USA.TEAM.PACKMON.domain.user.domain.repository;

import USA.TEAM.PACKMON.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Optional<User> findByLoginId(String loginId);
    Optional<User> findByPassword(String password);
}
