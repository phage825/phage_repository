// 入力された文字列と参照する文字列が等しいかどうかを確認するプログラム

// ****************************************
// import
// ****************************************
import javax.swing.JFrame;
import javax.swing.ImageIcon;

// ****************************************
// メインクラス
// ****************************************
class MatchWord extends JFrame {
    public static void main(String[] args) {
        MatchWord frame = new MatchWord("Title");
        frame.setVisible(true);
        
    }
    
    // ****************************************
    // コンストラクタ
    // ****************************************
    MatchWord(String title) {
        // タイトルセット
        setTitle(title);
        
        // ウィンドウの位置とサイズ
        setBounds(100, 100, 640, 480);
        
        // ****************************************
        // Icon
        // ****************************************
        ImageIcon icon = new ImageIcon("./MWIcon.png");
        setIconImage(icon.getImage());
        
        // 閉じるボタンで閉じるようにする
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
