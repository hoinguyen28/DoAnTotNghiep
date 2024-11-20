package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Order;
import vn.tranh.webBanTranh_backend.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "order-detail")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    public List<OrderDetail> findOrderDetailsByOrder(Order order);
}