package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhoneNumber1(String phoneNumber);
    List<User> findByFirstNameAndLastName(String firstName, String lastName);
    List<User> findByCity(String city);
    List<User> findByState(String state);
    List<User> findByCountry(String country);
    List<User> findByDateOfBirthAfter(LocalDate date);
    List<User> findByDateOfBirthBefore(LocalDate date);
    List<User> findByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);
}
