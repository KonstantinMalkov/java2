package sample.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    public Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private ServerMain server;

    public ClientHandler(ServerMain server, Socket socket) {
        try {
            this.server = server;
            this.socket = socket;
            this.out = new DataOutputStream(socket.getOutputStream());
            this.in = new DataInputStream(socket.getInputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){
                            String str = in.readUTF();
                            //out.writeUTF(str);
                            if (str.equals("/end")){
                                out.writeUTF("/serverClosed");
                                break;
                            }
                            System.out.println("Клиент: " + str);
                            server.broadcastMsg(str);
                        }
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String str){
        try {
            out.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
