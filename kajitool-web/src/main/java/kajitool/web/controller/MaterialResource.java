package kajitool.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import kajitool.web.domain.model.Material;
import kajitool.web.service.material.MaterialService;

@RestController
@RequestMapping("/api/v1/material")
@CrossOrigin
public class MaterialResource {
    private final MaterialService service;
    public MaterialResource(final MaterialService service) {
        this.service = service;
    }
    @GetMapping("/")
    @ApiOperation(value="素材を返します。", nickname="material_getAll")
    public ResponseEntity<List<Material>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
