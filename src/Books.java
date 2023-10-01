
public class Books {
        private final String title;
        private final Author author;
        private int publicationYear;

        public Books(String title, Author author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public String getAuthorFullName() {
            return author.getFirstName() + " " + author.getLastName();
        }
    }


