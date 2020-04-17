
package mx.iquey.examen_gapsi.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SortOption {

    @SerializedName("sortBy")
    @Expose
    private String sortBy;
    @SerializedName("label")
    @Expose
    private String label;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
