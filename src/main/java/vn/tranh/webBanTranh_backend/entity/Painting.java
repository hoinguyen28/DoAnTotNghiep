package vn.tranh.webBanTranh_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "painting")

public class Painting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_painting")
    private int idPainting; // Mã tranh
    @Column(name = "name_painting")
    private String namePainting; // Tên tranh
    @Column(name = "author")
    private String author; // Tên tác giả
    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description; // Mô tả
    @Column(name = "price")
    private double price; // Giá niêm yết
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "painting_genre", joinColumns = @JoinColumn(name = "id_painting"), inverseJoinColumns = @JoinColumn(name = "id_genre"))
    private List<Genre> listGenres; // Danh sách thể loại

    @OneToMany(mappedBy = "painting",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> listImages; // Danh sách ảnh

    @OneToOne(mappedBy = "painting",fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<OrderDetail> listOrderDetails; // Danh sách chi tiết đơn hàng

    @OneToMany(mappedBy = "painting",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FavoritePainting> listFavoritePainting; // Danh sách sách yêu thích
    @OneToOne(mappedBy = "painting",fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Feedbacks> listFeedbacks; // Danh sách feedbacks

    @OneToMany(mappedBy = "painting",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CartItem> listCartItems;

}
