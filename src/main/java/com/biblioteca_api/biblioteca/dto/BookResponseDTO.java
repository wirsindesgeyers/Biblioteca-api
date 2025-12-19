package com.biblioteca_api.biblioteca.dto;

import com.biblioteca_api.biblioteca.entities.Book;

import java.math.BigDecimal;
import java.time.LocalDate;

public record BookResponseDTO(

        Long id,
        String title,
        String isbn,
        BigDecimal price,
        LocalDate publishedDate


) {
    public BookResponseDTO(Book book) {
        this(
                book.getId(),
                book.getTitle(),
                book.getIsbn(),
                book.getPrice(),
                book.getPublishedDate()
        );
    }
}
