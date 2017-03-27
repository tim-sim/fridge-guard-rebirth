package org.fridgeguard.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.fridgeguard.model.ProductType;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * ProductItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

public class ProductItem   {
  @JsonProperty("type")
  private ProductType type = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("requred_quantity")
  private Integer requredQuantity = null;

  @JsonProperty("actual_quantity")
  private Integer actualQuantity = null;

  @JsonProperty("purchase_date")
  private LocalDate purchaseDate = null;

  @JsonProperty("expiry_date")
  private LocalDate expiryDate = null;

  public ProductItem type(ProductType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ProductType getType() {
    return type;
  }

  public void setType(ProductType type) {
    this.type = type;
  }

  public ProductItem unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ProductItem requredQuantity(Integer requredQuantity) {
    this.requredQuantity = requredQuantity;
    return this;
  }

   /**
   * Get requredQuantity
   * @return requredQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getRequredQuantity() {
    return requredQuantity;
  }

  public void setRequredQuantity(Integer requredQuantity) {
    this.requredQuantity = requredQuantity;
  }

  public ProductItem actualQuantity(Integer actualQuantity) {
    this.actualQuantity = actualQuantity;
    return this;
  }

   /**
   * Get actualQuantity
   * @return actualQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getActualQuantity() {
    return actualQuantity;
  }

  public void setActualQuantity(Integer actualQuantity) {
    this.actualQuantity = actualQuantity;
  }

  public ProductItem purchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }

   /**
   * Get purchaseDate
   * @return purchaseDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public ProductItem expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductItem productItem = (ProductItem) o;
    return Objects.equals(this.type, productItem.type) &&
        Objects.equals(this.unit, productItem.unit) &&
        Objects.equals(this.requredQuantity, productItem.requredQuantity) &&
        Objects.equals(this.actualQuantity, productItem.actualQuantity) &&
        Objects.equals(this.purchaseDate, productItem.purchaseDate) &&
        Objects.equals(this.expiryDate, productItem.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, unit, requredQuantity, actualQuantity, purchaseDate, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    requredQuantity: ").append(toIndentedString(requredQuantity)).append("\n");
    sb.append("    actualQuantity: ").append(toIndentedString(actualQuantity)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

