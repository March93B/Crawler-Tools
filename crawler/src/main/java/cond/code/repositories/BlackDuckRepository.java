package cond.code.repositories;

import cond.code.entities.BlackDuck;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlackDuckRepository extends JpaRepository<BlackDuck, Integer> {

    Optional<BlackDuck> findByUrlApi(String Url);
    Optional<BlackDuck> findAllByNameApi(String apiNameBlackDuck);
    boolean existsByNameApi(String name);

    List<BlackDuck> findAllByTypeEquals(String type, Sort sort);

    List<BlackDuck> findAllByActiveProd(boolean activeProd, Sort sort);

    List<BlackDuck> findAllByTypeEqualsAndActiveProd(String type,boolean activeProd, Sort sort);
}
