package org.fridgeguard.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * HealthStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

public class HealthStatus {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("totalFriges")
  private Integer totalFriges = null;

  @JsonProperty("totalItems")
  private Integer totalItems = null;

  @JsonProperty("totalExpiredItems")
  private Integer totalExpiredItems = null;

  public HealthStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Service status
   * @return status
  **/
  @ApiModelProperty(value = "Service status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HealthStatus totalFriges(Integer totalFriges) {
    this.totalFriges = totalFriges;
    return this;
  }

   /**
   * Amount of configured fridges
   * @return totalFriges
  **/
  @ApiModelProperty(value = "Amount of configured fridges")
  public Integer getTotalFriges() {
    return totalFriges;
  }

  public void setTotalFriges(Integer totalFriges) {
    this.totalFriges = totalFriges;
  }

  public HealthStatus totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Amount of product items stored in all friges
   * @return totalItems
  **/
  @ApiModelProperty(value = "Amount of product items stored in all friges")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public HealthStatus totalExpiredItems(Integer totalExpiredItems) {
    this.totalExpiredItems = totalExpiredItems;
    return this;
  }

   /**
   * Amount of expired product items
   * @return totalExpiredItems
  **/
  @ApiModelProperty(value = "Amount of expired product items")
  public Integer getTotalExpiredItems() {
    return totalExpiredItems;
  }

  public void setTotalExpiredItems(Integer totalExpiredItems) {
    this.totalExpiredItems = totalExpiredItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthStatus healthStatus = (HealthStatus) o;
    return Objects.equals(this.status, healthStatus.status) &&
        Objects.equals(this.totalFriges, healthStatus.totalFriges) &&
        Objects.equals(this.totalItems, healthStatus.totalItems) &&
        Objects.equals(this.totalExpiredItems, healthStatus.totalExpiredItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, totalFriges, totalItems, totalExpiredItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalFriges: ").append(toIndentedString(totalFriges)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalExpiredItems: ").append(toIndentedString(totalExpiredItems)).append("\n");
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

