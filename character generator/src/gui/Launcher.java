package gui;

import javax.swing.*;
import java.awt.*;

/**
 * GUI to build characters in on the desktop.
 */
public class Launcher extends JFrame{
    //container to hold all items
    private JPanel container;
    //Card Layout "cards"
    private JPanel specialCard;
    private JPanel inventoryCard;
    private JPanel perkCard;
    private JPanel demographicsCard;
    private JPanel traitCard;
    private JPanel viewCard;
    //Card Layout "String ID's", per oracle docs.
    private final String DEMOGRAPHICSCARD = "Demographics";
    private final String SPECIALCARD = "S.P.E.C.I.A.L.";
    private final String TRAITCARD = "Traits";
    private final String PERKCARD = "Perks";
    private final String INVENTORYCARD = "Inventory";
    private final String VIEWCARD = "View Character";
    private final String CARD_IDS[] = {DEMOGRAPHICSCARD,SPECIALCARD,TRAITCARD,PERKCARD,INVENTORYCARD,VIEWCARD};
    //Card Components


    public Launcher(){
        super("Fallout Character Generator");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpGUI();
        setVisible(true);
    }

    private void setUpGUI(){
        setUpAllCards();
        container = new JPanel(new CardLayout());
        container.add(demographicsCard, CARD_IDS[0]);
        container.add(specialCard, CARD_IDS[1]);
        container.add(traitCard, CARD_IDS[2]);
        container.add(perkCard, CARD_IDS[3]);
        container.add(inventoryCard, CARD_IDS[4]);
        container.add(viewCard, CARD_IDS[5]);

        setCardLayoutTo(DEMOGRAPHICSCARD);
        this.add(container);
    }

    private void setCardLayoutTo(String toDisplay){
        CardLayout currentView = (CardLayout)(container.getLayout());
        currentView.show(container, toDisplay);
    }

    private void setUpAllCards(){
        setUpDemographicsCard();
        setUpSpecialCard();
        setUpTraitCard();
        setUpPerkCard();
        setUpInventoryCard();
        setUpViewCard();
    }

    private void setUpSpecialCard(){
        specialCard = new JPanel(new GridBagLayout());
        specialCard.add(new JLabel("I'm a cunt"), 0);
    }

    private void setUpDemographicsCard(){
        demographicsCard = new JPanel(new GridBagLayout());
        demographicsCard.add(new JLabel("Enter Your Name:"),
                setConstraints(0,0,1,1,GridBagConstraints.BOTH,1,1,GridBagConstraints.CENTER));
        demographicsCard.add(new JTextArea("name"),
                setConstraints(1,0,1,1,GridBagConstraints.BOTH,1,1,GridBagConstraints.CENTER));
    }

    private void setUpTraitCard(){
        traitCard = new JPanel(new GridBagLayout());
    }

    private void setUpPerkCard(){
        perkCard = new JPanel(new GridBagLayout());
    }

    private void setUpInventoryCard(){
        inventoryCard = new JPanel(new GridBagLayout());
    }

    private void setUpViewCard(){
        viewCard = new JPanel(new GridBagLayout());
    }

    private GridBagConstraints setConstraints(int gridX, int gridY, int gridW, int gridH, int fill, double weightX, double weightY, int anchor ){
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gridX;
        gbc.gridy = gridY;
        gbc.gridwidth = gridW;
        gbc.gridheight = gridH;
        gbc.anchor = anchor;
        gbc.fill = fill;
        gbc.weightx = weightX;
        gbc.weighty = weightY;

        return gbc;
    }
}
