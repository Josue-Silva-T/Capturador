package AdvancedTopics.Ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextAreaFrame extends JFrame {
    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton copyButton;

    public TextAreaFrame() {
        super("TextArea Demo");
        Box box = Box.createHorizontalBox();
        String demo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam lectus mi, ultricies nec augue quis, \naliquet ornare purus. Cras in diam varius eros semper dictum. Donec sed sagittis est. Nam convallis dignissim tempus. Pellentesque ac est dui. In quis orci sed velit bibendum \nsagittis non eget magna. Morbi lectus nisl, tincidunt ac feugiat a, ultrices nec mi. Vestibulum pellentesque quam mauris, in gravida nisi vestibulum quis. Vestibulum dignissim mauris et nibh congue lobortis. Suspendisse non rutrum nunc,\n vel ornare metus. Curabitur dictum volutpat euismod. Nulla quis tellus a tellus rutrum placerat.\n Integer pellentesque aliquam consequat. Ut quis vehicula leo. Vivamus pellentesque at arcu id interdum.";

        textArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(textArea1));
        copyButton = new JButton("Copiar");
        box.add(copyButton);
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                textArea2.setText(textArea1.getSelectedText());
            }
        });

        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));
        add(box);

    }

    public static void main(String[] args) {
        TextAreaFrame panelFrame = new TextAreaFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(600, 400);
        panelFrame.setVisible(true);
        panelFrame.setResizable(false);
    }

}
