package in.quallit.junitwithmockito.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.quallit.junitwithmockito.service.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
