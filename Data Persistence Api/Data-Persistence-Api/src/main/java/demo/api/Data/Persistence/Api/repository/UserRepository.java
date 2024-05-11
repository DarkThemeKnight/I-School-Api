package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.constants.Role;
import demo.api.Data.Persistence.Api.entity.Institution;
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
    List<User> findByInstitution(Institution institution);
    List<User> findByRolesContaining(Role role);
    List<User> findByRolesIn(List<Role> roles);
    User findByUsernameAndInstitution(String username, Institution institution);
    User findByEmailAndInstitution(String email, Institution institution);
    User findByPhoneNumber1AndInstitution(String phoneNumber, Institution institution);
    List<User> findByFirstNameAndLastNameAndInstitution(String firstName, String lastName, Institution institution);
    List<User> findByCityAndInstitution(String city, Institution institution);
    List<User> findByStateAndInstitution(String state, Institution institution);
    List<User> findByCountryAndInstitution(String country, Institution institution);
    List<User> findByDateOfBirthAfterAndInstitution(LocalDate date, Institution institution);
    List<User> findByDateOfBirthBeforeAndInstitution(LocalDate date, Institution institution);
    List<User> findByDateOfBirthBetweenAndInstitution(LocalDate startDate, LocalDate endDate, Institution institution);
    List<User> findByRolesContainingAndInstitution(Role role, Institution institution);
    List<User> findByRolesInAndInstitution(List<Role> roles, Institution institution);
}
