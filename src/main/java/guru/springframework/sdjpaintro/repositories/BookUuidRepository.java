package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.AuthorUuid;
import guru.springframework.sdjpaintro.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by EI on 29/08/22.
 */
public interface BookUuidRepository extends JpaRepository<BookUuid, Long> {
}
