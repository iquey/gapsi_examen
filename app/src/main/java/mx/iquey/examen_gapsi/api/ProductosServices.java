package mx.iquey.examen_gapsi.api;

import mx.iquey.examen_gapsi.beans.Productos;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductosServices {

    @GET("services/v3/plp")
    Call<Productos> getTProduct(
            @Query("force-plp") Boolean forcePlp,
            @Query("search-string") String searchString,
            @Query("page-number") int pageNumber,
            @Query("number-of-items-per-page") int numberOfItemsPerPage
    );
}
