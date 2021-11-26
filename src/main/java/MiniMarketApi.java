import org.apache.log4j.Category;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public class MiniMarketApi {
    @GET("api/v1/categories/{id}")
    Call<Category> getCategory(@Path("id") Long id) {
        return null;
    }

    @GET("api/v1/products")
    Call<List<Product>> getProducts() {
        return null;
    }

    @GET("api/v1/products/{id}")
    Call<Product> getProduct(@Path("id") Long id) {
        return null;
    }

    @POST("api/v1/products")
    Call<Product> createProduct(@Body Product product) {
        return null;
    }

    @PUT("api/v1/products")
    Call<Product> updateProduct(@Body Product product) {
        return null;
    }

    @DELETE("api/v1/products/{id}")
    Call<Object> deleteProduct(@Path("id") Long id) {
        return null;
    }

}
