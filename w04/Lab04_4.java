// Thadchnon Maide 670510662

import java.util.Scanner;

public class Lab04_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Encode encoder = new Encode();
        String input = sc.next().toLowerCase();
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i += encoder.getChunkSize()) {
            boolean isPartialChunk = encoder.isPartialChunk(i, inputLength);
            String chunk = isPartialChunk
                    ? input.substring(i, inputLength)
                    : input.substring(i, i + encoder.getChunkSize());

            encoder.encodeChunk(chunk);
        }

        encoder.displayEncodedString();
    }
}

class Encode {

    private final int CHUNK_SIZE = 3;
    private final int ASCII_WRAP_LIMIT = 122;
    private final int ASCII_WRAP_START = 96;
    private String encodedString = "";

    public int getChunkSize() {
        return CHUNK_SIZE;
    }

    public boolean isPartialChunk(int currentIndex, int totalLength) {
        return (totalLength % CHUNK_SIZE != 0 && currentIndex + CHUNK_SIZE > totalLength);
    }

    public void encodeChunk(String chunk) {
        for (char c : chunk.toCharArray()) {
            int encodedAscii = c + CHUNK_SIZE;

            if (encodedAscii > ASCII_WRAP_LIMIT) {
                encodedAscii = (encodedAscii % ASCII_WRAP_LIMIT) + ASCII_WRAP_START;
            }

            encodedString += Character.toUpperCase((char) encodedAscii);
        }

        encodedString += "#".repeat(CHUNK_SIZE - chunk.length());
        encodedString += " ";
    }

    public void displayEncodedString() {
        System.out.println(encodedString.toString().trim());
    }
}
