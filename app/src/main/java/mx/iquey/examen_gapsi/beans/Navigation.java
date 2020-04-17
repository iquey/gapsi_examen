
package mx.iquey.examen_gapsi.beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Navigation {

    @SerializedName("ancester")
    @Expose
    private List<Object> ancester = null;
    @SerializedName("current")
    @Expose
    private List<Current> current = null;
    @SerializedName("childs")
    @Expose
    private List<Object> childs = null;

    public List<Object> getAncester() {
        return ancester;
    }

    public void setAncester(List<Object> ancester) {
        this.ancester = ancester;
    }

    public List<Current> getCurrent() {
        return current;
    }

    public void setCurrent(List<Current> current) {
        this.current = current;
    }

    public List<Object> getChilds() {
        return childs;
    }

    public void setChilds(List<Object> childs) {
        this.childs = childs;
    }

}
