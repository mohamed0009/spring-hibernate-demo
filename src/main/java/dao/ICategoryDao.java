package dao;

import entities.Category;
import java.util.List;

public interface ICategoryDao extends IDao<Category> {
    // Méthodes spécifiques aux catégories si nécessaire
    List<Category> findByName(String name);
}