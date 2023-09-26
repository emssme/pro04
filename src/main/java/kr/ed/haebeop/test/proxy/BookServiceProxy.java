package kr.ed.haebeop.test.proxy;

public class BookServiceProxy implements BookService{
    //프록시는 BookServiceImpl과 같은 구현체를 가지고 있어야함(delegate -> )
    private BookServiceImpl bookService;
    //BookServiceImpl(구현체)fmf todtjdwkfh wndlq
    public BookServiceProxy(BookServiceImpl bookService) {
        this.bookService = bookService;
    }
    //프록시에서 주기능에 부가기능을 추가

    @Override
    public void rent(Book book) {
        System.out.println("트랜잭션 처리"); //부가기능
        bookService.rent(book); // 프록시 -> 핵심기능
        System.out.println("로깅"); //부가기능
    }
}


