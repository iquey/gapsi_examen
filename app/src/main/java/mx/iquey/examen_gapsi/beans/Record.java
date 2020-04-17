
package mx.iquey.examen_gapsi.beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("skuRepositoryId")
    @Expose
    private String skuRepositoryId;
    @SerializedName("productDisplayName")
    @Expose
    private String productDisplayName;
    @SerializedName("productType")
    @Expose
    private String productType;
    @SerializedName("productRatingCount")
    @Expose
    private Integer productRatingCount;
    @SerializedName("productAvgRating")
    @Expose
    private Double productAvgRating;
    @SerializedName("listPrice")
    @Expose
    private Double listPrice;
    @SerializedName("minimumListPrice")
    @Expose
    private Double minimumListPrice;
    @SerializedName("maximumListPrice")
    @Expose
    private Double maximumListPrice;
    @SerializedName("promoPrice")
    @Expose
    private Double promoPrice;
    @SerializedName("minimumPromoPrice")
    @Expose
    private Double minimumPromoPrice;
    @SerializedName("maximumPromoPrice")
    @Expose
    private Double maximumPromoPrice;
    @SerializedName("isHybrid")
    @Expose
    private Boolean isHybrid;
    @SerializedName("isMarketPlace")
    @Expose
    private Boolean isMarketPlace;
    @SerializedName("smImage")
    @Expose
    private String smImage;
    @SerializedName("lgImage")
    @Expose
    private String lgImage;
    @SerializedName("xlImage")
    @Expose
    private String xlImage;
    @SerializedName("groupType")
    @Expose
    private String groupType;
    @SerializedName("plpFlags")
    @Expose
    private List<Object> plpFlags = null;
    @SerializedName("variantsColor")
    @Expose
    private List<VariantsColor> variantsColor = null;
    @SerializedName("marketplaceSLMessage")
    @Expose
    private String marketplaceSLMessage;
    @SerializedName("marketplaceBTMessage")
    @Expose
    private String marketplaceBTMessage;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuRepositoryId() {
        return skuRepositoryId;
    }

    public void setSkuRepositoryId(String skuRepositoryId) {
        this.skuRepositoryId = skuRepositoryId;
    }

    public String getProductDisplayName() {
        return productDisplayName;
    }

    public void setProductDisplayName(String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductRatingCount() {
        return productRatingCount;
    }

    public void setProductRatingCount(Integer productRatingCount) {
        this.productRatingCount = productRatingCount;
    }

    public Double getProductAvgRating() {
        return productAvgRating;
    }

    public void setProductAvgRating(Double productAvgRating) {
        this.productAvgRating = productAvgRating;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getMinimumListPrice() {
        return minimumListPrice;
    }

    public void setMinimumListPrice(Double minimumListPrice) {
        this.minimumListPrice = minimumListPrice;
    }

    public Double getMaximumListPrice() {
        return maximumListPrice;
    }

    public void setMaximumListPrice(Double maximumListPrice) {
        this.maximumListPrice = maximumListPrice;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getMinimumPromoPrice() {
        return minimumPromoPrice;
    }

    public void setMinimumPromoPrice(Double minimumPromoPrice) {
        this.minimumPromoPrice = minimumPromoPrice;
    }

    public Double getMaximumPromoPrice() {
        return maximumPromoPrice;
    }

    public void setMaximumPromoPrice(Double maximumPromoPrice) {
        this.maximumPromoPrice = maximumPromoPrice;
    }

    public Boolean getIsHybrid() {
        return isHybrid;
    }

    public void setIsHybrid(Boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    public Boolean getIsMarketPlace() {
        return isMarketPlace;
    }

    public void setIsMarketPlace(Boolean isMarketPlace) {
        this.isMarketPlace = isMarketPlace;
    }

    public String getSmImage() {
        return smImage;
    }

    public void setSmImage(String smImage) {
        this.smImage = smImage;
    }

    public String getLgImage() {
        return lgImage;
    }

    public void setLgImage(String lgImage) {
        this.lgImage = lgImage;
    }

    public String getXlImage() {
        return xlImage;
    }

    public void setXlImage(String xlImage) {
        this.xlImage = xlImage;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public List<Object> getPlpFlags() {
        return plpFlags;
    }

    public void setPlpFlags(List<Object> plpFlags) {
        this.plpFlags = plpFlags;
    }

    public List<VariantsColor> getVariantsColor() {
        return variantsColor;
    }

    public void setVariantsColor(List<VariantsColor> variantsColor) {
        this.variantsColor = variantsColor;
    }

    public String getMarketplaceSLMessage() {
        return marketplaceSLMessage;
    }

    public void setMarketplaceSLMessage(String marketplaceSLMessage) {
        this.marketplaceSLMessage = marketplaceSLMessage;
    }

    public String getMarketplaceBTMessage() {
        return marketplaceBTMessage;
    }

    public void setMarketplaceBTMessage(String marketplaceBTMessage) {
        this.marketplaceBTMessage = marketplaceBTMessage;
    }

}
