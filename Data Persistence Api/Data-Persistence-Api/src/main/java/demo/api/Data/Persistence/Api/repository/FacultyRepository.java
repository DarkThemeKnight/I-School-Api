package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Faculty;
import demo.api.Data.Persistence.Api.entity.Institution;
import demo.api.Data.Persistence.Api.entity.Department;

import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByInstitutionAndNameContaining(Institution institution,String keyword);
    List<Faculty> findByInstitutionAndDepartmentsContaining(Institution institution, Department department);
}
