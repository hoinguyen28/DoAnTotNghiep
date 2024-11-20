package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Painting;
import vn.tranh.webBanTranh_backend.entity.Image;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "images")
public interface ImageRepository extends JpaRepository<Image, Integer> {
    public List<Image> findImagesByPainting(Painting painting);
    @Modifying
    @Transactional
    @Query("DELETE FROM Image i WHERE i.isThumbnail = false AND i.painting.idPainting = :paintingId")
    public void deleteImagesWithFalseThumbnailByPaintingId(@Param("paintingId") int paintingId);
}