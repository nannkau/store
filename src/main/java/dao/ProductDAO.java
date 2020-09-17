package dao;

import domain.Product;
import dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    public List<ProductDTO> getProductList(int page, int maxResult, int maxNavigationPage);
    public List<ProductDTO> searchProductsbyType();
    public List<ProductDTO> searchProductsbyPrice();
    public List<ProductDTO> sortProductsbyPrice();
    public List<ProductDTO> sortProductsbyUnPrice();
}
