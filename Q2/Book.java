public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    
    public Book(String title, String author, String publisher, int copiesSold) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }

     public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    public void setCopiesSold(int copiesSold){
        this.copiesSold=copiesSold;
    }

    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
   
    public String getPublisher(){
        return publisher;
    }
    
    public int getCopiesSold(){
        return copiesSold;
    }    
    

}




