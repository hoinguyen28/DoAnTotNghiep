package vn.tranh.webBanTranh_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private int idCustomer; // id user
    @Column(name = "user_id", nullable = false)
    private Long userId; // Tham chiếu đến người dùng trong bảng `users` (để kết nối với User entity)

    @Column(name = "shipping_address")
    private String shippingAddress; // Địa chỉ giao hàng

    @Column(name = "billing_address")
    private String billingAddress; // Địa chỉ thanh toán

    @Column(name = "phone")
    private String phone; // Số điện thoại khách hàng

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> listOrders; // Danh sách đơn hàng của khách hàng

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FavoritePainting> listFavoritePaintings; // Danh sách các bức tranh yêu thích

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CartItem> listCartItems; // Danh sách hàng trong giỏ của user

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Feedbacks> listFeedbacks;
}
