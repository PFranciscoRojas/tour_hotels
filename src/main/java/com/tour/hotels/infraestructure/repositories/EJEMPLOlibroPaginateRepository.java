package com.firstproject.poo.infraestructure.repositories;

import com.firstproject.poo.infraestructure.entities.Libro;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface libroPaginateRepository extends PagingAndSortingRepository<Libro, Long> {
}
