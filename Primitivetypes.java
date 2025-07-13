// short: 2 bytes (16 bits) 
// long: 8 bytes (64 bits)
// int: 4 bytes (32 bits)
// byte: 1 byte (8 bits)
public class Primitivetypes {
    public static void main(String[] args) {
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("byte: " + Byte.BYTES + " byte");
    }
}