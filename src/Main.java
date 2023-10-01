public class Main {
    public static void main(String... args) {
        Author author1 = new Author("Гавриил","Троепо́льский");
        Author author2 = new Author("Иван"," Тургенев");

        Books houseworkWhiteBimBlackEar = new Books("Белый бим черное ухо", author1, 1971);
        Books muMu = new Books("Му Му", author2, 1854);

        System.out.println(
               "Книга " + houseworkWhiteBimBlackEar.getTitle() + " " + "Автор: " + houseworkWhiteBimBlackEar.getAuthorFullName() + " " + "Год издания " + houseworkWhiteBimBlackEar.getPublicationYear());
        System.out.println(" ");
        System.out.println(
                "Книга " + muMu.getTitle() + " " + "Автор: " + muMu.getAuthorFullName() + " " + "Год издания " + muMu.getPublicationYear());
    }
}
