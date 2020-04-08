package kajitool.web.domain.model;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe{
	private Long id;
	private String name;
	private int version;
	private Date updatedAt;
	private List<RecipeDetail> recipeDetails;
}