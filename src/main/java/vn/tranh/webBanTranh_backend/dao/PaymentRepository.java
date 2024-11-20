package vn.tranh.webBanTranh_backend.dao;

import vn.tranh.webBanTranh_backend.entity.Order;
import vn.tranh.webBanTranh_backend.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@RepositoryRestResource(path = "payments")
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}