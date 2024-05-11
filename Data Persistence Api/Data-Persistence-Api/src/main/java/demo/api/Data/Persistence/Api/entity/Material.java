package demo.api.Data.Persistence.Api.entity;

import demo.api.Data.Persistence.Api.constants.MaterialType;
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
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate lifeTime;
    private String fileUrl;
    @Enumerated(value = EnumType.STRING)
    private MaterialType materialType;
}