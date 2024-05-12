package demo.api.Data.Persistence.Api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private LocalDate startDate;
    
    private LocalDate endDate;
    
    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private Session session;
    
    // Other attributes, constructors, getters, and setters can be added as needed
}
