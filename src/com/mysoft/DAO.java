package com.mysoft;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daria on 21.10.2016.
 */
public class DAO {
    static List<Book> books;
    static {
        books = new ArrayList<>();
        books.add(new Book(1, "One"));
        books.add(new Book(2, "Two"));
        books.add(new Book(3, "Three"));
    }

    public static List<Book> getBooks()
    {
        return books;
    }

    public static void deleteBook(int id)
    {
        Book d = null;
        for (Book b : books)
        {
            if(b.getId() == id)
            {
                d = b;
            }
        }
        if(d != null)
        {
            books.remove(d);
        }
    }

    public static void addBook(String txt) {
        books.add(new Book((books.size()+1), txt));
    }
}
