package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import models.entities.Department;
import models.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(1, null));
        SellerDao sellerDao = DaoFactory.createSellerDao();
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());



        }

    }

