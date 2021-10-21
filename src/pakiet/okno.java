package pakiet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.filechooser.FileNameExtensionFilter;

public class okno extends javax.swing.JFrame 
{
    public okno() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wybierz = new javax.swing.JFileChooser();
        zapisz = new javax.swing.JFileChooser();
        przyciskwczytaj = new javax.swing.JButton();
        okno1 = new javax.swing.JLabel();
        okno2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSlider2 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        przyciskzapisz = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        zapisz.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikacja graficzna by Daniel Pianka");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        przyciskwczytaj.setBackground(new java.awt.Color(255, 255, 255));
        przyciskwczytaj.setText("Wczytaj");
        przyciskwczytaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                przyciskwczytajMouseClicked(evt);
            }
        });
        przyciskwczytaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskwczytajActionPerformed(evt);
            }
        });

        okno1.setBackground(new java.awt.Color(153, 153, 153));
        okno1.setToolTipText("");
        okno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        okno1.setOpaque(true);

        okno2.setBackground(new java.awt.Color(153, 153, 153));
        okno2.setOpaque(true);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Zdjęcie oryginalne");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Zdjęcie po edycji");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("               Jasność");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("               Kontrast");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BLACK&WHITE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("NEGATYW");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BINARYZACJA");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        przyciskzapisz.setBackground(new java.awt.Color(255, 255, 255));
        przyciskzapisz.setText("Zapisz");
        przyciskzapisz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                przyciskzapiszMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setText("USUŃ EFEKTY");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(przyciskwczytaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(przyciskzapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okno1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextField4)))
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okno2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(okno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okno1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(przyciskzapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(przyciskwczytaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskwczytajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskwczytajActionPerformed

    }//GEN-LAST:event_przyciskwczytajActionPerformed

    private void przyciskwczytajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_przyciskwczytajMouseClicked
       FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
       wybierz.addChoosableFileFilter(filter);
       int result = wybierz.showSaveDialog(przyciskwczytaj);
       if (result == JFileChooser.APPROVE_OPTION) 
       {
        File selectedFile = wybierz.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        String path2 = selectedFile.getAbsolutePath();
        okno1.setIcon(ResizeImage(path));
        okno2.setIcon(ResizeImage(path2));
        jSlider1.setValue(50);
        jSlider2.setValue(50);
       }
       else if(result == JFileChooser.CANCEL_OPTION)
       {
       JOptionPane.showMessageDialog(null, "Nie wybrano pliku!");
       }
    }//GEN-LAST:event_przyciskwczytajMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
  
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        if(okno2.getIcon()==null)
        { 
        jSlider1.setValue(50);
        }
        else
        {
        JSlider slider = (JSlider) evt.getSource();
        float value = slider.getValue();
        Image image = iconToImage(okno1.getIcon());
        BrightnessAndContrastControl(image, jSlider2.getValue(), value);
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        if(okno2.getIcon()==null)
        { 
        jSlider2.setValue(50);
        }
        else
        {
        JSlider slider = (JSlider) evt.getSource();
        float value = slider.getValue();
        Image image = iconToImage(okno1.getIcon());
        BrightnessAndContrastControl(image, value, jSlider1.getValue());
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(okno1.getIcon()==null)
        {
        JOptionPane.showMessageDialog(null, "Nie wybrano pliku!");
        }
        else
        {
        Image image = iconToImage(okno1.getIcon());
        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphic = bimage.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            for (int i = 0; i < bimage.getHeight(); i++) 
            {
                for (int j = 0; j < bimage.getWidth(); j++) 
                {
                    Color c = new Color(bimage.getRGB(j, i));
                    int red = (int) (c.getRed() * 0.299);
                    int green = (int) (c.getGreen() * 0.587);
                    int blue = (int) (c.getBlue() * 0.114);
                    Color newColor = new Color(
                    red + green + blue,
                    red + green + blue,
                    red + green + blue);
                    bimage.setRGB(j, i, newColor.getRGB());
                    Icon icon = new ImageIcon(bimage);
                    jSlider1.setValue(50);
                    jSlider2.setValue(50);
                    okno2.setIcon(icon);
                }
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        okno2.setIcon(okno1.getIcon());
        jSlider1.setValue(50);
        jSlider2.setValue(50);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(okno1.getIcon()==null)
        {
        JOptionPane.showMessageDialog(null, "Nie wybrano pliku!");
        }
        else
        {
        Image image = iconToImage(okno1.getIcon());
        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphic = bimage.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            for (int x = 0; x < bimage.getWidth(); x++) 
            {
            for (int y = 0; y < bimage.getHeight(); y++) 
                {
                int rgba = bimage.getRGB(x, y);
                Color col = new Color(rgba, true);
                col = new Color(255 - col.getRed(), 255 - col.getGreen(), 255 - col.getBlue());
                bimage.setRGB(x, y, col.getRGB());
                Icon icon = new ImageIcon(bimage);
                jSlider1.setValue(50);
                jSlider2.setValue(50);
                okno2.setIcon(icon);
                }
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(okno1.getIcon()==null)
        {
        JOptionPane.showMessageDialog(null, "Nie wybrano pliku!");
        }
        else
        {
        Image image = iconToImage(okno1.getIcon());
        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphic = bimage.createGraphics();
        graphic.drawImage(image, 0, 0, Color.WHITE, null);
        for(int i=0;i<okno1.getIcon().getIconWidth();i++)
           {
               for(int j=0;j<okno1.getIcon().getIconHeight();j++)
               {
                    int val = bimage.getRGB(i, j);
                    int r = (0x00ff0000 & val) >> 16;
                    int g = (0x0000ff00 & val) >> 8;
                    int b = (0x000000ff & val);
                    int m=(r+g+b);
                    if(m>=383)
                    {
                        bimage.setRGB(i, j, Color.WHITE.getRGB()); 
                    }
                    else{  
                        bimage.setRGB(i, j, 0);
                    }
                Icon icon = new ImageIcon(bimage);
                jSlider1.setValue(50);
                jSlider2.setValue(50);
                okno2.setIcon(icon);
               }
            }  
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void przyciskzapiszMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_przyciskzapiszMouseClicked
        if(okno1.getIcon()==null)
        {
            JOptionPane.showMessageDialog(null, "Nie wybrano pliku!");
        }
        else
        {
            Icon icon = okno2.getIcon();
            Image image = iconToImage(icon);
            BufferedImage buffered = (BufferedImage) image;
            try 
            {
            File outputfile = new File("saved.png");
            ImageIO.write(buffered, "png", outputfile);
            JOptionPane.showMessageDialog(null, "Plik saved.png zapisano do katalogu z projektem!");
            }           
            catch (IOException e) 
            {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_przyciskzapiszMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new okno().setVisible(true);
            }
        });
    }
    
      public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(okno1.getWidth(), okno1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
      
      public ImageIcon ResizeImage2(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(okno2.getWidth(), okno2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
      
      static Image iconToImage(Icon icon) 
    {
        if (icon instanceof ImageIcon) 
        {
        return ((ImageIcon)icon).getImage();
        } 
        else 
        {
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        GraphicsEnvironment ge = 
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        BufferedImage image = gc.createCompatibleImage(w, h);
        Graphics2D g = image.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        return image;
        }
    }
      
      public void BrightnessAndContrastControl(Image image, float brightness, float contrast) 
    {
        BufferedImage bi = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics bg = bi.getGraphics();
        if (bi.getColorModel().hasAlpha()) 
        {
        System.out.println("Image has got an alpha channel");
        }
        brightness = (brightness/50);
        bg.drawImage(image, 0, 0, null);
        bg.dispose();
        RescaleOp rescaleOp = new RescaleOp(brightness, contrast, null);
        rescaleOp.filter(bi, bi);
        image = bi;
        Icon icon = new ImageIcon(bi);
        okno2.setIcon(icon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel okno1;
    private javax.swing.JLabel okno2;
    private javax.swing.JButton przyciskwczytaj;
    private javax.swing.JButton przyciskzapisz;
    private javax.swing.JFileChooser wybierz;
    private javax.swing.JFileChooser zapisz;
    // End of variables declaration//GEN-END:variables
}
