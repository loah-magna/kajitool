package kajitool.web.domain.model;

import lombok.*;

@Getter
@Setter
public class RecipeDetail {
    private Long id;
    private long recipeId;
    private long materialId;
    private int quantity;
}