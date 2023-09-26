package kr.ed.haebeop.test.proxy;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {
    public void rent(Book book) {
        System.out.println("rent: " + book.getTitle());
    }
}
