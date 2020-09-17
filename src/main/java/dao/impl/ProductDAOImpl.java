package dao.impl;

import dao.ProductDAO;
import domain.Employee;
import domain.Product;
import dto.ProductDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pagination.PaginationResult;
import utils.HibernateUtils;

import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public List<ProductDTO> getProductList(int page, int maxResult, int maxNavigationPage) {
        SessionFactory factory = HibernateUtils.getSessionFactory();

        Session session = factory.getCurrentSession();

        String sql = "Select * from " + Product.class.getName() ;
        Query<Product> query = session.createQuery(sql, Product.class);
        PaginationResult<Product> result = new PaginationResult<Product>(query, page, maxResult, maxNavigationPage);
        List<Product> products = result.getList();
        return null;
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
