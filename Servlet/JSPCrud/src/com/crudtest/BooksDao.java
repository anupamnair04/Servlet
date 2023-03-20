package com.crudtest;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
public class BooksDao {
	
    Connection con;

    public BooksDao(Connection con) {
        this.con = con;
    }
    
    //add books information to database
    public boolean addBook(books book){
        boolean test = false;
        try{
            String query =  "insert into books (bName,bDesc,aName,cat) values(?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, book.getBookName());
            pst.setString(2, book.getBookDesc());
            pst.setString(3, book.getAuthName());
            pst.setString(4, book.getCat());
            pst.executeUpdate();
            test= true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return test;
    }
    
    //retrieve the book details from database
    public List<books> getAllBooks(){
        List<books> book = new ArrayList<>();
        try{  
            String query = "select * from books";
            PreparedStatement pt = this.con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String bname = rs.getString("bName");
                String des = rs.getString("bDesc");
                String aname = rs.getString("aName");
                String cat = rs.getString("cat");
                
                books row = new books(id,bname,des,aname,cat);
                book.add(row);
            }
        }catch(Exception e){
            e.printStackTrace();;
        }
        return book;
    }
    
    //eidt book information
    public void editBookInfo(books book){
        
        try{
            String query = "update books set bName=?, bDesc=?, aName=?, cat=? where id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, book.getBookName());
            pt.setString(2, book.getBookDesc());
            pt.setString(3, book.getAuthName());
            pt.setString(4, book.getCat());
            pt.setInt(5, book.getId()); 
            pt.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();;
        }
    }
    
    //get single book information in edit page
    public books getSingleBook(int id){
        books bk = null;
        
        try{
            String query = "select * from books where id=? ";
   
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, id);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next()){
                int bid = rs.getInt("id");
                String bnm = rs.getString("bName");
                String bdes = rs.getString("bDesc");
                String anm = rs.getString("aName");
                String cat  = rs.getString("cat");
                bk = new books(bid,bnm,bdes,anm,cat);
            }
        }catch(Exception ex){
            ex.printStackTrace();;
        }
        return bk;
    }
     
    //delete books from database
    public void deleteBook(int id){
        try{
            
           String query= "delete from books where id=?";
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1, id);
           pt.execute();   
        }catch(Exception ex){
            ex.printStackTrace();;
        }
    }
}