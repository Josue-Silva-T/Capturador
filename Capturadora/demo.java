package AdvancedTopics.programa3;

import javax.swing.JFrame;
//Nombre, Edad, Peso, Altura, Indice de masa corporal
//opciones de buscar, nuevo, guardar, anterior, siguiente y indicador de pagina

public class demo extends JFrame {
   public static void main(String[] args) {
      GUI panelFrame = new GUI();
      panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      panelFrame.setSize(600, 400);
      panelFrame.setVisible(true);
      panelFrame.setResizable(false);

   }
}
