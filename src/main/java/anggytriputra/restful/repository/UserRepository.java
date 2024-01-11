package anggytriputra.restful.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import anggytriputra.restful.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
