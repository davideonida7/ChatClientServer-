public class Main {
    public static void main(String[] args) {
        // Avvio del server
        Thread serverThread = new Thread(() -> {
            ChatServer server = new ChatServer();
            server.start();
        });
        serverThread.start();

        // Avvio del client
        Thread clientThread = new Thread(() -> {
            ChatClient client = new ChatClient();
            client.start();
        });
        clientThread.start();
    }
}
