package Spring.ValueMediBE.Repository;

import Spring.ValueMediBE.Entity.MyCSVData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<MyCSVData,Long> {

}
