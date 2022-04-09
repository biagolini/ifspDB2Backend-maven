package repository;

import com.bd2.ecommerce.entity.Highlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HighlightRepository extends JpaRepository<Highlight,Long> {
}
