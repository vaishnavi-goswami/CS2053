// Lab10
import java.io.*;
import java.net.*;

class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ChatClient(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Connected to Server.");

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void startChat() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msgFromServer, msgToServer;

        while (true) {
            System.out.print("You: ");
            msgToServer = console.readLine();
            out.println(msgToServer);

            if (msgToServer.equalsIgnoreCase("exit")) break;

            msgFromServer = in.readLine();
            System.out.println("Server: " + msgFromServer);
        }

        closeConnection();
    }

    private void closeConnection() throws IOException {
        socket.close();
        System.out.println("Chat ended.");
    }

    public static void main(String[] args) throws IOException {
        ChatClient client = new ChatClient("localhost", 5000);
        client.startChat();
    }
}
