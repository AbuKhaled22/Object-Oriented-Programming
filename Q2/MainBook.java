public class MainBook {
    public static void main(String[] args){
        Book book1 = new Book("life","Ahmed","news company",200 );
        System.out.println("Title: "+ book1.getTitle());
        System.out.println("Author: "+ book1.getAuthor());
        System.out.println("Publisher: "+book1.getPublisher());
        System.out.println("CopiesSold: "+ book1.getCopiesSold());
        System.out.println("====================================\n Update:\n");
        book1.setTitle("The world");
        book1.setAuthor("Ali");
        book1.setPublisher("news company");
        book1.setCopiesSold(300);
        System.out.println("Title: "+ book1.getTitle());
        System.out.println("Author: "+ book1.getAuthor());
        System.out.println("Publisher: "+book1.getPublisher());
        System.out.println("CopiesSold: "+ book1.getCopiesSold());



        
    } 
}
