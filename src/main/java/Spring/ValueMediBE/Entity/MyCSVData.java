package Spring.ValueMediBE.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
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
    @Column(name = "name")
    private String name;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "deal")
    private Integer deal;
    @Column(name = "free")
    private Integer free;
    @Column(name = "mrp")
    private Double mrp;
    @Column(name = "rate")
    private Double rate;
    @Column(name = "exp")
    private String exp;
    @Column(name = "company")
    private String company;
    @Column(name = "supplier")
    private String supplier;
}
