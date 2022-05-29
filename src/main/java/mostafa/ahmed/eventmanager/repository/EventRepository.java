package mostafa.ahmed.eventmanager.repository;

import mostafa.ahmed.eventmanager.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This Repository allows us ot get CRUD Database Operations using JPARepository
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
