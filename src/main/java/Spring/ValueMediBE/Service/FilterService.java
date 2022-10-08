package Spring.ValueMediBE.Service;

import Spring.ValueMediBE.Entity.MyCSVData;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface FilterService {


   public List<MyCSVData> findAllByName(String id, String product, boolean exp, PageRequest pageRequest);
}
