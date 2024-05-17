import java.io.ObjectInputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerOrigin {

    private static final int times = 2;

    public static void main(String arg[]) {
        String p = "owari";

        try {
            /* 通信の準備をする */
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            scanner.close();
            System.out.println("localhostの" + port + "番ポートで待機します");
            ServerSocket server = new ServerSocket(port); // ポート番号を指定し、クライアントとの接続の準備を行う
            System.out.println("a");
            Socket socket = server.accept(); // クライアントからの接続要求を待ち、
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            // 要求があればソケットを取得し接続を行う
            System.out.println("接続しました。相手の入力を待っています......");
            while (socket.getInputStream() != null) {

                if (socket.getInputStream() != null) {
                    XmasPresent present = (XmasPresent) ois.readObject();
                    int a = present.getContent();
                    int b = present.getSuuji2();
                    float answer;
                    if (present.Enzanshi.equals("+")) {
                        // System.out.println(present.getContent() + "getsuuji2" + present.getSuuji2());
                        answer = a + b;
                        System.out.println((answer));
                    } else if (present.Enzanshi.equals("-")) {
                        answer = a - b;
                        System.out.println(answer);
                    } else if (present.Enzanshi.equals("*")) {
                        answer = a * b;
                        System.out.println(answer);
                    } else if (present.Enzanshi.equals("/")) {
                        answer = (float) a / b;

                        System.out.println(answer);
                    }

                } else {
                    System.out.println("owari");
                }
            }
        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.out.println("ポート番号が不正、ポートが使用中です");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            System.out.println("ﾌﾝ...");
            throw new RuntimeException(e);

        }
    }
}