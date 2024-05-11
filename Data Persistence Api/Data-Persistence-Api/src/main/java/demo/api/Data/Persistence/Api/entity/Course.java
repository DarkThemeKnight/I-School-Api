package demo.api.Data.Persistence.Api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Course{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subjectCode;
    private String subjectTitle;
    private int credits;
    @ManyToOne
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;
    @ManyToMany(mappedBy = "courses")
    private List<User> students;
    @JoinColumn(name = "lecturer_id")
    @ManyToOne
    private User lecturerInCharge;
    @ManyToMany
    @JoinTable(
            name = "course_prerequisites",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "prerequisite_course_id"))
    private Set<Course> prerequisites;
    @ManyToMany
    @JoinTable(
            name = "course_book_resources",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> resources;
    @ManyToMany
    @JoinTable(
            name = "course_materials",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    private Set<Material> materials;
}
