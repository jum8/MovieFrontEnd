package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//This is my repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
