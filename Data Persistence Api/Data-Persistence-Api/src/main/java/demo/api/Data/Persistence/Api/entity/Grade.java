package demo.api.Data.Persistence.Api.entity;

import demo.api.Data.Persistence.Api.constants.GradeLetter;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
    private int continuousAssessmentScore;
    private int examScore;
    private int totalScore;
    @Enumerated(EnumType.STRING)
    private GradeLetter gradeLetter;
    private LocalDateTime gradedDate;
    private String remark;
}
