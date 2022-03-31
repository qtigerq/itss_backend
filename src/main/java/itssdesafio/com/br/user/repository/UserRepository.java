package itssdesafio.com.br.user.repository;

import itssdesafio.com.br.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
