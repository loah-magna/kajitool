package kajitool.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kajitool.web.service.recipelist.RecipeListViewService;
import kajitool.web.view.model.RecipeListView;

@RestController
@RequestMapping("/api/v1/recipe_list_view")
@CrossOrigin
public class RecipeListViewResource {
    private final RecipeListViewService service;

    public RecipeListViewResource(RecipeListViewService service) {
        this.service = service;
    }
    @GetMapping("")
    public ResponseEntity<List<RecipeListView>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
}