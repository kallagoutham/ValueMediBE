package Spring.ValueMediBE.Repository;

import Spring.ValueMediBE.Entity.MyCSVData;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<MyCSVData,Long> {
        @Query("SELECT c FROM MyCSVData c WHERE (c.supplier=?1 and c.name like %?2%)")
        public List<MyCSVData> findAllRecords(String name, String product, PageRequest pageRequest);
        @Query("SELECT c FROM MyCSVData c WHERE (c.supplier=?1 and c.name like %?2% and CURRENT_TIMESTAMP < c.exp)")
        public List<MyCSVData> findAllByName(String name, String product,PageRequest pageRequest);
}
