package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alan on 21/06/2017.
 */
@Repository
public class ProductDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Product product){
        manager.persist(product);
    }
}
