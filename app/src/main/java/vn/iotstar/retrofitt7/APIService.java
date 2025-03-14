package vn.iotstar.retrofitt7;

import java.util.List;
import java.util.Locale;

import retrofit2.http.GET;
import retrofit2.Call;

public interface APIService {
    @GET("categories.php")
    Call<List<Category>> getCategories();
}
