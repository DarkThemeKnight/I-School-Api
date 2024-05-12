package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<Semester, Long> {
}
