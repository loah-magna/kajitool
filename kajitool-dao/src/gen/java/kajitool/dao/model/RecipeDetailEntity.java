package kajitool.dao.model;

import java.io.Serializable;

public class RecipeDetailEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RECIPE_DETAIL.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RECIPE_DETAIL.RECIPE_ID
     *
     * @mbg.generated
     */
    private Long recipeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RECIPE_DETAIL.MATERIAL_ID
     *
     * @mbg.generated
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RECIPE_DETAIL.QUANTITY
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PUBLIC.RECIPE_DETAIL
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RECIPE_DETAIL.ID
     *
     * @return the value of PUBLIC.RECIPE_DETAIL.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RECIPE_DETAIL.ID
     *
     * @param id the value for PUBLIC.RECIPE_DETAIL.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RECIPE_DETAIL.RECIPE_ID
     *
     * @return the value of PUBLIC.RECIPE_DETAIL.RECIPE_ID
     *
     * @mbg.generated
     */
    public Long getRecipeId() {
        return recipeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RECIPE_DETAIL.RECIPE_ID
     *
     * @param recipeId the value for PUBLIC.RECIPE_DETAIL.RECIPE_ID
     *
     * @mbg.generated
     */
    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RECIPE_DETAIL.MATERIAL_ID
     *
     * @return the value of PUBLIC.RECIPE_DETAIL.MATERIAL_ID
     *
     * @mbg.generated
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RECIPE_DETAIL.MATERIAL_ID
     *
     * @param materialId the value for PUBLIC.RECIPE_DETAIL.MATERIAL_ID
     *
     * @mbg.generated
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RECIPE_DETAIL.QUANTITY
     *
     * @return the value of PUBLIC.RECIPE_DETAIL.QUANTITY
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RECIPE_DETAIL.QUANTITY
     *
     * @param quantity the value for PUBLIC.RECIPE_DETAIL.QUANTITY
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.RECIPE_DETAIL
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recipeId=").append(recipeId);
        sb.append(", materialId=").append(materialId);
        sb.append(", quantity=").append(quantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}