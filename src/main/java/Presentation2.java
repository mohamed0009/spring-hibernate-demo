import dao.IDao;
import entities.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HibernateConfig.class)) {
            @SuppressWarnings("unchecked")
            IDao<Product> productDao = (IDao<Product>) context.getBean("productDaoImpl");

            Product product = new Product();
            product.setName("Produit 1");
            product.setPrice(100.0);

            try {
                productDao.create(product);
                System.out.println("Produit sauvegardé : " + product.getName());
            } catch (Exception e) {
                System.err.println("Erreur lors de la création du produit : " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}