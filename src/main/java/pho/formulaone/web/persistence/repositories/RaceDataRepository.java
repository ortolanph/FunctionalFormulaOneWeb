package pho.formulaone.web.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pho.formulaone.web.persistence.entities.RaceData;

@Repository
public interface RaceDataRepository extends JpaRepository<RaceData, Long> {

}
