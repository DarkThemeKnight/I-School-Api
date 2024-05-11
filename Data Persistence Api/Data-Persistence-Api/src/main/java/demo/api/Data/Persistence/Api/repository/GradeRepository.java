package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Grade;
import demo.api.Data.Persistence.Api.entity.User;
import demo.api.Data.Persistence.Api.entity.Course;
import demo.api.Data.Persistence.Api.constants.GradeLetter;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByUser(User user);
    List<Grade> findByCourseAndUser(Course course,User user);
    List<Grade> findByContinuousAssessmentScoreGreaterThan(int score);
    List<Grade> findByExamScoreGreaterThan(int score);
    List<Grade> findByTotalScoreGreaterThan(int score);
    List<Grade> findByGradeLetter(GradeLetter gradeLetter);
    List<Grade> findByGradedDateAfter(LocalDateTime dateTime);
    List<Grade> findByGradedDateBefore(LocalDateTime dateTime);
    List<Grade> findByGradedDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
}
