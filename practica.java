import javax.swing.*;
import java.awt.*;

public class WordCounter extends JFrame {
   private JTextArea textArea;
   private JButton countButton;
   private JLabel wordCountLabel;

   public WordCounter() {
       setLayout(new FlowLayout());
       setSize(300, 200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       textArea = new JTextArea(5, 20);
       countButton = new JButton("Count Words");
       wordCountLabel = new JLabel("Word Count: 0");

       countButton.addActionListener(e -> {
           String text = textArea.getText();
           String[] words = text.split("\\s+");
           wordCountLabel.setText("Word Count: " + words.length);
       });

       add(textArea);
       add(countButton);
       add(wordCountLabel);
   }

   public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> new WordCounter().setVisible(true));
   }
}
