
package mx.iquey.examen_gapsi.beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlpResults {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("plpState")
    @Expose
    private PlpState plpState;
    @SerializedName("sortOptions")
    @Expose
    private List<SortOption> sortOptions = null;
    @SerializedName("refinementGroups")
    @Expose
    private List<RefinementGroup> refinementGroups = null;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;
    @SerializedName("navigation")
    @Expose
    private Navigation navigation;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PlpState getPlpState() {
        return plpState;
    }

    public void setPlpState(PlpState plpState) {
        this.plpState = plpState;
    }

    public List<SortOption> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOption> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public List<RefinementGroup> getRefinementGroups() {
        return refinementGroups;
    }

    public void setRefinementGroups(List<RefinementGroup> refinementGroups) {
        this.refinementGroups = refinementGroups;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

}
