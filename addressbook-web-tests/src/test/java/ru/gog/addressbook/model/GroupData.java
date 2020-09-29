package ru.gog.addressbook.model;
//comment
public class GroupData {
    private final String name;
    private final String header;
    private final String footer;
    //comment
    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }//comment

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }
    //comment

    public String getFooter() {
        return footer;
    }
}//comment
