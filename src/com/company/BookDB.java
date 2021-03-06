package com.company;

public class BookDB {

    public static Book getBook(String value) {
        Book b = new Book();
        if (value.equals("Java1001")){
            b.setSku("Java1001");
            b.setBookTitle("Head First Java");
            b.setAuthor("Kathy Sierra and Bert Bates");
            b.setDescription("Easy to read java workbook");
            b.setPrice(47.50);
            b.setIsInStock(true);
        } else if (value.equals("Java1002")) {
            b.setSku("java1002");
            b.setBookTitle("Thinking in Java");
            b.setAuthor("Bruce Eckel");
            b.setDescription("Details about Java under the hood");
            b.setPrice(20.00);
            b.setIsInStock(false);
        } else if (value.equals("Orcl1003")) {
            b.setSku("Orcl1003");
            b.setBookTitle("OCP: Oracle Certified Professional Java SE");
            b.setAuthor("Jeanne Boyarsky");
            b.setDescription("Everything you need to know in one place");
            b.setPrice(45.00);
            b.setIsInStock(true);
        } else if (value.equals("Python1004")) {
            b.setSku("Python1004");
            b.setBookTitle("Automate the Boring Stuff with Python");
            b.setAuthor("Al Sweigart");
            b.setDescription("Fun with Python");
            b.setPrice(10.50);
            b.setIsInStock(true);
        } else if (value.equals("Zombie1005")) {
            b.setSku("Zombie1005");
            b.setBookTitle("The Maker's Guide to the Zombie Apocalypse");
            b.setAuthor("Simon Monk");
            b.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
            b.setPrice(16.50);
            b.setIsInStock(true);
        } else if (value.equals("Rasp1006")){
            b.setSku("Rasp1006");
            b.setBookTitle("Raspberry Pi Projects for the Evil Genius");
            b.setAuthor("Donald Norris");
            b.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
            b.setPrice(14.75);
            b.setIsInStock(true);
        }
        return b;
    }
}