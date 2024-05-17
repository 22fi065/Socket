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

            System.out.println("終了したい場合はowariと入力してください、はい/いいえを入力");

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            while (p != scanner.next()) {
                System.out.println("一つ目の数字を入力");

                XmasPresent present = new XmasPresent();
                present.setContent(scanner.nextInt());
                System.out.println("二つ目の数字を入力");

                int suuji2 = scanner.nextInt();
                present.setSuuji2(suuji2);

                System.out.println("演算子の入力");

                present.setEnzanshi(scanner.next());
                System.out.println("入力が完了しました、serverを確認してください。再計算をする場合は数字を入力してください");
                oos.writeObject(present);
                oos.flush();
                // このタイミングで送信してそう？
                // oos.close();

            }
            oos.close();
            scanner.close();
            socket.close();
        } catch (BindException be) {
            be.printStackTrace();
        } catch (Exception e) {
            System.out.println("gdfhjil");

        }
    }
}
