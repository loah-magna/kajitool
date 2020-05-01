package kajitool.web.service.recipelist;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kajitool.web.view.model.RecipeListView;
import kajitool.web.view.repository.RecipeListViewRepository;

@Service
@Transactional
public class RecipeListViewService {
    private final RecipeListViewRepository recipeListViewRepository;

    public RecipeListViewService(
            final RecipeListViewRepository recipeListViewRepository) {
        this.recipeListViewRepository = recipeListViewRepository;
    }
    public List<RecipeListView> findAll() {
        return recipeListViewRepository.selectAll();
    }
}