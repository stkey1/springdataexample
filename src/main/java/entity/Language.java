package entity;

/**
 * @author stkey
 * @customize
 * @add
 * @components
 * @throws
 * @return
 * @since 8.01.2023
 */
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "languages")
@Data
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "language",length = 30,nullable = false)
    private String language;

    @OneToOne(mappedBy = "language")
    private Book book;

}