// 入力された文字列と参照する文字列が等しいかどうかを確認するプログラム

// ****************************************
// import
// ****************************************
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ****************************************
// メインクラス
// ****************************************
class MatchWord extends JFrame {
    public static void main(String[] args) {
        MWindow frame = new MWindow("Title");
        frame.setVisible(true);
        
    }
}

class MWindow extends JFrame implements ActionListener{
    JTextField text1;
    JTextField text2;
    JLabel label;
    
    // ****************************************
    // コンストラクタ
    // ****************************************
    MWindow(String title) {
        // タイトルセット
        setTitle(title);
        
        // ウィンドウの位置とサイズ
        setBounds(100, 100, 640, 480);
        
        // 閉じるボタンで閉じるようにする
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // ****************************************
        // Icon
        // ****************************************
        ImageIcon icon = new ImageIcon("./MWIcon.png");
        setIconImage(icon.getImage());
        
        // ****************************************
        // パネルの設置
        // ****************************************
        // 説明文用のパネル
        JPanel description = new JPanel();
        
        JLabel descriptLabel = new JLabel();
        descriptLabel.setText("比較したい文字を入力してください。");
        descriptLabel.setPreferredSize(new Dimension(300, 60));
        descriptLabel.setHorizontalAlignment(JLabel.CENTER);
        descriptLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        
        description.add(descriptLabel);
        
        Container contentPane = getContentPane();
        contentPane.add(description, BorderLayout.NORTH);
        
        // ****************************************
        // テキストボックス1 (入力1) 
        // ****************************************
        JPanel textBox1 = new JPanel();
        
        text1 = new JTextField(30);
        text1.setPreferredSize(new Dimension(400, 25));
        text1.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 14));
        text1.setHorizontalAlignment(JTextField.LEFT);
        
        textBox1.add(text1);
        
        contentPane.add(textBox1, BorderLayout.WEST);
        
        // ****************************************
        // テキストボックス2 (入力2) 
        // ****************************************
        JPanel textBox2 = new JPanel();
        
        text2 = new JTextField(30);
        text2.setPreferredSize(new Dimension(400, 25));
        text2.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 14));
        text1.setHorizontalAlignment(JTextField.LEFT);
        
        textBox2.add(text2);
        
        contentPane.add(textBox2, BorderLayout.EAST);
        
        // ****************************************
        // ボタン
        // ****************************************
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("比較");
        button.addActionListener(this);
        
        buttonPanel.add(button);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
        
        // ****************************************
        // 結果表示
        // ****************************************
        label = new JLabel();
        
        label.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 20));
        label.setHorizontalAlignment(JTextField.CENTER);
        label.setPreferredSize(new Dimension(200, 100));
        contentPane.add(label, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e){
        String textLeft  = text1.getText();
        String textRight = text2.getText();
        
        if(textLeft.equals(textRight)) {
            label.setText("Match!");
        } else {
            label.setText("Unmatch...");
        }
    }
}
