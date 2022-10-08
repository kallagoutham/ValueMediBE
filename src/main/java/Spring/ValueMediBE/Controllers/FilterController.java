package Spring.ValueMediBE.Controllers;
import Spring.ValueMediBE.Entity.MyCSVData;
import Spring.ValueMediBE.Service.FilterService;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/supplier")
public class FilterController {
    private final FilterService filterService;

    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public List<MyCSVData> findById(@PathVariable("id")String id, @RequestParam(name = "product" , defaultValue = "") String product,
                                    @RequestParam(name="exp",defaultValue = "true") boolean notexp, @RequestParam(name="page",defaultValue = "0")int page,
                                    @RequestParam(name="size",defaultValue = "10")int size){

        return filterService.findAllByName(id,product,notexp, PageRequest.of(page,size));
    }
}
