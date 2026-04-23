public class Assignment2 {
    public static void main(String[] args) {
        TextReader reader = new TextReader();
        String text = reader.ReadFile();

        System.out.println();
        System.out.println("----- File content -----");
        System.out.println(text);
        System.out.println("----- End of file -----");
    }
}