/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio.datos.dao;

import directorio.datos.entidades.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author denar
 */
public class DirectorioDAO {
    final private static EntityManager em = Persistence.createEntityManagerFactory("directorioPU").createEntityManager();
    private static DirectorioDAO directorioDAO = null;
    
    private DirectorioDAO()
    {
        
    }
    
    public static DirectorioDAO getDirectorioDAO()
    {
        if(DirectorioDAO.directorioDAO == null)
        {
            DirectorioDAO.directorioDAO = new DirectorioDAO();
        }
        return DirectorioDAO.directorioDAO;
    }  
    
    public void addContact(Contact nuevo) throws Exception {
        em.getTransaction().begin();
        em.persist(nuevo);
        em.getTransaction().commit();
//        em.close();
    }
    
    public void editContact(Contact existe) throws Exception {
        em.getTransaction().begin();
        em.merge(existe);
        em.getTransaction().commit();
//        em.close();
    }
    
    public void setContactsAsActive(List<Contact> contacts) throws Exception
    {
        em.getTransaction().begin();
        for(Contact contact : contacts)
        {
            em.merge(contact);
        }
        em.getTransaction().commit();
    }
    
    public List<Contact> getAllContacts()
    {
        Query query = em.createQuery("SELECT c FROM Contact c order by c.contactname ASC");
        return (List<Contact>) query.getResultList();
    }    
    
    public boolean contactNameExists(String contactName) throws Exception
    {
        contactName = contactName.trim();
        String queryString = "SELECT c.contactid FROM Contact c WHERE lower(c.contactname) = lower(:contactName)";
        Query query = em.createQuery(queryString);
        query.setParameter("contactName", contactName);
        return !query.getResultList().isEmpty();
    }
    
    public List<Contact> getActiveContacts()
    {
        Query query = em.createQuery("SELECT c FROM Contact c WHERE c.contactenable = 1  ORDER BY c.contactname ASC");
        return (List<Contact>) query.getResultList();
    }
    
    public List<Contact> getInactiveContacts()
    {
        Query query = em.createQuery("SELECT c FROM Contact c WHERE c.contactenable = 0 ORDER BY c.contactname ASC");
        return (List<Contact>) query.getResultList();
    }
    
    public List<Contact> findContactsByCharName(String name)
    {
        Query query = em.createQuery("SELECT c FROM Contact c WHERE c.contactenable = 1 AND lower(c.contactname) LIKE lower(:charName) ORDER BY c.contactname ASC");
        query.setParameter("charName", "%"+name+"%");
        return query.getResultList();
        
            
        
    }
}
