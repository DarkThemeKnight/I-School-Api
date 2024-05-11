package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution,Integer> {
    Institution findByInstitutionName(String institutionName);
    Institution findByEmail(String email);
    Institution findByPhoneNumber(String phoneNumber);
    List<Institution> findByCity(String city);
    List<Institution> findByState(String state);
    List<Institution> findByCountry(String country);
    List<Institution> findByEstablishedDateAfter(LocalDate date);
    List<Institution> findByEstablishedDateBefore(LocalDate date);
    List<Institution> findByEstablishedDateBetween(LocalDate startDate, LocalDate endDate);
}
