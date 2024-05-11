package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Material;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    // Custom query to find materials by title
    List<Material> findByTitle(String title);

    // Custom query to find materials by description
    List<Material> findByDescription(String description);

    // Custom query to find materials by file URL
    Material findByFileUrl(String fileUrl);

    // Add more custom query methods if needed...
}
