package ch.bosshard.matteo.template.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WebRepository extends JpaRepository<MyEntity, Long>{
}