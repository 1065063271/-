package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.bookid
     *
     * @mbggenerated
     */
    private Integer bookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.bookname
     *
     * @mbggenerated
     */
    private String bookname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.printwhere
     *
     * @mbggenerated
     */
    private String printwhere;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.printdate
     *
     * @mbggenerated
     */
    private Date printdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktable.note
     *
     * @mbggenerated
     */
    private String note;
    private String booktype;
    private Integer brrownum;
    private Integer flowernum;
    private String photoadd;

    public String getBooketype() {
        return booktype;
    }

    public void setBooketype(String booketype) {
        this.booktype = booketype;
    }

    public Integer getBrrownum() {
        return brrownum;
    }

    public void setBrrownum(Integer brrownum) {
        this.brrownum = brrownum;
    }

    public Integer getFlowernum() {
        return flowernum;
    }

    public void setFlowernum(Integer flowernum) {
        this.flowernum = flowernum;
    }

    public String getPhotoadd() {
        return photoadd;
    }

    public void setPhotoadd(String photoadd) {
        this.photoadd = photoadd;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table booktable
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.bookid
     *
     * @return the value of booktable.bookid
     *
     * @mbggenerated
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.bookid
     *
     * @param bookid the value for booktable.bookid
     *
     * @mbggenerated
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.bookname
     *
     * @return the value of booktable.bookname
     *
     * @mbggenerated
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.bookname
     *
     * @param bookname the value for booktable.bookname
     *
     * @mbggenerated
     */
    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.author
     *
     * @return the value of booktable.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.author
     *
     * @param author the value for booktable.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.printwhere
     *
     * @return the value of booktable.printwhere
     *
     * @mbggenerated
     */
    public String getPrintwhere() {
        return printwhere;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.printwhere
     *
     * @param printwhere the value for booktable.printwhere
     *
     * @mbggenerated
     */
    public void setPrintwhere(String printwhere) {
        this.printwhere = printwhere == null ? null : printwhere.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.printdate
     *
     * @return the value of booktable.printdate
     *
     * @mbggenerated
     */
    public Date getPrintdate() {
        return printdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.printdate
     *
     * @param printdate the value for booktable.printdate
     *
     * @mbggenerated
     */
    public void setPrintdate(Date printdate) {
        this.printdate = printdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.introduction
     *
     * @return the value of booktable.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.introduction
     *
     * @param introduction the value for booktable.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktable.note
     *
     * @return the value of booktable.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktable.note
     *
     * @param note the value for booktable.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booktable
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getBookname() == null ? other.getBookname() == null : this.getBookname().equals(other.getBookname()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPrintwhere() == null ? other.getPrintwhere() == null : this.getPrintwhere().equals(other.getPrintwhere()))
            && (this.getPrintdate() == null ? other.getPrintdate() == null : this.getPrintdate().equals(other.getPrintdate()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booktable
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getBookname() == null) ? 0 : getBookname().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPrintwhere() == null) ? 0 : getPrintwhere().hashCode());
        result = prime * result + ((getPrintdate() == null) ? 0 : getPrintdate().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booktable
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookid=").append(bookid);
        sb.append(", bookname=").append(bookname);
        sb.append(", author=").append(author);
        sb.append(", printwhere=").append(printwhere);
        sb.append(", printdate=").append(printdate);
        sb.append(", introduction=").append(introduction);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}