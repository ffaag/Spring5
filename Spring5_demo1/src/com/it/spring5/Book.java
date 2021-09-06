package com.it.spring5;

/**
 * @author ZuYingFang
 * @time 2021-07-03 17:28
 */
public class Book {

    private String bname;
    private String bauthor;
    private String baddress;
    private String bid;

    public Book(String bname, String bauthor) {
        this.bname = bname;
        this.bauthor = bauthor;
    }

    public Book() {
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", baddress='" + baddress + '\'' +
                '}';
    }
}
