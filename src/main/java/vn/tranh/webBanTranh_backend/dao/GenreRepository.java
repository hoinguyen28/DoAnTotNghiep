package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Genre;
import vn.tranh.webBanTranh_backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "genre")
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
