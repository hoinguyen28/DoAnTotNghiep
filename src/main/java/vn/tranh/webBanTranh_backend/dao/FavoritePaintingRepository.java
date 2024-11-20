package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Painting;
import vn.tranh.webBanTranh_backend.entity.FavoritePainting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.tranh.webBanTranh_backend.entity.User;

import java.util.List;

@RepositoryRestResource(path = "favorite-painting")
public interface FavoritePaintingRepository extends JpaRepository<FavoritePainting, Integer>{
    public FavoritePainting findFavoritePaintingByPaintingAndUser(Painting painting, User user);
    public List<FavoritePainting> findFavoritePaintingsByUser(User user);
}
