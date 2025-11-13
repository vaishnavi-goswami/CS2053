// Lab10
import java.io.*;
import java.net.*;

class ChatServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ChatServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started... Waiting for client...");
        socket = serverSocket.accept();
        System.out.println("Client connected!");

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void startChat() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msgFromClient, msgToClient;

        while (true) {
            msgFromClient = in.readLine();
            if (msgFromClient == null || msgFromClient.equalsIgnoreCase("exit")) {
                System.out.println("Client disconnected.");
                break;
            }
            System.out.println("Client: " + msgFromClient);

            System.out.print("You: ");
            msgToClient = console.readLine();
            out.println(msgToClient);
        }

        closeConnection();
    }

    private void closeConnection() throws IOException {
        socket.close();
        serverSocket.close();
        System.out.println("Chat ended.");
    }

    public static void main(String[] args) throws IOException {
        ChatServer server = new ChatServer(5000);
        server.startChat();
    }
}
