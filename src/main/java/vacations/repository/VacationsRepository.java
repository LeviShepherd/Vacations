package vacations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vacations.beans.Vacation;

@Repository
public interface VacationsRepository extends JpaRepository<Vacation, Long>{

}
