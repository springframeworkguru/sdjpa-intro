/*
 * Copyright (c) 2023 by SHV Consulting Integrated Services UG
 * author: jcm on 2023/1/15
 */

package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}


