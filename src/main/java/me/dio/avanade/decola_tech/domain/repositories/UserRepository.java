package me.dio.avanade.decola_tech.domain.repositories;

import me.dio.avanade.decola_tech.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
