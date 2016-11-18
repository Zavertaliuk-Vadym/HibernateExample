package com.mkyong;

import java.util.List;

import com.mkyong.stock.ListName;
import com.mkyong.stock.Task;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();


        Criteria criteria =  session.createCriteria(ListName.class);
        List<ListName> tasks = (List<ListName>) criteria.list();
        for (ListName listName:tasks) {
            System.out.println(listName.getId()+"!"+listName.getName());
        }
//
//		Stock stock = new Stock();
//        stock.setStockCode("7052");
//        stock.setStockName("PADINI");
//        session.save(stock);
//
//        StockDailyRecord stockDailyRecords = new StockDailyRecord();
//        stockDailyRecords.setPriceOpen(new Float("1.2"));
//        stockDailyRecords.setPriceClose(new Float("1.1"));
//        stockDailyRecords.setPriceChange(new Float("10.0"));
//        stockDailyRecords.setVolume(3000000L);
//        stockDailyRecords.setDate(new Date());
//
//        stockDailyRecords.setStock(stock);
//        stock.getStockDailyRecords().add(stockDailyRecords);
//
//        session.save(stockDailyRecords);
//for (Task task :listName.getId )
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}
}
