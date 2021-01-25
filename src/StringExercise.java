public class StringExercise {
    // method
    public static String createString() {
        String str = "i'm in java practice";
        return str;
    }

    public static void main(String[] args) {
        String str = createString();            
        System.out.println(str);

        // Operator penggabungan variabel ke bentuk string
        String str2 = "Hai, ";
        System.out.println(str2 + str);

        // string baru untuk gabung str2 + str
        String str3 = str2 + str;

        // to Upper case
        System.out.println(str3.toUpperCase());

        // to Lower Case
        System.out.println(str3.toLowerCase());
    }
}
