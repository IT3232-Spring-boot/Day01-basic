package library_system;
public class LibApp {

    public static void main(String[] args) {

        String[] Pbook = {"Avengers", "Avengers2","Avengers3"};
        String[] Ebook = {"Avengers Endgame", "Captain America","Iron Man"};
        String[] Abook = {"Black Panther","Iron Man2"};

        Book s1 = new Book("Printed books",Pbook);
        Book s2 = new Book("E books",Ebook);
        Book s3 = new Book("Audio books",Abook);

        Book bookArray[] = new Book[3];

        bookArray[0] = s1;
        bookArray[1] = s2;
        bookArray[2] = s3;

        for(int i = 0; i < bookArray.length; i++) {

            System.out.println();
            System.out.print(bookArray[i].getName());
            System.out.print(" = ");
            for(int j = 0; j < bookArray[i].getAllBook().length; j++) {
                System.err.print(bookArray[i].getAllBook()[j] + ", ");
            } 
        }
    }
}