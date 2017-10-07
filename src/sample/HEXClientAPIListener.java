package sample;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

class HEXClientAPIListener {
    private ServerSocket serverSocket = new ServerSocket(5000);

    HEXClientAPIListener(TextArea consoleTextArea) throws IOException {
        Runnable runnable = () -> {
            while (true) {
                Socket socket;
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }

                InputStream stream;

                try {
                    stream = socket.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }

                Scanner reader = new Scanner(stream);

                Platform.runLater(() -> {
                    while (reader.hasNextLine()) {
                        consoleTextArea.appendText(reader.nextLine() + "\n");
                    }
                    consoleTextArea.appendText("\n");
                });
            }
        };
        new Thread(runnable).start();
    }
}
