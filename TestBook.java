public class TestBook {
    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        // Construct a book instance
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Test additional methods
        System.out.println("Author's name is: " + dummyBook.getAuthorName());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
        System.out.println("Author's gender is: " + dummyBook.getAuthorGender());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    }
}
