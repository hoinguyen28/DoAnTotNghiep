package vn.tranh.webBanTranh_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_detail")
    private long idOrderDetail; // Mã chi tiết đơn hàng
    @Column(name = "price")
    private double price; // Giá
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "id_painting", nullable = false)
    private Painting painting;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_order", nullable = false)
    private Order order; // Đơn hàng
}