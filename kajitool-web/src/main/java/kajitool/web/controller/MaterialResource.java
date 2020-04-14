package kajitool.web.controller;

<<<<<<< HEAD
import java.util.List;

=======
import kajitool.web.domain.model.Material;
import kajitool.web.service.material.MaterialService;
>>>>>>> Try4subProjects
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import kajitool.web.domain.model.Material;
import kajitool.web.service.material.MaterialService;

@RestController
@RequestMapping("/api/v1/material")
public class MaterialResource{
	private final MaterialService service;

	public MaterialResource(final MaterialService service) {
		this.service = service;
	}

	@GetMapping("/")
	public ResponseEntity<List<Material>>getall(){
		return ResponseEntity.ok(service.findAll());
	}
}
=======
import java.util.List;

@RestController
@RequestMapping("/api/v1/material")
public class MaterialResource {
    private final MaterialService service;
    public MaterialResource(final MaterialService service) {
        this.service = service;
    }
    @GetMapping("/")
    public ResponseEntity<List<Material>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
>>>>>>> Try4subProjects
