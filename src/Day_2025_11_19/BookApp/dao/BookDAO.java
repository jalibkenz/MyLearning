package Day_2025_11_19.BookApp.dao;

import Day_2025_11_19.BookApp.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Balarama",100));
        books.add(new Book(1,"Readers Digest",100));
        books.add(new Book(1,"Vanitha",50));
        books.add(new Book(1,"Bala Managalam",50));
        return books;
    }
}
