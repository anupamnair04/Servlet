<%@page import="java.util.List"%>
<%@page import="com.crudtest.books"%>
<%@page import="com.crudtest.ConnectionDao"%>
<%@page import="com.crudtest.BooksDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%
    BooksDao bookData = new BooksDao(ConnectionDao.getCon());
    List<books> book = bookData.getAllBooks();
    request.setAttribute("BOOKS_LIST", book);
%>

<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

        <title>CRUD Application</title>

        <style>
            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
    <body>
        <div  class="container-fluid">
           <nav class="navbar navbar-light">
             <a class="navbar-brand">Book Store</a>
             <form class="form-inline">
             <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
             <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
             </form>
</nav>
</div>
<div class="container">
            <div class="inner">
              <div class="row">
                <div class="col-md-3">
                 <h3>Input Book Information</h3>
                 <form action="AddBooksServlet" method="post">
                  <div class="form-group">
                    <label>Book Name</label>
                    <input class="form-control" name="bkname" required>
              </div>
<div class="form-group">
 <label>Description</label>
  <input class="form-control" name="bkdes" required>
</div>
<div class="form-group">
  <label>Author Name</label>
    <input class="form-control" name="authname" required>
</div>
<div class="form-group" >
  <label>Category</label>
    <select id="inputState" class="form-control" name="category" required>
      <option selected disabled>Choose Category</option>
      <option value="Novel">Novel</option>
      <option value="Science Fiction">Science Fiction</option>
      <option value="Drama">Drama</option>
      <option value="Programming & Development">Programming & Development</option>
    </select>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-primary">Reset</button>
</form>
</div>
<div class="col-md-9">
  <h3>Book Information From Database</h3>
    <table class="table">
    <thead class="bg-light">
      <tr>
          <th scope="col">Book Name</th>
           <th scope="col">Description</th>
             <th scope="col">Author</th>
               <th scope="col">Category</th>
                 <th scope="col">Action</th>
      </tr>
</thead>
<tbody>
  <c:forEach var="tempBook" items="${BOOKS_LIST}">
<tr>
    <td>${tempBook.bookName }</td>
    <td>${tempBook.bookDesc }</td>
    <td>${tempBook.authName }</td>
    <td>${tempBook.cat}</td>
    <td><a href="editbook.jsp?id=${tempBook.id }">Edit</a> 
    <a href="DeleteBookServlet?id=${tempBook.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div>
</div>
</div>
<!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>