/*
 * Copyright (c) 2023 by SHV Consulting Integrated Services UG
 * author: jcm on 2023/1/15
 */

package guru.springframework.sdjpaintro.bootstrap;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book    bookDDD = new Book("Domain Driven Design", "123", "Random");

        System.out.println("id: " + bookDDD.getId());
        Book    savedDDD = bookRepository.save(bookDDD);
        System.out.println("id: " + savedDDD.getId());

        Book    bookSIA = new Book("Spring in Action", "234234", "O'Reilly");
        Book    savedIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id   : " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
