package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Feedbacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "feedbacks")
public interface FeedBacksRepository extends JpaRepository<Feedbacks, Integer> {
    long countBy();
}
