package ecorau.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ecorau.shop.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
