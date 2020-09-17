package controller;

import command.ProductCommand;
import dao.ProductDAO;
import dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDAO;
    @RequestMapping(value = "/product.html")
    public String Index(ProductCommand command, Model model){
        List<ProductDTO> list= new ArrayList<>();
        command.setListResutl(list);
        model.addAttribute("items",command);
        return "product.index";
    }
}
