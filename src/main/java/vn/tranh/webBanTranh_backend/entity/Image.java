package vn.tranh.webBanTranh_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_image")
    private int idImage; // Mã ảnh
    @Column(name = "name_image")
    private String nameImage; // Tên ảnh
    @Column(name = "is_thumbnail")
    private boolean isThumbnail; // Có phải là thumbnail không
    @Column(name = "url_image")
    private String urlImage; // Link hình ảnh

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_painting", nullable = false)
    private Painting painting; // Thuộc quyển sách nào

}