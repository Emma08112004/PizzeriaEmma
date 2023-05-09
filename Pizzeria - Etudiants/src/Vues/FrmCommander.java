package Vues;

import Controlers.*;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FrmCommander extends JFrame{
    private JPanel pnlRoot;
    private JLabel lblTitre;
    private JLabel lblNumCommande;
    private JTextField txtNumCommande;
    private JLabel lblClients;
    private JComboBox cboClients;
    private JLabel lblLivreurs;
    private JTable tblPizzas;
    private JComboBox cboLivreurs;
    private JButton btnCommander;

    public FrmCommander() throws SQLException, ClassNotFoundException {
        this.setTitle("Commander");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        cnx = new ConnexionBDD();

        ConnexionBDD maCnx = new ConnexionBDD();

        // A vous de jouer
        try {

            String sql = "SELECT * FROM produits";


            ResultSet rs = maCnx.executerRequete(sql);


            while (rs.next()) {
                String nomProduit = rs.getString("nom_produit");
                System.out.println(nomProduit);
            }


            maCnx.fermerConnexion();

        } catch (SQLException ex) {
            System.err.println("Erreur lors de l'exécution de la requête : " + ex.getMessage());
        }

        btnCommander.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                OptionPane.showMessageDialog(null, "Votre commande a été enregistrée !");

            }
        });
    }
