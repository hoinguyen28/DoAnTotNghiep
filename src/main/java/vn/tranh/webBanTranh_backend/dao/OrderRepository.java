package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Order;
import vn.tranh.webBanTranh_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "orders")
public interface OrderRepository extends JpaRepository<Order, Integer> {
    public Order findFirstByUserOrderByIdOrderDesc(User user);
}