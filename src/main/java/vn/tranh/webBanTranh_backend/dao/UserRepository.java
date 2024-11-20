package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(excerptProjection = User.class, path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
    public User findByUsername(String username);
    public User findByEmail(String email);
}
