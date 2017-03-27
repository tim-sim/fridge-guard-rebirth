package org.fridgeguard.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fridgeguard.model.ProductItem;
import org.fridgeguard.model.UserView;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * FridgeContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

public class FridgeContent   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner")
  private UserView owner = null;

  @JsonProperty("items")
  private List<ProductItem> items = new ArrayList<ProductItem>();

  public FridgeContent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FridgeContent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FridgeContent owner(UserView owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public UserView getOwner() {
    return owner;
  }

  public void setOwner(UserView owner) {
    this.owner = owner;
  }

  public FridgeContent items(List<ProductItem> items) {
    this.items = items;
    return this;
  }

  public FridgeContent addItemsItem(ProductItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ProductItem> getItems() {
    return items;
  }

  public void setItems(List<ProductItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FridgeContent fridgeContent = (FridgeContent) o;
    return Objects.equals(this.title, fridgeContent.title) &&
        Objects.equals(this.description, fridgeContent.description) &&
        Objects.equals(this.owner, fridgeContent.owner) &&
        Objects.equals(this.items, fridgeContent.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, owner, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FridgeContent {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

