package Spring.ValueMediBE.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "my_csv_data")
public class MyCSVData {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "batch")
    private String batch;
    @Column(name = "name")
    private String name;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "deal")
    private Integer deal;
    @Column(name = "free")
    private Integer free;
    @Column(name = "mrp")
    private String mrp;
    @Column(name = "rate")
    private String rate;
    @Column(name = "exp")
    private Date exp;
    @Column(name = "company")
    private String company;
    @Column(name = "supplier")
    private String supplier;
}
