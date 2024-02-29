package AdvancedTopics.Ejemplos.Ovalo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import AdvancedTopics.Ejemplos.TextAreaFrame;

public class SliderFrame extends JFrame {
    private final JSlider diameterjSlider;
    private final OvalPanel myPanel;

    public SliderFrame() {
        super("Slider Demo");

        myPanel = new OvalPanel();
        myPanel.setBackground(Color.BLACK);

        diameterjSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        diameterjSlider.setMajorTickSpacing(10);
        diameterjSlider.setPaintTicks(true);

        diameterjSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                myPanel.setDiameter(diameterjSlider.getValue());
            }
        });
        add(diameterjSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SliderFrame panelFrame = new SliderFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(600, 400);
        panelFrame.setVisible(true);
        panelFrame.setResizable(false);
    }

}
