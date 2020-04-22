package kajitool.web.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kajitool.web.domain.model.Recipe;
import kajitool.web.service.recipe.RecipeService;

@RestController
@RequestMapping("/api/v1/recipe")
@CrossOrigin
public class RecipeResource {
    private final RecipeService service;

    public RecipeResource(RecipeService service) {
        this.service = service;
    }
    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody final Recipe recipe) {
        Recipe created = service.create(recipe);
        return ResponseEntity.created(
                URI.create("/api/v1/recipe/" + created.getId())
        ).build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> get(@PathVariable final long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody final Recipe recipe) {
        service.save(recipe);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable final long id,
            @RequestParam("version") final int version) {
        service.remove(id, version);
        return ResponseEntity.ok().build();
    }
}