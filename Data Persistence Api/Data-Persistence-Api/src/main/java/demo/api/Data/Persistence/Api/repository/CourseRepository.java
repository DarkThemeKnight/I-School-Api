package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByInstitutionAndSubjectCode(Institution institution,String subjectCode);
    List<Course> findByInstitution(Institution institution);
    List<Course> findByInstitutionAndLecturerInCharge(Institution institution,User lecturerInCharge);

    List<Course> findByInstitutionAndPrerequisitesContaining(Institution institution,Course prerequisite);

    List<Course> findByInstitutionAndResourcesContaining(Institution institution, Book resource);

    List<Course> findByInstitutionAndMaterialsContaining(Institution institution,Material material);

}
