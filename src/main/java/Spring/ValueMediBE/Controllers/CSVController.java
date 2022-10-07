package Spring.ValueMediBE.Controllers;

import Spring.ValueMediBE.Entity.MyCSVData;
import Spring.ValueMediBE.Repository.InventoryRepository;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CSVController {
    @Autowired
    InventoryRepository inventoryRepository;
    @PostMapping("/upload")
    public String UploadData(@RequestParam("file")MultipartFile file) throws Exception{
        List<MyCSVData> myData=new ArrayList<MyCSVData>();
        InputStream inputStream=file.getInputStream();
        CsvParserSettings settings=new CsvParserSettings();
        settings.setHeaderExtractionEnabled(true);
        CsvParser parser=new CsvParser(settings);
        List<Record> Data=parser.parseAllRecords(inputStream);
        Data.forEach(record -> {
            MyCSVData data=new MyCSVData();
            data.setCode(record.getString("code"));
            data.setName(record.getString("name"));
            data.setCompany(record.getString("company"));
            data.setSupplier(record.getString("supplier"));
            data.setStock(Long.parseLong(record.getString("stock")));
            data.setDeal(Integer.parseInt(record.getString("deal")));
            data.setFree(Integer.parseInt(record.getString("free")));
            data.setExp(record.getString("exp"));
            data.setMrp(Double.parseDouble(record.getString("mrp")));
            data.setRate(Double.parseDouble(record.getString("rate")));
            myData.add(data);
        });
        inventoryRepository.saveAll(myData);
         return "You did it!!!!!!";
    }
}
