//Michael Regis de Almeida Cb 1740334
//Marcos Vinicius Cb 1740261
public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[4];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'f');
        authors[2] = new Author("Autor 03", "autor03@nowhere.com.br", 'm');
        authors[3] = new Author("Autor 04", "autor04@nowhere.com.br", 'f');

        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook); // toString()
        System.out.println(authors.length);
        System.out.println(testeBook.getAuthorNames());
    
    }
}
