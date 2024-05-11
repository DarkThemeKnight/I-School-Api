package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

}
