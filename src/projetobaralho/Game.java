
package projetobaralho;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Henrique
 */
public class Game extends javax.swing.JFrame {

    Baralho cartasCasa[] = Baralho.geraBaralho();
    Baralho cartasJogador[] = Baralho.geraBaralho();
    
    int somaCasa = 0, somaJogador = 0;
    int ganhaCasa = 0, ganhaJogador = 0;
    
    
    public Game() {
        initComponents();
        jogador1.setVisible(false);
        casa2.setVisible(false);
        jogador2.setVisible(false);
        casa3.setVisible(false);
        jogador3.setVisible(false);
        casa4.setVisible(false);
        casa5.setVisible(false);
        jogador4.setVisible(false);
        jogador5.setVisible(false);
        
    }

    public void puxarImagem1(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasCasa[0].getNaipes().getNaipes() + cartasCasa[0].getCartas().getNomeCartas() + ".png"));
        cartaCasa1.setIcon(figura);
    }
    
    public void puxarImagem2(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasJogador[0].getNaipes().getNaipes() + cartasJogador[0].getCartas().getNomeCartas() + ".png"));
        cartaJogador1.setIcon(figura);
    }
    
    public void puxarImagem3(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasCasa[1].getNaipes().getNaipes() + cartasCasa[1].getCartas().getNomeCartas() + ".png"));
        cartaCasa2.setIcon(figura);
    }
    
    public void puxarImagem4(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasJogador[1].getNaipes().getNaipes() + cartasJogador[1].getCartas().getNomeCartas() + ".png"));
        cartaJogador2.setIcon(figura);
    }
    
    public void puxarImagem5(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasCasa[2].getNaipes().getNaipes() + cartasCasa[2].getCartas().getNomeCartas() + ".png"));
        cartaCasa3.setIcon(figura);
    }
    
    public void puxarImagem6(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasJogador[2].getNaipes().getNaipes() + cartasJogador[2].getCartas().getNomeCartas() + ".png"));
        cartaJogador3.setIcon(figura);
    }
    
    public void puxarImagem7(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasCasa[3].getNaipes().getNaipes() + cartasCasa[3].getCartas().getNomeCartas() + ".png"));
        cartaCasa4.setIcon(figura);
    }
    
    public void puxarImagem8(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasJogador[3].getNaipes().getNaipes() + cartasJogador[3].getCartas().getNomeCartas() + ".png"));
        cartaJogador4.setIcon(figura);
    }
    
    public void puxarImagem9(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasCasa[4].getNaipes().getNaipes() + cartasCasa[4].getCartas().getNomeCartas() + ".png"));
        cartaCasa5.setIcon(figura);
    }
    
    public void puxarImagem10(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartasImagem\\" + cartasJogador[4].getNaipes().getNaipes() + cartasJogador[4].getCartas().getNomeCartas() + ".png"));
        cartaJogador5.setIcon(figura);
    }
    
    public void somaPontos1(){
        if(cartasCasa[0].getCartas().getPontosCartas() > cartasJogador[0].getCartas().getPontosCartas()){
            somaCasa = cartasCasa[0].getCartas().getPontosCartas() + cartasJogador[0].getCartas().getPontosCartas() + somaCasa;
            pontosCasa.setText(Integer.toString(somaCasa));
            ganhaCasa++;
            vitoriasCasa.setText(Integer.toString(ganhaCasa));
        }else if (cartasCasa[0].getCartas().getPontosCartas() < cartasJogador[0].getCartas().getPontosCartas()){
            somaJogador = cartasCasa[0].getCartas().getPontosCartas() + cartasJogador[0].getCartas().getPontosCartas() + somaJogador;
            pontosJogador.setText(Integer.toString(somaJogador));
            ganhaJogador++;
            vitoriasJogador.setText(Integer.toString(ganhaJogador));
        }
    }
    
    public void somaPontos2(){
        if(cartasCasa[1].getCartas().getPontosCartas() > cartasJogador[1].getCartas().getPontosCartas()){
            somaCasa = cartasCasa[1].getCartas().getPontosCartas() + cartasJogador[1].getCartas().getPontosCartas() + somaCasa;
            pontosCasa.setText(Integer.toString(somaCasa));
            ganhaCasa++;
            vitoriasCasa.setText(Integer.toString(ganhaCasa));
        }else if (cartasCasa[1].getCartas().getPontosCartas() < cartasJogador[1].getCartas().getPontosCartas()){
            somaJogador = cartasCasa[1].getCartas().getPontosCartas() + cartasJogador[1].getCartas().getPontosCartas() + somaJogador;
            pontosJogador.setText(Integer.toString(somaJogador));
            ganhaJogador++;
            vitoriasJogador.setText(Integer.toString(ganhaJogador));
        }
    }
    
    public void somaPontos3(){
        if(cartasCasa[2].getCartas().getPontosCartas() > cartasJogador[2].getCartas().getPontosCartas()){
            somaCasa = cartasCasa[2].getCartas().getPontosCartas() + cartasJogador[2].getCartas().getPontosCartas() + somaCasa;
            pontosCasa.setText(Integer.toString(somaCasa));
            ganhaCasa++;
            vitoriasCasa.setText(Integer.toString(ganhaCasa));
        }else if (cartasCasa[2].getCartas().getPontosCartas() < cartasJogador[2].getCartas().getPontosCartas()){
            somaJogador = cartasCasa[2].getCartas().getPontosCartas() + cartasJogador[2].getCartas().getPontosCartas() + somaJogador;
            pontosJogador.setText(Integer.toString(somaJogador));
            ganhaJogador++;
            vitoriasJogador.setText(Integer.toString(ganhaJogador));
        }
    }
    
    public void somaPontos4(){
        if(cartasCasa[3].getCartas().getPontosCartas() > cartasJogador[3].getCartas().getPontosCartas()){
            somaCasa = cartasCasa[3].getCartas().getPontosCartas() + cartasJogador[0].getCartas().getPontosCartas() + somaCasa;
            pontosCasa.setText(Integer.toString(somaCasa));
            ganhaCasa++;
            vitoriasCasa.setText(Integer.toString(ganhaCasa));
        }else if (cartasCasa[3].getCartas().getPontosCartas() < cartasJogador[3].getCartas().getPontosCartas()){
            somaJogador = cartasCasa[3].getCartas().getPontosCartas() + cartasJogador[3].getCartas().getPontosCartas() + somaJogador;
            pontosJogador.setText(Integer.toString(somaJogador));
            ganhaJogador++;
            vitoriasJogador.setText(Integer.toString(ganhaJogador));
        }
    }
    
    public void somaPontos5(){
        if(cartasCasa[4].getCartas().getPontosCartas() > cartasJogador[4].getCartas().getPontosCartas()){
            somaCasa = cartasCasa[4].getCartas().getPontosCartas() + cartasJogador[4].getCartas().getPontosCartas() + somaCasa;
            pontosCasa.setText(Integer.toString(somaCasa));
            ganhaCasa++;
            vitoriasCasa.setText(Integer.toString(ganhaCasa));
        }else if (cartasCasa[4].getCartas().getPontosCartas() < cartasJogador[4].getCartas().getPontosCartas()){
            somaJogador = cartasCasa[4].getCartas().getPontosCartas() + cartasJogador[4].getCartas().getPontosCartas() + somaJogador;
            pontosJogador.setText(Integer.toString(somaJogador));
            ganhaJogador++;
            vitoriasJogador.setText(Integer.toString(ganhaJogador));
        }
    }
    
    public void ganhador(){
        if (somaCasa > somaJogador) {
            vencedor.setText("A casa venceu!");
        } else if (somaCasa < somaJogador){
            vencedor.setText("O jogador venceu!");
        } else {
            vencedor.setText("Houve um empate!");
        }
        JOptionPane.showMessageDialog(null, vencedor);
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casa1 = new javax.swing.JButton();
        jogador1 = new javax.swing.JButton();
        casa2 = new javax.swing.JButton();
        jogador2 = new javax.swing.JButton();
        casa3 = new javax.swing.JButton();
        jogador3 = new javax.swing.JButton();
        casa5 = new javax.swing.JButton();
        casa4 = new javax.swing.JButton();
        jogador4 = new javax.swing.JButton();
        jogador5 = new javax.swing.JButton();
        cartaCasa1 = new javax.swing.JLabel();
        cartaCasa2 = new javax.swing.JLabel();
        cartaCasa3 = new javax.swing.JLabel();
        cartaCasa4 = new javax.swing.JLabel();
        cartaCasa5 = new javax.swing.JLabel();
        cartaJogador1 = new javax.swing.JLabel();
        cartaJogador2 = new javax.swing.JLabel();
        cartaJogador3 = new javax.swing.JLabel();
        cartaJogador4 = new javax.swing.JLabel();
        cartaJogador5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pontosCasa = new javax.swing.JLabel();
        pontosJogador = new javax.swing.JLabel();
        vencedor = new javax.swing.JLabel();
        vitoriasCasa = new javax.swing.JLabel();
        vitoriasJogador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        casa1.setText("Casa 1");
        casa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa1ActionPerformed(evt);
            }
        });

        jogador1.setText("Jogador 1");
        jogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogador1ActionPerformed(evt);
            }
        });

        casa2.setText("Casa 2");
        casa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa2ActionPerformed(evt);
            }
        });

        jogador2.setText("Jogador 2");
        jogador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogador2ActionPerformed(evt);
            }
        });

        casa3.setText("Casa 3");
        casa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa3ActionPerformed(evt);
            }
        });

        jogador3.setText("Jogador 3");
        jogador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogador3ActionPerformed(evt);
            }
        });

        casa5.setText("Casa 5");
        casa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa5ActionPerformed(evt);
            }
        });

        casa4.setText("Casa 4");
        casa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casa4ActionPerformed(evt);
            }
        });

        jogador4.setText("Jogador 4");
        jogador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogador4ActionPerformed(evt);
            }
        });

        jogador5.setText("Jogador 5");
        jogador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogador5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Casa:");

        jLabel12.setText("Jogador:");

        jLabel13.setText("Pontuação:");

        jLabel14.setText("Pontuação:");

        jLabel15.setText("Vitórias:");

        jLabel16.setText("Vitórias:");

        pontosCasa.setText("0");

        pontosJogador.setText("0");

        vitoriasCasa.setText("0");

        vitoriasJogador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartaJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogador1)
                    .addComponent(casa1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogador2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogador3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogador4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaJogador5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogador5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casa4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casa5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cartaCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(pontosJogador))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vitoriasCasa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vitoriasJogador))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(pontosCasa)))))))
                .addContainerGap(382, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vencedor)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa2)
                    .addComponent(casa3)
                    .addComponent(casa5)
                    .addComponent(casa4)
                    .addComponent(casa1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartaCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(pontosCasa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(vitoriasCasa))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartaJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaJogador5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vencedor)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(pontosJogador))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(vitoriasJogador))
                        .addGap(126, 126, 126)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogador1)
                    .addComponent(jogador2)
                    .addComponent(jogador3)
                    .addComponent(jogador4)
                    .addComponent(jogador5))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa1ActionPerformed
        puxarImagem1();
        jogador1.setVisible(true);
        casa1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_casa1ActionPerformed

    private void casa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa4ActionPerformed
        puxarImagem7();
        jogador4.setVisible(true);
        casa4.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_casa4ActionPerformed

    private void casa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa2ActionPerformed
        puxarImagem3();
        jogador2.setVisible(true);
        casa2.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_casa2ActionPerformed

    private void jogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogador1ActionPerformed
        puxarImagem2();
        casa2.setVisible(true);
        somaPontos1();
        jogador1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jogador1ActionPerformed

    private void jogador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogador2ActionPerformed
        casa3.setVisible(true);
        puxarImagem4();
        somaPontos2();
        jogador2.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jogador2ActionPerformed

    private void casa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa3ActionPerformed
        puxarImagem5();
        jogador3.setVisible(true);
        casa3.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_casa3ActionPerformed

    private void jogador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogador3ActionPerformed
        casa4.setVisible(true);
        puxarImagem6();
        somaPontos3();
        jogador3.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jogador3ActionPerformed

    private void jogador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogador4ActionPerformed
        puxarImagem8();
        casa5.setVisible(true);
        somaPontos4();
        jogador4.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jogador4ActionPerformed

    private void casa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casa5ActionPerformed
        puxarImagem9();
        jogador5.setVisible(true);
        casa5.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_casa5ActionPerformed

    private void jogador5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogador5ActionPerformed
        puxarImagem10();
        somaPontos5();
        ganhador();
        jogador5.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jogador5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartaCasa1;
    private javax.swing.JLabel cartaCasa2;
    private javax.swing.JLabel cartaCasa3;
    private javax.swing.JLabel cartaCasa4;
    private javax.swing.JLabel cartaCasa5;
    private javax.swing.JLabel cartaJogador1;
    private javax.swing.JLabel cartaJogador2;
    private javax.swing.JLabel cartaJogador3;
    private javax.swing.JLabel cartaJogador4;
    private javax.swing.JLabel cartaJogador5;
    private javax.swing.JButton casa1;
    private javax.swing.JButton casa2;
    private javax.swing.JButton casa3;
    private javax.swing.JButton casa4;
    private javax.swing.JButton casa5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JButton jogador1;
    private javax.swing.JButton jogador2;
    private javax.swing.JButton jogador3;
    private javax.swing.JButton jogador4;
    private javax.swing.JButton jogador5;
    private javax.swing.JLabel pontosCasa;
    private javax.swing.JLabel pontosJogador;
    private javax.swing.JLabel vencedor;
    private javax.swing.JLabel vitoriasCasa;
    private javax.swing.JLabel vitoriasJogador;
    // End of variables declaration//GEN-END:variables
}
