package gui;

import data.character.*;
import data.character.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The shitty launcher that I made in IntelliJ that's 'landlocked' by the gui editor.
 */
public class ShittyLauncher extends JFrame{
    private data.character.Character character = new Character("Snoop", new int[]{5,5,5,5,5,5,5});
    private JPanel container;
    private JTextField nameTextField;
    private JTextArea backstoryTextArea;
    private JComboBox<Race> raceComboBox;
    private JTextArea raceInfoTextArea;
    private JSpinner strengthSpinner;
    private JSpinner perceptionSpinner;
    private JSpinner enduranceSpinner;
    private JSpinner charismaSpinner;
    private JSpinner intelligenceSpinner;
    private JSpinner agilitySpinner;
    private JSpinner luckSpinner;
    private JPanel tagsCheckPanel;
    private JButton buildButton;
    private JComboBox<Character.Gender> genderComboBox;
    private JPanel traitsPanel;
    private JButton resetButton;

    private ArrayList<Skill> taggedSkills = new ArrayList<>();
    private ArrayList<Trait> traits = new ArrayList<>();

    private JSpinner[] statisticSpinners = new JSpinner[]{strengthSpinner,perceptionSpinner,enduranceSpinner,charismaSpinner,
    intelligenceSpinner,agilitySpinner,luckSpinner};
    private ArrayList<JCheckBox> tagCheckBoxes = new ArrayList<>();
    private ArrayList<JCheckBox> traitCheckBoxes = new ArrayList<>();

    public ShittyLauncher(){
        super("Fallout Character Generator");
        setSize(600,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(container);
        buildContents();
        setVisible(true);
        //pack();
    }

    /**
     * Builds out all the components in the thingy.
     */
    private void buildContents(){
        populateAllFields();
        buildTags();
        buildTraits();
        setUpBuildButton();
        setUpResetButton();
    }

    private void resetContents(){
        character = new Character("Snoop", new int[]{5,5,5,5,5,5,5});
        raceComboBox.setSelectedIndex(0);
        genderComboBox.setSelectedIndex(0);

        resetTraits();
        resetTags();
    }

    private void resetTags() {
        for (JCheckBox c : tagCheckBoxes){
            c.setSelected(false);
        }
        taggedSkills = new ArrayList<>();
    }

    private void resetTraits(){
        for (JCheckBox c : traitCheckBoxes){
            c.setSelected(false);
        }
        traits = new ArrayList<>();
    }

    /**
     * Values all fields on the GUI with preset data generated by the constructor in Character.
     */
    private void populateAllFields() {
        nameTextField.setText(character.getName());
        backstoryTextArea.setText(character.getBackstory());
        setUpRaceComboBox();
        setUpGenderComboBox();
        raceComboBox.setSelectedItem(character.getRace());
        raceInfoTextArea.setText(character.getRace().getDescription());
    }

    /**
     * Sets up the combo box so that it may be used by the user.
     */
    private void setUpRaceComboBox(){
        for (Race r : Race.values()){
            raceComboBox.addItem(r);
        }
        raceComboBox.addActionListener(e -> {
            updateRaceInfoTab((Race) raceComboBox.getSelectedItem());
            updateSpinners((Race) raceComboBox.getSelectedItem());
            buildTraits();
        });
    }

    private void setUpGenderComboBox(){
        genderComboBox.removeAllItems();
        for (Character.Gender g : Character.Gender.values()){
            genderComboBox.addItem(g);
        }
    }

    private void setUpBuildButton(){
        buildButton.addActionListener(e -> buildCharacter());
    }

    private void setUpResetButton(){
        resetButton.addActionListener(e -> resetContents());
    }

    /**
     * "Each function should perform one specific task"
     * Sets the raceInfoTextArea's text to that of the selected race's description.
     * @param selectedRace the race that the combobox was set to. This is inherently set by populateAllFields()
     */
    private void updateRaceInfoTab(Race selectedRace){
        raceInfoTextArea.setText(selectedRace.getDescription());
        raceInfoTextArea.setCaretPosition(0);
    }

    /**
     * Updates the statisticSpinners on the GUI when the race cbx is changed.
     * since this is basically illegible, allow me to clarify:
     * new SpinnerNumberModel(start, max, min, step);
     * start = this race's maximum score + minimum score / 2 (the average)
     * max = SPECIAL[0][stat index]
     * min = SPECIAL[1][stat index]
     * step = 1
     * @param r the race that the combobox was set to. This is inherently set by populateAllFields()
     */
    private void updateSpinners(Race r){
        strengthSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][0] + r.getSPECIAL()[1][0]) / 2, r.getSPECIAL()[0][0], r.getSPECIAL()[1][0], 1));
        perceptionSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][1] + r.getSPECIAL()[1][1]) / 2, r.getSPECIAL()[0][1], r.getSPECIAL()[1][1], 1));
        enduranceSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][2] + r.getSPECIAL()[1][2]) / 2, r.getSPECIAL()[0][2], r.getSPECIAL()[1][2], 1));
        charismaSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][3] + r.getSPECIAL()[1][3]) / 2, r.getSPECIAL()[0][3], r.getSPECIAL()[1][3], 1));
        intelligenceSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][4] + r.getSPECIAL()[1][4]) / 2, r.getSPECIAL()[0][4], r.getSPECIAL()[1][4], 1));
        agilitySpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][5] + r.getSPECIAL()[1][5]) / 2, r.getSPECIAL()[0][5], r.getSPECIAL()[1][5], 1));
        luckSpinner.setModel(new SpinnerNumberModel((r.getSPECIAL()[0][6] + r.getSPECIAL()[1][6]) / 2, r.getSPECIAL()[0][6], r.getSPECIAL()[1][6], 1));
    }

    /**
     * Creates all the checkboxes that correspond with the tag skills
     */
    private void buildTags(){
        tagsCheckPanel.setLayout(new GridLayout(Skill.values().length, 1));
        int i = 0;
        for (Skill s : Skill.values()){
            JCheckBox c = new JCheckBox(s.getName());
            c.addActionListener(e -> {
                //these are checked /after/ the box is updated, so if it looks weird, it's fine.
                if (!c.isSelected()) {
                    taggedSkills.remove(s);
                } else {
                    if (taggedSkills.size() >= 3) {
                        c.setSelected(false);
                    } else {
                        taggedSkills.add(s);
                    }
                }
            });
            tagsCheckPanel.add(c, (i / 2) - 1);
            tagCheckBoxes.add(c);
            i++;
        }
    }

    private void buildTraits(){
        traitsPanel.removeAll();
        traitsPanel.setLayout(new GridLayout(Trait.values().length, 1));
        int i = 0;
        for (Trait trait : Trait.values()){
            JCheckBox c = new JCheckBox(trait.toString());
            c.setToolTipText(trait.getShortHandDesc());
            c.addActionListener(e -> {
                //these are checked /after/ the box is updated, so it looks weird
                if (!c.isSelected()) {
                    traits.remove(trait);
                } else {
                    if (traits.size() >= 2) {
                        c.setSelected(false);
                    } else {
                        traits.add(trait);
                    }
                }
            });

            boolean doesExist = false;
            if (trait.getRaceRestrict() != null) {
                for (Race r : trait.getRaceRestrict()) {
                    if (r.equals(raceComboBox.getSelectedItem())) {
                        doesExist = true;
                    }
                }
            }
            if (!doesExist){
                traitsPanel.add(c, (i / 2) - 1);
                traitCheckBoxes.add(c);
                i++;
            }
        }
    }

    private void buildCharacter(){
        character.setName(nameTextField.getText());
        character.setBackstory(backstoryTextArea.getText());
        character.setRace((Race) raceComboBox.getSelectedItem());
        character.setSPECIAL(getSpecial());
        character.setTagSkills(taggedSkills);
        character.setGender((Character.Gender)genderComboBox.getSelectedItem());
        character.setTraits(traits);

        JTextArea t = new JTextArea(character.toString(),50,50);
        t.setFont(new Font("Consolas",Font.PLAIN,12));
        JOptionPane.showMessageDialog(this, t, "Viewing character", JOptionPane.INFORMATION_MESSAGE);
    }

    private int[] getSpecial(){
        int[] special = new int[7];
        for (int i = 0; i < 7;i++){
            special[i] = (int) statisticSpinners[i].getValue();
        }
        return special;
    }
}