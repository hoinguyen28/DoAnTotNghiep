package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Painting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path = "painting")
public interface PaintingRepository extends JpaRepository<Painting, Integer> {
    Page<Painting> findByNamePaintingContaining(@RequestParam("namePainting") String namePainting, Pageable pageable);
    Page<Painting> findByListGenres_idGenre(@RequestParam("idGenre") int idGenre, Pageable pageable);
    Page<Painting> findByNamePaintingContainingAndListGenres_idGenre(@RequestParam("namePainting") String namePainting ,@RequestParam("idGenre") int idGenre, Pageable pageable);
    long count();
}
