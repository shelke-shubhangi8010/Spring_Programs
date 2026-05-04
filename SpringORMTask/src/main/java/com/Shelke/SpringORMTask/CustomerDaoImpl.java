package com.Shelke.SpringORMTask;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository   
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;  // ✅ only one variable

    @Override
    @Transactional
    public int create(Customer customer) {
        Integer id = (Integer) hibernateTemplate.save(customer);
        return id;
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        hibernateTemplate.update(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        hibernateTemplate.delete(customer);
    }

    @Override
    @Transactional
    public Customer find(int id) {
        return hibernateTemplate.get(Customer.class, id);
    }

    @Override
    @Transactional
    public List<Customer> findAll() {
        return hibernateTemplate.loadAll(Customer.class);
    }
}
