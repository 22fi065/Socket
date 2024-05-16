import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket;
import java.util.Scanner;

public class ClientOrigin {

    public static void main(String arg[]) {
        String p = "owari";

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            while (p != scanner.next()) {

                System.out.println("プレゼントの内容を入力してください(例:お菓子) ↓");
                String content = scanner.next();

                XmasPresent present = new XmasPresent();
                present.setContent(content);
                System.out.println("korosuzo");
                oos.writeObject(present);
                System.out.println("クソボケがーっ");

                oos.flush();
                // このタイミングで送信してそう？
                oos.close();

            }
            scanner.close();

            socket.close();
        } catch (BindException be) {
            be.printStackTrace();
        } catch (Exception e) {
            System.out.println("gdfhjil");

        }
    }
}
