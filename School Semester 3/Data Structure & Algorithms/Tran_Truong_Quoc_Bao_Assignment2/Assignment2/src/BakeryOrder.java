// Full Name: Tran Truong Quoc Bao
// Student Number: N01625416

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class BakeryOrder extends JFrame implements ActionListener {
    private JTextField nameField, phoneField;
    private JComboBox<String> cakeType;
    private JRadioButton small, medium, large;
    private JCheckBox freeDelivery;
    private JButton saveButton, quitButton;
    private ButtonGroup sizeGroup;

    public BakeryOrder() {
        setTitle("Bakery Order System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Customer Name
        add(new JLabel("Customer Name:"));
        nameField = new JTextField();
        add(nameField);

        // Phone Number
        add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        add(phoneField);

        // Cake Type
        add(new JLabel("Cake Type:"));
        // This array holds the list of available cake types
        String[] cakes = {"Apple", "Carrot", "Cheesecake", "Chocolate", "Coffee", "Opera", "Tiramisu"};
        cakeType = new JComboBox<>(cakes);
        add(cakeType);

        // Cake Size
        add(new JLabel("Cake Size:"));
        JPanel sizePanel = new JPanel();
        small = new JRadioButton("Small");
        medium = new JRadioButton("Medium");
        large = new JRadioButton("Large");
        sizeGroup = new ButtonGroup();
        sizeGroup.add(small);
        sizeGroup.add(medium);
        sizeGroup.add(large);
        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);
        add(sizePanel);

        // Free Delivery
        add(new JLabel("Free Delivery Area:"));
        freeDelivery = new JCheckBox();
        add(freeDelivery);

        // Buttons
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        add(saveButton);

        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);
        add(quitButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            String name = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            // This condition checks if the name or phone number fields are left empty
            if (name.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name and Phone Number cannot be empty.");
                return;
            }

            String cake = (String) cakeType.getSelectedItem();
            String size = "";
            if (small.isSelected()) size = "Small";
            else if (medium.isSelected()) size = "Medium";
            else if (large.isSelected()) size = "Large";
            boolean delivery = freeDelivery.isSelected();

            // Try-with-resources automatically closes the resources once the try block is exited
            try (FileWriter fw = new FileWriter("Orders.txt", true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.printf("%s, %s, %s, %s, %b%n", name, phone, cake, size, delivery);
                JOptionPane.showMessageDialog(this, "Order Saved!");
                resetFields();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving order.");
            }
        } else if (e.getSource() == quitButton) {
            System.exit(0);
        }
    }

    /**
     * This method resets all input fields to their default states after saving an order.
     * It clears text fields, resets combo box selection, deselects radio buttons, and unchecks the checkbox.
     */
    private void resetFields() {
        nameField.setText("");
        phoneField.setText("");
        cakeType.setSelectedIndex(0);
        sizeGroup.clearSelection();
        freeDelivery.setSelected(false);
    }

    public static void main(String[] args) {
        new BakeryOrder();
    }
}
