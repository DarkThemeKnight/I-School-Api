package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Department;
import demo.api.Data.Persistence.Api.entity.Institution;
import demo.api.Data.Persistence.Api.entity.Faculty;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByInstitutionAndFaculty(Institution institution, Faculty faculty);
    List<Department> findByInstitutionAndNameContaining(Institution institution,String keyword);
}
