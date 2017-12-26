// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    class MyBook extends Book{
        private int realPrice;
        MyBook(String title, String author, int price){
            super(title, author);
            this.realPrice = price;
        }
        void display(){
            System.out.println("Title: "+ title + "\nAuthor: "+ author + "\nPrice: " + this.realPrice);
        }
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class
