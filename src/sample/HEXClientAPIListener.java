package sample;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javafx.scene.control.TextArea;

class HEXClientAPIListener {
    private ServerSocket serverSocket = new ServerSocket(5000);

    HEXClientAPIListener(TextArea consoleTextArea) throws IOException {
        Runnable runnable = () -> {
            while (true) {
                Socket socket = null;
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    InputStream stream = socket.getInputStream();
                    Scanner reader = new Scanner(stream);

                    while (reader.hasNextLine()) {
                        consoleTextArea.appendText(reader.nextLine() + "\n");
                        System.out.println(reader.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
                consoleTextArea.appendText("\n");
            }
        };
        new Thread(runnable).start();
    }
}
