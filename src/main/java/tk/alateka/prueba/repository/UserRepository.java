package tk.alateka.prueba.repository;

import tk.alateka.prueba.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UserRepository extends JpaRepository<User, Integer> {
}