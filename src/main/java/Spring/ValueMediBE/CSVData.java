package Spring.ValueMediBE;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class CSVData {
    @CsvBindByName
    private String code;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String batch;
    @CsvBindByName
    private Long stock;
    @CsvBindByName
    private Integer deal;
    @CsvBindByName
    private Integer free;
    @CsvBindByName
    private Double mrp;
    @CsvBindByName
    private Double rate;
    @CsvBindByName
    private Date exp;
    @CsvBindByName
    private String company;
    @CsvBindByName
    private String supplier;

}
