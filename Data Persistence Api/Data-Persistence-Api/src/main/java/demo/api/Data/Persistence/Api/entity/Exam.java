package demo.api.Data.Persistence.Api.entity;


import demo.api.Data.Persistence.Api.constants.ExamFormat;
import demo.api.Data.Persistence.Api.constants.ExamStatus;
import demo.api.Data.Persistence.Api.constants.ExamType;
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
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    private LocalDateTime examDate;

    private int duration; // Duration in minutes

    @ManyToOne
    @JoinColumn(name = "semester_id", nullable = false)
    private Semester semester;

    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private Session session;

    @Enumerated(EnumType.STRING)
    private ExamType examType;

    private int gradeWeight;

    @Enumerated(EnumType.STRING)
    private ExamStatus status;

    private String specialInstructions;

    private String feedback;

    @Enumerated(EnumType.STRING)
    private ExamFormat examFormat;
    private String examURL;
}
