package Spring.ValueMediBE.Service;

import Spring.ValueMediBE.Entity.MyCSVData;
import Spring.ValueMediBE.Repository.InventoryRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FilterServiceImpl implements FilterService {
    private final InventoryRepository inventoryRepository;
    public FilterServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public List<MyCSVData> findAllByName(String id, String product, boolean exp , PageRequest pageRequest) {
        if(exp) {
            return inventoryRepository.findAllRecords(id, product,pageRequest);
        }
        else{
            return inventoryRepository.findAllByName(id, product,pageRequest);
        }

    }
}
