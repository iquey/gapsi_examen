
package mx.iquey.examen_gapsi.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Productos {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("pageType")
    @Expose
    private String pageType;
    @SerializedName("plpResults")
    @Expose
    private PlpResults plpResults;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public PlpResults getPlpResults() {
        return plpResults;
    }

    public void setPlpResults(PlpResults plpResults) {
        this.plpResults = plpResults;
    }

}
