package Day_2025_11_19.BookApp.service;

import Day_2025_11_19.BookApp.dao.BookDAO;
import Day_2025_11_19.BookApp.model.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

   public List<Book> getBooksInSort(){
       List<Book> books = new BookDAO().getBooks();
       Collections.sort(books, new BookComparator());
       return books;
    }

    public static void main(String[] args) {
        List<Book> booksInSort = new BookService().getBooksInSort();
        System.out.println(booksInSort);
    }
}

class BookComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName()); // Ascending order | to change to Descending change o2 and o1 positions
    }
}