public class MainApp {
    public static void main(String[] args) {
        String[] arr = {
                "kenyan", "montez", "autumn", "barrow",
                "churly", "debase", "equate", "fuse",
                "infare", "meager", "offend", "kenyan",
                "debase", "loutish", "sinner", "tippet",
                "rogue", "barrow", "kenyan", "meager"
        };
        Words.uniqueWords(arr);
        Words.wordsCount(arr);
        PhoneBook phoneBook = new PhoneBook();
        try {
            phoneBook.add("Turner", "9051326590");
            phoneBook.add("Peters", "9090758151");
            phoneBook.add("Davis", "9962336452");
            phoneBook.add("Ford", "9993126123");
            phoneBook.add("Evans", "9000879056");
            phoneBook.add("Carson", "9096453156");
            phoneBook.add("Davis", "9080804750");
            phoneBook.add("Evans", "9016876150");
            phoneBook.add("Davis", "9959600753");
            // эта строка вызовет исключение:
//            phoneBook.add("Mitchell", "9096453156");
            System.out.println(phoneBook.get("Ford"));
        } catch (PhoneNumberDuplicateException e) {
            e.printStackTrace();
            System.out.println(e.getPhoneNumber());
        }
    }
}
