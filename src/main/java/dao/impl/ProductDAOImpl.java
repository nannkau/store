package dao.impl;

import dao.ProductDAO;
import domain.Employee;
import domain.Product;
import dto.ProductDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pagination.PaginationResult;
import utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;
@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO  {
    @Override
    public List<ProductDTO> getProductList(int page, int maxResult, int maxNavigationPage) {
        SessionFactory factory = HibernateUtils.getSessionFactory();

        Session session = factory.getCurrentSession();

        String sql = "Select * from " + Product.class.getName() ;
        Query<Product> query = session.createQuery(sql, Product.class);
        PaginationResult<Product> result = new PaginationResult<Product>(query, page, maxResult, maxNavigationPage);
        List<Product> products = result.getList();
        List<ProductDTO> productDTOS= new ArrayList<>();
        for (Product p: products
             ) {
            ModelMapper modelMapper = new ModelMapper();
            ProductDTO productDTO = modelMapper.map(p, ProductDTO.class);
            productDTOS.add(productDTO);

        }

        return productDTOS;
    }

    @Override
    public List<ProductDTO> searchProductsbyType() {
        return null;
    }

    @Override
    public List<ProductDTO> searchProductsbyPrice() {
        return null;
    }

    @Override
    public List<ProductDTO> sortProductsbyPrice() {
        return null;
    }

    @Override
    public List<ProductDTO> sortProductsbyUnPrice() {
        return null;
    }
}
